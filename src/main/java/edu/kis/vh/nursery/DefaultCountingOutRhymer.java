package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY_SIZE = -1;

    private final int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY_SIZE;

    /**
     * Zwraca rozmiar tablicy
     * @return rozmiar tablicy
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodanie lementu
     *
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Spradza czy tablica jest pusta
     * @return True/false
     */
    public boolean callCheck() {
        return total == EMPTY_SIZE;
    }

    /**
     * Sprawdza czy tablica jest pełna
     * @return True/false
     */
    public boolean isFull() {
        return total == (MAX_SIZE - 1);
    }

    /**
     * Sprawdza wartość
     * @return wartość
     */
    protected int peekAboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    /**
     * Zwraca kolejną liczbę
     * @return kolejną liczbę
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }
}