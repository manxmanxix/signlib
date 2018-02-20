package it.newco.crypto.signlib.smartcard.test;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.newco.crypto.signlib.smartcard.cardterminal.CardTerminalInfo;
import it.newco.crypto.signlib.smartcard.cardterminal.CardTerminalInfoUtils;

public class CardTerminalInfoTest {
	@BeforeClass
	public static void beforeClass() {
	}

	@AfterClass
	public static void afterClass() {
	}

	@Before
	public void beforeTest() {
	}

	@After
	public void afterTest() {
	}

	@Test
	public void testATR() {

		try {

			List<CardTerminalInfo> terminalsInfo = CardTerminalInfoUtils.getCardTerminalsInfo();

			for (CardTerminalInfo terminalInfo : terminalsInfo) {

				System.out.println("Nome Lettore: " + terminalInfo.getCardTerminalName());

				if (terminalInfo.isCardPresent()) {
					System.out.println("ATR carta: " + terminalInfo.getCardATR());
				} else {
					System.out.println("Carta non presente");
				}
			}

			String ATRJolly = "3bff1800ff8131fe55006b0209020001[0-9a-f]{2}01434e53[0-9a-f]{2}3180[0-9a-f]{2}";
			
			String ATR = "010.ATR=3bff1800ff8131fe55006b0209020001aa01434e53zz3180zz";
			
			System.out.println(ATR.matches(ATRJolly) ? "ATR MATCH !!!" : "ATR NO MATCH :(:(:(");
			
		} catch (Exception e) {
			e.printStackTrace();

			throw new RuntimeException();
		}
	}
}
