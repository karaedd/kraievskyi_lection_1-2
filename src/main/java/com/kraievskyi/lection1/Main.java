package com.kraievskyi.lection1;

import com.kraievskyi.lection1.model.Ball;
import com.kraievskyi.lection1.model.Cube;
import com.kraievskyi.lection1.model.Cylinder;
import com.kraievskyi.lection1.model.Figure;
import com.kraievskyi.lection1.service.figure.FigureService;
import com.kraievskyi.lection1.service.figure.impl.FigureServiceImpl;
import com.kraievskyi.lection1.service.number.NumberService;
import com.kraievskyi.lection1.service.number.impl.NumberServiceImpl;
import com.kraievskyi.lection1.service.string.StringService;
import com.kraievskyi.lection1.service.string.impl.StringServiceImpl;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NumberService numberService = new NumberServiceImpl();
        StringService stringService = new StringServiceImpl();
        FigureService figureService = new FigureServiceImpl();

        int[] array = new int[]{1,2,-3,4,0,-234,432,32,-1,2,1,99};
        List<String> list = List.of("#PRAY FOR UKRAINE", "#BWM #BMW", "#SAVE MARIUPOL",
                "#PRAY FOR UKRAINE", "#SAVE MARIUPOL", "#BWM #BMW", "#BWM #BMW", "#LOVE", "#WAR",
                "#SAVE MARIUPOL", "#PRAY FOR UKRAINE", "#APPLE", "#BWM #BMW", "#APPLE", "#LOVE",
                "#WAR", "LOVE", "LOVE", "LOVE");
        List<Figure> figureList = List.of(new Ball(4), new Cube(3),
                new Cylinder(4, 3));

        System.out.println(Arrays.toString(numberService.onlyPositive(array)));
        System.out.println(stringService.topFiveHashTeg(list));
        System.out.println(figureService.sortByVolume(figureList));
    }
}
