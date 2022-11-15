package com.kraievskyi.lection1.model;

import lombok.Getter;
import lombok.Setter;

public abstract class Figure {
    @Setter
    @Getter
    private double volume;

    public abstract double calculateVolume();
}
