package com.selbylei.dm.strategy.flyBehavior;

/**
 * Created by selbylei on 17/3/11.
 */
public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我不会飞");
    }


}
