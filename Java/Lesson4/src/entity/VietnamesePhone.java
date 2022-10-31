package entity;

import java.util.ArrayList;
import java.util.List;

public class VietnamesePhone extends Phone {

	private List<Contact> contacts;

	public VietnamesePhone() {
		contacts = new ArrayList<>();
	}

	@Override
	public void insertContact(String name, String phone) {
		// Khởi tạo đối tượng contact với param
		Contact contact = new Contact(name, phone);
		// Thêm 1 phần tử vào trong 1 danh sách
		contacts.add(contact);
	}

	@Override
	public void removeContact(String name) {
		contacts.removeIf(contact -> contact.getName().equals(name));
	}

	@Override
	public void updateContact(String name, String newPhone) {
		for (Contact contact : contacts) {
			if (contact.getName().equals(name)) {
				contact.setPhoneNumber(newPhone);
			}
		}
	}

	@Override
	public void searchContact(String name) {
		for (Contact contact : contacts) {
			if (contact.getName().equals(name)) {
				System.out.println(contact);
			}
		}
	}

	public void showContact() {
		for (Contact contact : contacts) {
			System.out.println(contact);
		}
	}

}
