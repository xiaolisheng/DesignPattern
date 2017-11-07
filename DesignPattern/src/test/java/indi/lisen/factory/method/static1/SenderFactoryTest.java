package indi.lisen.factory.method.static1;

import org.junit.Test;

public class SenderFactoryTest {
	@Test
	public void test() {
		Sender sender = SenderFactory.produceMail();
		sender.Send();
		Sender sender2 = SenderFactory.produceSms();
		sender2.Send();
	}
}
