package com.kraievskyi.lection1.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Cube extends Figure {
    private int edge;

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
