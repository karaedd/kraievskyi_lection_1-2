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
    private static int[] array;
    private static int[] emptyArray;
    private static int[] expected;

    @BeforeAll
    static void setUp() {
        numberService = new NumberServiceImpl();
        array = new int[] {-2, 4, 54, 2, -10, 0};
        expected = new int[] {54, 4, 2, 0};
        emptyArray = new int[] {};
    }
    @Test
    void onlyPositiveTestIs_Ok() {
        assertArrayEquals(numberService.onlyPositive(array), expected);
    }

    @Test
    void returnReverseOrderedArrayIs_Ok() {
        assertArrayEquals(numberService.onlyPositive(array), expected);
    }

    @Test
    void emptyArrayIsNot_Ok() {
        CustomException thrown = assertThrows(CustomException.class, () ->
                numberService.onlyPositive(emptyArray), "CustomException was expected");
        assertEquals("Array length must be grater than 0", thrown.getMessage());
    }
}
