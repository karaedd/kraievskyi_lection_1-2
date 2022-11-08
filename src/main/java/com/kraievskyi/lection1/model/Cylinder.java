package com.kraievskyi.lection1.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cylinder extends Figure {
    private int height;
    private int radius;

    @Override
    public double calculateVolume() {
        super.setVolume(Math.PI * radius * (Math.pow(height, 2)));
        return super.getVolume();
    }

    @Override
    public String toString() {
        return "Cylinder{"
                + "volume="
                + super.getVolume()
                + '}';
    }
}
