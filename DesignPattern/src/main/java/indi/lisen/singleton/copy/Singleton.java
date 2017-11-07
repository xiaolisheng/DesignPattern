package indi.lisen.singleton.copy;

public class Singleton {
	private String text = "I am single";

	private Singleton() {
	}

	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}

	public static Singleton getSingleton() {
		return SingletonFactory.instance;
	}

	@Override
	public String toString() {
		return text;
	}
}
