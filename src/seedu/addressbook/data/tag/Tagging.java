package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	
	private final String PREFIX_ADDED = "+ ";
	private final String PREFIX_DELETED = "- ";
	
	private Person taggedPerson;
	private Tag tag;
	private boolean isDeleted;
	
	public Tagging(Person taggedPerson, Tag tag, boolean isDeleted){
		this.taggedPerson = taggedPerson;
		this.tag = tag;
		this.isDeleted = isDeleted;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		if (isDeleted) {
			builder.append(PREFIX_DELETED);
		} else {
			builder.append(PREFIX_ADDED);
		}
		builder.append(taggedPerson.toString());
		builder.append(" [");
		builder.append(tag.toString());
		builder.append("]");
		return builder.toString();
	}
}
