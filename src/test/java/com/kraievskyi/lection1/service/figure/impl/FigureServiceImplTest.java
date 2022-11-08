package com.kraievskyi.lection1.service.figure.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.kraievskyi.lection1.model.Ball;
import com.kraievskyi.lection1.model.Cube;
import com.kraievskyi.lection1.model.Figure;
import com.kraievskyi.lection1.model.Cylinder;
import com.kraievskyi.lection1.service.figure.FigureService;
import org.junit.jupiter.api.Test;
import java.util.List;

class FigureServiceImplTest {

    @Test
    void sortByVolume_Ok() {
        FigureService figureService = new FigureServiceImpl();
        List<Figure> figureList = List.of(new Ball(4), new Cube(3),
                new Cylinder(4, 3));
        Figure cube = new Cube(3);
        Figure cylinder = new Cylinder(4, 3);
        Figure ball = new Ball(4);
        cube.setVolume(27.0);
        cylinder.setVolume(150.79644737231007);
        ball.setVolume(268.082573106329);
        List<Figure> expected = List.of(cube, cylinder, ball);
        assertEquals(figureService.sortByVolume(figureList), expected);
    }
}