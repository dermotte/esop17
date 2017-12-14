package at.aau.itec.esop17.lesson10;

public class QueueIsEmptyException extends Exception {
    private String message;

    public String getMessage() {
        return message;
    }

    public QueueIsEmptyException(String message) {
        this.message = message;
    }
}
