package com.clothes;

public enum Size {

    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M("Взрослый размер", 38),
    L("Взрослый размер", 40);

    private final String ageSize;
    private final int euroSize;

    Size (String ageSize, int euroSize) {
        this.ageSize = ageSize;
        this.euroSize = euroSize;
    }

    public String getDescription(Size size) {
        return switch (size) {
            case XXS -> "Детский размер, 32";
            case XS -> "Взрослый размер, 34";
            case S -> "Взрослый размер, 36";
            case M -> "Взрослый размер, 38";
            case L -> "Взрослый размер, 40";
        };
    }
}
