package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom myBedroom = new Bedroom(
            "Yiğit's Bedroom",
            new Wall("North"),
            new Wall("South"),
            new Wall("East"),
            new Wall("West"),
            new Ceiling(4, PaintColor.WHITE),
            new Bed("Double-bed", 4, 1, 2, 2),
            new Lamp(LampType.LAVA, true, 6),
            new Wardrobe(3, 5, 45.5),
            new Carpet(5, 8, PaintColor.GREEN)
        );

        myBedroom.getCarpet().lying();
    }
}