package at.aau.itec.esop17.lesson10;

public class StringQueueItem implements QueueItem {
    String data;

    public StringQueueItem(String data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = (String) data;
    }
}
