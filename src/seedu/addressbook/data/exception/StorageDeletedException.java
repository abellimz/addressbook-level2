package seedu.addressbook.data.exception;

/**
 * Signals that some given data does not fulfill some constraints.
 */
public class StorageDeletedException extends Exception {
    /**
     * @param message should contain relevant information on the failed constraint(s)
     */
    public StorageDeletedException(String message) {
        super(message);
    }
}
