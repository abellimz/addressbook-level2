package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    private static final int SIZE_ADDRESS_DETAIL = 4;
	private static final int DETAIL_INDEX_POSTAL_CODE = 3;
	private static final int DETAIL_INDEX_UNIT = 2;
	private static final int DETAIL_INDEX_STREET = 1;
	private static final int DETAIL_INDEX_BLOCK = 0;
	private static final String REGEX_ADDRESS_SPLIT = ", ";
	public static final String EXAMPLE = "123, some street";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in "
    		+ "the following format: a/BLOCK, STREET, UNIT, POSTAL_CODE";
    public static final String REGEX_ADDRESS_VALIDATION = ".+";

    private boolean isPrivate;
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (address == null) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] addressDetails = address.split(REGEX_ADDRESS_SPLIT);
        if (!isValidAddress(addressDetails)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        block = new Block(addressDetails[DETAIL_INDEX_BLOCK]);
        street = new Street(addressDetails[DETAIL_INDEX_STREET]);
        unit = new Unit(addressDetails[DETAIL_INDEX_UNIT]);
        postalCode = new PostalCode(addressDetails[DETAIL_INDEX_POSTAL_CODE]);
    }

    /**
     * Returns true if a given address detail array is a valid person address.
     */
    public static boolean isValidAddress(String[] details) {
        return details.length == SIZE_ADDRESS_DETAIL;
    }

    @Override
    public String toString() {
        return block.toString() + REGEX_ADDRESS_SPLIT 
        		+ street.toString() + REGEX_ADDRESS_SPLIT 
        		+ unit.toString() + REGEX_ADDRESS_SPLIT
        		+ postalCode.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.toString().equals(((Address) other).toString())); // state check
    }

    @Override
    public int hashCode() {
        return block.hashCode() + street.hashCode() 
        + unit.hashCode() + postalCode.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}