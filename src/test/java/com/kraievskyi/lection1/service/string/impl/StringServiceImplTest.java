package com.kraievskyi.lection1.service.string.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.kraievskyi.lection1.exception.CustomException;
import com.kraievskyi.lection1.service.string.StringService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.LinkedHashMap;
import java.util.List;

class StringServiceImplTest {

    private static StringService stringService;
    private static LinkedHashMap<String, Long> expected;
    private static List<String> list;

    @BeforeAll
    static void setUp() {
        stringService = new StringServiceImpl();
        list = List.of("#BWM #BMW", "#PRAY FOR UKRAINE", "#SAVE MARIUPOL",
                "#PRAY FOR UKRAINE", "#SAVE MARIUPOL", "#PRAY FOR UKRAINE", "#BWM #BMW",
                "#APPLE", "#BWM #BMW", "#SAVE MARIUPOL", "#BWM #BMW", "#BWM #BMW",
                "#SAVE MARIUPOL", "#APPLE", "#WAR");
        expected = new LinkedHashMap<>();
        expected.put("#BWM #BMW", 5L);
        expected.put("#SAVE MARIUPOL", 4L);
        expected.put("#PRAY FOR UKRAINE", 3L);
        expected.put("#APPLE", 2L);
        expected.put("#WAR", 1L);
    }

    @Test
    void validHashTegTest() {
        assertEquals(stringService.topFiveHashTeg(list), expected);
    }

    @Test
    void emptyListIstNot_Ok() {
        CustomException thrown = assertThrows(CustomException.class, () ->
                stringService.topFiveHashTeg(list), "CustomException was expected");
        assertEquals("List length must be grater than 0", thrown.getMessage());
    }
}
