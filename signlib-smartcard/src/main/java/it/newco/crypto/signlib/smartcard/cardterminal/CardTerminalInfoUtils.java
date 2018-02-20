package it.newco.crypto.signlib.smartcard.cardterminal;

import java.util.ArrayList;
import java.util.List;

import javax.smartcardio.CardTerminal;
import javax.smartcardio.TerminalFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CardTerminalInfoUtils {

	private static final Logger logger = LoggerFactory.getLogger(CardTerminalInfoUtils.class);
	
	public static List<CardTerminalInfo> getCardTerminalsInfo() throws Exception{
		
		TerminalFactory factory = TerminalFactory.getDefault();
        
		List<CardTerminal> terminals = factory.terminals().list();
        
		logger.info("Lista lettori smart card collegati: " + terminals);

		List<CardTerminalInfo> terminalsInfo = new ArrayList<>();
		
		for(CardTerminal cardTerminal: terminals)
		{
			logger.info("Lettore: " + cardTerminal);
			
			terminalsInfo.add(new CardTerminalInfo(cardTerminal));	
		}
        
        return (terminalsInfo);
	}
}
