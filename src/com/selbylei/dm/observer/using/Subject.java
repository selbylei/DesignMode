package com.selbylei.dm.observer.using;

/**
 * Created by selbylei on 17/3/12.
 */
public interface Subject {

    //注册观察者
    public void registerObserver(Observer observer);

    //移除观察者
    public void removeObserver(Observer observer);

    //通知观察更新
    public void notifyObserver(Observer observer);




}
