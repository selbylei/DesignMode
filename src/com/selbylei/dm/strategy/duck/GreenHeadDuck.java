package com.selbylei.dm.strategy.duck;


import com.selbylei.dm.strategy.flyBehavior.GoodFlyBehavior;
import com.selbylei.dm.strategy.quackBehavior.GaGaQuackBehavior;

/**
 * Created by selbylei on 17/3/11.
 */
public class GreenHeadDuck extends Duck {


    public GreenHeadDuck(){
        mFlyBehavior = new GoodFlyBehavior();
        mQuackBehavior = new GaGaQuackBehavior();

    }

    @Override
    public void display() {
        System.out.println("GreenHeadDuck");
    }


}
