package org.example;

public enum RH {
    POSITIVE("Has D antigens"),
    NEGATIVE("Has no D antigens");

    final String description;

    RH(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
