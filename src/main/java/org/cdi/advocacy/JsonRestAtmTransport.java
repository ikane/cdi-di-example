package org.cdi.advocacy;

import javax.enterprise.inject.Alternative;

//import javax.enterprise.inject.Alternative;

//@Json //@Alternative
//@Transport(type=TransportType.JSON)
@Alternative
public class JsonRestAtmTransport implements ATMTransport {

	private int retries;

	public void setRetries(int retries) {
		this.retries = retries;
	}

	
	public void communicateWithBank(byte[] datapacket) {
		System.out.println("communicating with bank via JSON REST transport retries=" + retries);
	}

}
