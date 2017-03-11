package com.selbylei.dm.strategy;

import com.selbylei.dm.strategy.duck.GreenHeadDuck;
import com.selbylei.dm.strategy.duck.ReadHeadDuck;
import com.selbylei.dm.strategy.flyBehavior.GoodFlyBehavior;

/**
 * Created by selbylei on 17/3/11.
 */
public class Main {

    public static void main(String[] args) {

        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();


        readHeadDuck.display();
        readHeadDuck.Fly();
        readHeadDuck.Quack();
        readHeadDuck.swim();
        readHeadDuck.setFlyBehavior(new GoodFlyBehavior());
        readHeadDuck.Fly();



        greenHeadDuck.display();
        greenHeadDuck.swim();
        greenHeadDuck.Fly();
        greenHeadDuck.Quack();


    }
}
