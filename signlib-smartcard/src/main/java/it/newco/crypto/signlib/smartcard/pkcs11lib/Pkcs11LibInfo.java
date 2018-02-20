package it.newco.crypto.signlib.smartcard.pkcs11lib;

public class Pkcs11LibInfo {

	private String manufacturer;
	private String ATR;
	private String winLib;
	private String winDir;
	private String linuxLib;
	private String linuxDir;
	private String macLib;
	private String macDir;
	
	public String getManufacturer() {
		return manufacturer;
	}
	
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getATR() {
		return ATR;
	}
	
	public void setATR(String aTR) {
		ATR = aTR;
	}
	
	public String getWinLib() {
		return winLib;
	}
	
	public void setWinLib(String winLib) {
		this.winLib = winLib;
	}
	
	public String getWinDir() {
		return winDir;
	}
	
	public void setWinDir(String winDir) {
		this.winDir = winDir;
	}
	
	public String getLinuxLib() {
		return linuxLib;
	}
	
	public void setLinuxLib(String linuxLib) {
		this.linuxLib = linuxLib;
	}
	
	public String getLinuxDir() {
		return linuxDir;
	}
	
	public void setLinuxDir(String linuxDir) {
		this.linuxDir = linuxDir;
	}
	
	public String getMacLib() {
		return macLib;
	}
	
	public void setMacLib(String macLib) {
		this.macLib = macLib;
	}
	
	public String getMacDir() {
		return macDir;
	}
	
	public void setMacDir(String macDir) {
		this.macDir = macDir;
	}
}
