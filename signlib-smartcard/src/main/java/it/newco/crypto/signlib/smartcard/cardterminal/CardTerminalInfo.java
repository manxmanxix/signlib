package it.newco.crypto.signlib.smartcard.cardterminal;

import javax.smartcardio.ATR;
import javax.smartcardio.Card;
import javax.smartcardio.CardException;
import javax.smartcardio.CardTerminal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import it.newco.crypto.signlib.smartcard.SmartCardException;

public class CardTerminalInfo {
	
	private static final Logger logger = LoggerFactory.getLogger(CardTerminalInfo.class);
	
	private CardTerminal cardTerminal;
	
	public CardTerminalInfo(CardTerminal cardTerminal) {
		
		this.cardTerminal = cardTerminal;
	}

	public boolean isCardPresent() {
		
		try {
			return cardTerminal.isCardPresent();
		} catch (CardException e) {
			logger.error("isCardPresent()->", e);
			
			throw new SmartCardException(e);
		}
	}
	
	public String getCardATR() {
		
		if(!isCardPresent()) {
			
			throw new SmartCardException("Tentativo di recupero ATR su un lettore in cui la carta non è inserita");
		}
		
		try {
			Card card = cardTerminal.connect("*");
			
			ATR atr = card.getATR();
		
			byte[] atrBytes = atr.getBytes();
				
			return (bytesToHex(atrBytes));
			
		} catch (CardException e) {
			
			logger.error("getCardATR()->", e);
			
			throw new SmartCardException(e);
		}
		
		
	}
	
	public String getCardTerminalName() {
		
		return (cardTerminal.toString());
	}
	
	private String bytesToHex(byte[] bytes) {
		
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            sb.append(String.format("%02x", bytes[i]));
        }

        return sb.toString();
    }
}
