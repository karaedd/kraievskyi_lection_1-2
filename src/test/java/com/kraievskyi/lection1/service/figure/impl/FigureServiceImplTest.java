package com.kraievskyi.lection1.service.figure.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.kraievskyi.lection1.model.Ball;
import com.kraievskyi.lection1.model.Cube;
import com.kraievskyi.lection1.model.Figure;
import com.kraievskyi.lection1.model.Cylinder;
import com.kraievskyi.lection1.service.figure.FigureService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.List;

class FigureServiceImplTest {

    private static final Figure cube = new Cube(3);
    private static final Figure cylinder = new Cylinder(4, 3);
    private static final Figure ball = new Ball(4);
    private static FigureService figureService;
    private static List<Figure> figureList;
    private static List<Figure> expected;

    @BeforeAll
    static void setUp() {
        figureService = new FigureServiceImpl();
        figureList = List.of(new Ball(4), new Cube(3),
                new Cylinder(4, 3));
        cube.setVolume(27);
        expected = List.of(cube, cylinder, ball);
        cylinder.setVolume(150);
        ball.setVolume(268);
    }

    @Test
    void sortByVolume_Ok() {
        assertEquals(figureService.sortByVolume(figureList), expected);
    }
}
