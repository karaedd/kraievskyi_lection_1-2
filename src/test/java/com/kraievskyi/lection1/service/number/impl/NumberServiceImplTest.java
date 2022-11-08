package com.kraievskyi.lection1.service.number.impl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.kraievskyi.lection1.service.number.NumberService;
import org.junit.jupiter.api.Test;

class NumberServiceImplTest {

    @Test
    void onlyPositiveTestIs_Ok() {
        int[] array = new int[]{-2, 4, 54, 2, -10, 0};
        int[] expected = new int[]{54, 4, 2, 0};
        NumberService numberService = new NumberServiceImpl();
        assertArrayEquals(numberService.onlyPositive(array), expected);
    }
}