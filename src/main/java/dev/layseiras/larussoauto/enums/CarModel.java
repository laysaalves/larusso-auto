package dev.layseiras.larussoauto.enums;

public enum CarModel {
    ESPORTIVO(1),
    SEDAN(2),
    HATCHBACK(3),
    SUV(4),
    PICAPE(5),
    CONVERSIVEL(6),
    COUPE(7),
    MINIVAN(8);

    private final int value;

    CarModel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
