package android.swapanpal.com.flashchatappwithfirebase;

/**
 * Model class for Main Chat Activity.
 */
public class InstantMessage {
    private String message;
    private String author;

    /**
     * Public Constructor with all field
     * @param message
     * @param author
     */
    public InstantMessage(String message, String author) {
        this.message = message;
        this.author = author;
    }

    /**
     * No argument constructor as per Firebase requirement.
     */
    public InstantMessage() {
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}
