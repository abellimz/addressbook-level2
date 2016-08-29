package seedu.addressbook.data.person;

public class PostalCode {
	private String value;
	
	public PostalCode(String postCodeString) {
		value = postCodeString;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
