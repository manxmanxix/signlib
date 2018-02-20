package it.newco.crypto.signlib.smartcard.pkcs11lib;

import java.util.Map;

public class Pkcs11LibUtils {

	private static Pkcs11LibUtils instance;
	private static Map<String, Pkcs11LibInfo> pkcs11LibsMap;
	
	private Pkcs11LibUtils() {
		
	}
	
	public String getPkcs11LibPath(String cardATR) {
		return "";
	}
}
