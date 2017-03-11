package com.selbylei.dm.strategy.flyBehavior;

/**
 * Created by selbylei on 17/3/11.
 */
public class BadFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("坏飞行");
    }


}
