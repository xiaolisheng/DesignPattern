package indi.lisen.factory.method.muti;

import org.junit.Test;

public class SenderFactoryTest {
	@Test
	public void test() {
		SenderFactory factory = new SenderFactory();
		Sender sender = factory.produceMail();
		sender.Send();
		Sender sender2 = factory.produceSms();
		sender2.Send();
	}
}
