package com.kraievskyi.lection1.service.string.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.LinkedHashMap;
import java.util.List;

class StringServiceImplTest {

    @Test
    void validHashTegTest() {
        List<String> list = List.of("#BWM #BMW", "#PRAY FOR UKRAINE", "#SAVE MARIUPOL",
                "#PRAY FOR UKRAINE", "#SAVE MARIUPOL", "#PRAY FOR UKRAINE", "#BWM #BMW", "#APPLE",
                "#BWM #BMW", "#SAVE MARIUPOL", "#BWM #BMW", "#BWM #BMW", "#SAVE MARIUPOL", "#APPLE",
                "#WAR");
        LinkedHashMap<String, Long> expected = new LinkedHashMap<>();
        expected.put("#BWM #BMW", 5L);
        expected.put("#SAVE MARIUPOL", 4L);
        expected.put("#PRAY FOR UKRAINE", 3L);
        expected.put("#APPLE", 2L);
        expected.put("#WAR", 1L);
        StringServiceImpl stringService = new StringServiceImpl();
        assertEquals(stringService.topFiveHashTeg(list), expected);
    }
}