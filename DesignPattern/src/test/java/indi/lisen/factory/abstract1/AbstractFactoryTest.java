package indi.lisen.factory.abstract1;

import org.junit.Test;

public class AbstractFactoryTest {

	@Test
	public void test() {
		Provider provider = new SmsFactory();
		provider.produce().Send();
		Provider provider1 = new MailFactory();
		provider1.produce().Send();
	}
}
