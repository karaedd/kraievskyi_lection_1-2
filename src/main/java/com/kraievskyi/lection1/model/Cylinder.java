package com.kraievskyi.lection1.model;

import com.kraievskyi.lection1.exception.CustomException;
import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;

@EqualsAndHashCode
public class Cylinder extends Figure {
    private int height;
    private int radius;

    @SneakyThrows
    public Cylinder(int height, int radius) {
        if (radius <= 0 || height <= 0) {
            throw new CustomException("Radius or (and) height can't have size less or equal 0");
        }
        this.height = height;
        this.radius = radius;
    }

    @Override
    public int calculateVolume() {
        super.setVolume((int) (Math.PI * radius * (Math.pow(height, 2))));
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
