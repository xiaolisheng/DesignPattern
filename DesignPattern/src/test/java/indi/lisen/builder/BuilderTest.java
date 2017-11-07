package indi.lisen.builder;

import org.junit.Test;

public class BuilderTest {
	@Test
	public void test() {
		Builder builder = new Builder();
		builder.produceMailSender(10);
		builder.produceSmsSender(10);
	}
}
