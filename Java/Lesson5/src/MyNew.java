import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNew {

	private final Scanner sc;
	private final List<News> listNews;

	public MyNew() {
		sc = new Scanner(System.in);
		listNews = new ArrayList<>();
	}

	public void question1() {
		loadMenu();
	}

	private void loadMenu() {
		while (true) {
			System.out.println("====================");
			System.out.println("Lựa chọn chức năng bạn muốn sử dụng");
			System.out.println("1. Insert news");
			System.out.println("2. View list news");
			System.out.println("3. Average rate");
			System.out.println("4. Exit");
			System.out.println("====================");
			System.out.print("Hãy nhập vào sự lựa chọn của bạn: ");

			int menuChoose = sc.nextInt();
			switch (menuChoose) {
				case 1:
					System.out.println("Nhập vào tiêu đề");
					String title = sc.next();
					System.out.println("Nhập vào ngày xuất bản");
					String publishDate = sc.next();
					System.out.println("Nhập vào tác giả");
					String author = sc.next();
					System.out.println("Nhập vào nội dung");
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
					break;

				case 2:
					for (News item : listNews) {
						item.display();
					}
					break;

				case 3:
					System.out.println("Đánh giá trung bình Rate");
					for (News item : listNews) {
						System.out.println("Title: " + item.getTitle() + " RateAVG: " + item.calculate());
					}
					break;

				case 4:
					System.exit(0);
					return;

				default:
					System.out.println("Lựa chọn của bạn không đúng vui lòng chọn lại");
					break;
			}
		}
	}

}
