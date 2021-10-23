package gb.l2.part2.exceptions;

public class MyArrayDataException extends NumberFormatException {
    private int count;
    public MyArrayDataException(String message) {
        super(message);
    }
    public MyArrayDataException(String message, int count) {
        super(message);
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
}
