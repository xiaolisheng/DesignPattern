package indi.lisen.factory.method.static1;

public class SenderFactory {
	public static Sender produceSms() {
		return new SmsSender();
	}

	public static Sender produceMail() {
		return new MailSender();
	}
}
