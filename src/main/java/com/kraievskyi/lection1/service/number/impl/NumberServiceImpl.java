package com.kraievskyi.lection1.service.number.impl;

import com.kraievskyi.lection1.exception.CustomException;
import com.kraievskyi.lection1.service.number.NumberService;
import java.util.Arrays;
import java.util.Comparator;
import lombok.SneakyThrows;

public class NumberServiceImpl implements NumberService {
    @SneakyThrows
    public int[] onlyPositive(int[] array) {
        if (array.length == 0) {
            throw new CustomException("Array length must be grater than 0");
        }
        return Arrays.stream(array)
                .filter(x -> x >= 0)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
