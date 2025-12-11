package Lab7;

/**
 * Custom exception class for illegal Binary Search Tree operations
 * to help with the code being more seamless.
 * @author Bjork/Kyle Leahy
 */
public class TreeException extends Exception {
    public TreeException(String message) {
        super(message); // This allows for us to throw new exceptions for given cases
    }
}