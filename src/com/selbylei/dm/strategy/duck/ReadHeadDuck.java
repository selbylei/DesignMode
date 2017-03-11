package com.selbylei.dm.strategy.duck;

import com.selbylei.dm.strategy.flyBehavior.NoFlyBehavior;
import com.selbylei.dm.strategy.quackBehavior.GaGaQuackBehavior;

/**
 * Created by selbylei on 17/3/11.
 */
public class ReadHeadDuck extends Duck {


    public ReadHeadDuck() {
        mFlyBehavior = new NoFlyBehavior();
        mQuackBehavior = new GaGaQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("ReadHeadDuck");
    }


}
