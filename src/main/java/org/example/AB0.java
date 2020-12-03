package org.example;

public enum AB0 {
    A("A antigens"),
    B("B antigens"),
    AB("A and B antigens"),
    O("No antigens");

    final String aB0groupName;

    AB0(String aB0groupName) {
        this.aB0groupName = aB0groupName;
    }

    @Override
    public String toString() {
        return aB0groupName;
    }
}
