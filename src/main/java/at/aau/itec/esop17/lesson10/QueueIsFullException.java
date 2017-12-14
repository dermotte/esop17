package at.aau.itec.esop17.lesson10;

public class QueueIsFullException extends Exception {
    private String message;
    public QueueIsFullException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
