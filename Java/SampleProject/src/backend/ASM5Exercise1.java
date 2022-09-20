package backend;

import entity.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ASM5Exercise1 {

	// Biến lưu trữ đối tượng scanner để quét dữ liệu từ bàn phím
	private Scanner sc;

	// Biến lưu trữ danh sách tin tức
	private List<News> listNews;

	public ASM5Exercise1() {
		sc = new Scanner(System.in);
		listNews = new ArrayList<>();
	}

	public void question1() {
		loadMenu();
	}

	private void loadMenu() {
		while (true) {
			System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng===================");
			System.out.println("1. Insert news.");
			System.out.println("2. View list news.");
			System.out.println("3. Average rate.");
			System.out.println("4. Exit.");
			System.out.println("=======================================================================");
			int menuChoose = sc.nextInt();
			switch (menuChoose) {
				case 1:
					createNews();
					break;
				case 2:
					displayNews();
					break;
				case 3:
					calculateAvg();
					break;
				case 4:
					return;
				default:
					System.out.println("Alarm: Lựa chọn đúng số trên menu");
					break;
			}
		}
	}

	private void createNews() {
		System.out.println("Nhập vào Title");
		String title = sc.next();
		System.out.println("Nhập vào PublishDate");
		String publishDate = sc.next();
		System.out.println("Nhập vào Author");
		String author = sc.next();
		System.out.println("Nhập vào Content");
		String content = sc.next();
		System.out.println("Nhập vào đánh giá 1");
		int rate1 = sc.nextInt();
		System.out.println("Nhập vào đánh giá 2");
		int rate2 = sc.nextInt();
		System.out.println("Nhập vào đánh giá 3");
		int rate3 = sc.nextInt();
		int[] rates = {rate1, rate2, rate3};
		News news = new News(title, publishDate, author, content, rates);
		listNews.add(news);
	}

	private void displayNews() {
		for (News news : listNews) {
			news.display();
		}
	}

	private void calculateAvg() {
		System.out.println("Đánh giá trung bình Rate");
		for (News news1 : listNews) {
			System.out.println("Title: " + news1.getTitle() + " RateAVG: " + news1.calculate());
		}
	}

}



