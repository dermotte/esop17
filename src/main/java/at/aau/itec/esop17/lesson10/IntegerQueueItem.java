package at.aau.itec.esop17.lesson10;

public class IntegerQueueItem implements QueueItem {
    Integer data;

    public IntegerQueueItem(Integer data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = (Integer) data;
    }
}
