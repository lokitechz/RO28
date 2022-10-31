package abstractsample;

public class Cat extends Animal {

	private String voice;

	public Cat() {
	}

	public Cat(String voice) {
		this.voice = voice;
	}

	public String getVoice() {
		return voice;
	}

	public void setVoice(String voice) {
		this.voice = voice;
	}

	@Override
	public void speak() {
		System.out.println(voice);
	}

}
