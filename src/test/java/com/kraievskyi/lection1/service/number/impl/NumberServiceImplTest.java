package com.kraievskyi.lection1.service.number.impl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.kraievskyi.lection1.exception.CustomException;
import com.kraievskyi.lection1.service.number.NumberService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class NumberServiceImplTest {
    private static NumberService numberService;

    @BeforeAll
    static void setUp() {
        numberService = new NumberServiceImpl();
    }
    @Test
    void onlyPositiveTestIs_Ok() {
        int[] array = new int[] {-2, -4, -54, -2, -10, 0};
        int[] expected = new int[] {0};
        assertArrayEquals(numberService.onlyPositive(array), expected);
    }

    @Test
    void returnReverseOrderedArrayIs_Ok() {
        int[] array = new int[] {-2, 4, 54, 2, -10, 0};
        int[] expected = new int[] {54, 4, 2, 0};
        assertArrayEquals(numberService.onlyPositive(array), expected);
    }

    @Test
    void emptyArrayIsNot_Ok() {
        int[] array = new int[] {};
        CustomException thrown = assertThrows(CustomException.class, () ->
                numberService.onlyPositive(array), "CustomException was expected");
        assertEquals("Array length must be grater than 0", thrown.getMessage());
    }
}
