package bps.brijendra.testngp.configuration;

public enum BrowserType {
	//CHROME,MOZILA,IE
	
	 CHROME("chrome"),MOZILA("mozila"),IE("ie");
	private String s;

	BrowserType(final String s) {
		this.s = s;
	}

	public String getValue() {
	        return s;
	    }
	
	@Override
	public String toString() {
		return this.toString();
	}
	

}
