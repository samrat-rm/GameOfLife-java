package org.example;

public class Address {


    public int row;
    public int column;

    public Address(int row, int column) {
        if (row < 0 || column < 0) {
            throw new IllegalArgumentException("Row and column must be greater than or equal to 0.");
        }
        this.row = row;
        this.column = column;
    }
}
