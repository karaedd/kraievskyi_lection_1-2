package com.kraievskyi.lection1.service.figure.impl;

import com.kraievskyi.lection1.model.Figure;
import com.kraievskyi.lection1.service.figure.FigureService;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FigureServiceImpl implements FigureService {
    @Override
    public List<Figure> sortByVolume(List<Figure> listFigures) {
        return listFigures
                .stream()
                .sorted(Comparator.comparing(Figure::calculateVolume))
                .collect(Collectors.toList());
    }
}
