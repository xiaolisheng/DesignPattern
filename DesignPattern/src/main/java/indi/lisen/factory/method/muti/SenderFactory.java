package indi.lisen.factory.method.muti;

public class SenderFactory {
	public Sender produceSms() {
		return new SmsSender();
	}

	public Sender produceMail() {
		return new MailSender();
	}
}
