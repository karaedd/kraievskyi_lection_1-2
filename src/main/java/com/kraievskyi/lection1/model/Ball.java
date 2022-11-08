package com.kraievskyi.lection1.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Ball extends Figure {
    private int radius;

    @Override
    public double calculateVolume() {
        super.setVolume((4.0 / 3.0) * Math.PI * (Math.pow(radius, 3)));
        return super.getVolume();
    }

    @Override
    public String toString() {
        return "Ball{"
                + "volume="
                + super.getVolume()
                + '}';
    }
}
