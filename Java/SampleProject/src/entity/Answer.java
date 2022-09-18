package entity;

public class Answer {

	public int id;

	public String content;

	public Question question;

	public Boolean isCorrect;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Boolean getCorrect() {
		return isCorrect;
	}

	public void setCorrect(Boolean correct) {
		isCorrect = correct;
	}
}
