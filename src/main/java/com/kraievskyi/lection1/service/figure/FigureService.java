package com.kraievskyi.lection1.service.figure;

import com.kraievskyi.lection1.model.Figure;
import java.util.List;

public interface FigureService {
    List<Figure> sortByVolume(List<Figure> listFigures);
}
