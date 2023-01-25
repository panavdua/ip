/**
 * Class encapsulates an exception which occurs when the user wants to manipulate
 * his list using commands such as 'delete', 'mark' etc. but inputs an index number
 * which doesn't exist in the list.
 */
public class InvalidInputException extends Exception {

    public InvalidInputException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return getMessage();
    }


}
