package com.kraievskyi.lection1.model;

import com.kraievskyi.lection1.exception.CustomException;
import lombok.EqualsAndHashCode;
import lombok.SneakyThrows;

@EqualsAndHashCode
public class Cube extends Figure {
    private int edge;

    @SneakyThrows
    public Cube(int edge) {
        if (edge <= 0) {
            throw new CustomException("Edge can't have size less or equal 0");
        }
        this.edge = edge;
    }

    @Override
    public int calculateVolume() {
        super.setVolume((int) Math.pow(edge, 3));
        return super.getVolume();
    }

    @Override
    public String toString() {
        return "Cube{"
                + "volume="
                + super.getVolume()
                + '}';
    }
}
