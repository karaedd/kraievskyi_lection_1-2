package com.kraievskyi.lection1.service.number.impl;

import com.kraievskyi.lection1.service.number.NumberService;
import java.util.Arrays;

public class NumberServiceImpl implements NumberService {
    public int[] onlyPositive(int[] array) {
        return Arrays.stream(array)
                .map(i -> -i).sorted()
                .map(i -> -i)
                .filter(x -> x >= 0)
                .toArray();
    }
}
