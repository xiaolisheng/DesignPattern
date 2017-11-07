package indi.lisen.factory.abstract1;

public class SmsSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is sms sender");
	}

}
