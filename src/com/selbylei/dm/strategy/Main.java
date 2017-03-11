package com.selbylei.dm.strategy;

/**
 * Created by selbylei on 17/3/11.
 */
public class Main {

    public static void main(String[] args) {
        ReadHeadDuck readHeadDuck = new ReadHeadDuck();
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();

        greenHeadDuck.display();
        greenHeadDuck.Quack();
        greenHeadDuck.swim();

        readHeadDuck.display();
        readHeadDuck.Quack();
        readHeadDuck.swim();

    }
}
