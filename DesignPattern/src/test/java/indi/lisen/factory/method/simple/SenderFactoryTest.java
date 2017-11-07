package indi.lisen.factory.method.simple;

import org.junit.Test;

public class SenderFactoryTest {
	@Test
	public void test() {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produce("mail");
		sender.Send();
		Sender sender2 = factory.produce("sms");
		sender2.Send();
	}
}
