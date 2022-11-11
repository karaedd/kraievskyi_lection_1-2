package com.kraievskyi.lection1.model;

import com.kraievskyi.lection1.exception.CustomException;
import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;

@EqualsAndHashCode
public class Ball extends Figure {

    private int radius;

    @SneakyThrows
    public Ball(int radius) {
        if (radius <= 0) {
            throw new CustomException("Radius can't have size less or equal 0");
        }
        this.radius = radius;
    }

    @Override
    public int calculateVolume() {
        super.setVolume((int) ((4.0 / 3.0) * Math.PI * (Math.pow(radius, 3))));
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
