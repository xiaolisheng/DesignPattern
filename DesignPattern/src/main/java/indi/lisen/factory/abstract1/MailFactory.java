package indi.lisen.factory.abstract1;

public class MailFactory implements Provider {

	@Override
	public Sender produce() {
		return new MailSender();
	}

}
