package seedu.addressbook.data.person;

public class Unit {
	private String value;
	
	public Unit(String unitString) {
		value = unitString;
	}
	
	@Override
	public String toString() {
		return value;
	}
}
