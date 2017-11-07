package indi.lisen.factory.abstract1;

public class SmsFactory implements Provider {

	@Override
	public Sender produce() {
		return new SmsSender();
	}

}
