package com.kraievskyi.lection1.service.string.impl;

import com.kraievskyi.lection1.service.string.StringService;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringServiceImpl implements StringService {
    public LinkedHashMap<String, Long> topFiveHashTeg(List<String> listHashTeg) {
        return listHashTeg.stream().filter(x -> x.contains("#"))
                .collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }
}
