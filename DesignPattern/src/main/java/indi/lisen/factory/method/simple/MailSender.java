package indi.lisen.factory.method.simple;

public class MailSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is mail sender");

	}

}
