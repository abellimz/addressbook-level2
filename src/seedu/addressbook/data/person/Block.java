package seedu.addressbook.data.person;

public class Block {
	private String value;
	
	public Block(String blockString) {
		value = blockString;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
