package com.selbylei.dm.strategy.duck;

import com.selbylei.dm.strategy.flyBehavior.FlyBehavior;
import com.selbylei.dm.strategy.quackBehavior.QuackBehavior;

/**
 * Created by selbylei on 17/3/11.
 * <p/>
 * 在这个类中Fly，Quack方法是使用接口实现的，这样的好处是特定的方法单独出来，是方法和使用者解藕
 * <p/>
 * <p/>
 * display 使用抽象类，每个子类具体实现这个抽象方法
 */
public abstract class Duck {

    protected FlyBehavior mFlyBehavior;

    protected QuackBehavior mQuackBehavior;

    public Duck() {

    }


    //飞行
    public void Fly() {
        mFlyBehavior.fly();
    }

    //吼叫
    public void Quack() {
        mQuackBehavior.quack();
    }

    //展示
    public abstract void display();

    //游泳
    public void swim() {
        System.out.println("~~im swim~~");
    }


    public void setFlyBehavior(FlyBehavior mFlyBehavior) {
        this.mFlyBehavior = mFlyBehavior;
    }

    public void setQuackBehavior(QuackBehavior mQuackBehavior) {
        this.mQuackBehavior = mQuackBehavior;
    }
}




