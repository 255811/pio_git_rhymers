package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY_SIZE = -1;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY_SIZE;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_SIZE;
    }

    public boolean isFull() {
        return total == (MAX_SIZE - 1);
    }

    protected int peekAboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }
}