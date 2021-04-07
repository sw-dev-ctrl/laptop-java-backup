package examples.spring_bean;

public class Hello {
	private static String words;

	public String getWords() {
		System.out.println("Hello.getWords()");
		return words;
	}

	public void setWords(String words) {
		System.out.println("Hello.setWords()");
		this.words = words;
	}
}
