import entity.Account;
import entity.PositionName;

public class DemoSwitchCase {

	public static void main(String[] args) {
		Account account = new Account();
		account.id = 1;
		account.position.name = PositionName.DEV;


		switch (account.position.name){
			case DEV:
				break;

			case PM:
				break;

			case TEST:

		}

		int i = 1;
		switch (i) {
			case 0:
				System.out.println("A");
				break;

			case 1:
				System.out.println("B");
				break;

			default:
				System.out.println("Default");
				break;
		}

	}

}
