public class News implements INews {

	public static int incrementNumber = 0;

	private int id;

	private String title;

	private String publishDate;

	private String author;

	private String content;

	private Float averageRate;

	private int[] rate;

	public News() {
	}

	public News(String title, String publishDate, String author, String content, int[] rate) {
		incrementNumber++;
		this.id = incrementNumber;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int[] getRate() {
		return rate;
	}

	public void setRate(int[] rate) {
		this.rate = rate;
	}

	public Float getAverageRate() {
		return averageRate;
	}

	@Override
	public void display() {
		System.out.println("News [id = " + id + ", title=" + title + ", publishDate=" + publishDate + ", author=" + author + "]");
	}

	@Override
	public float calculate() {
		averageRate = (float) ((rate[0] + rate[1] + rate[2]) / 3);
		return averageRate;
	}

}
