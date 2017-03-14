package com.selbylei.dm.observer.using;

import java.util.ArrayList;

/**
 * Created by selbylei on 17/3/12.
 */
public class WeatherDataStr implements Subject {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    ArrayList<Observer> observers = new ArrayList<>();
    private Observer currentObserver; //当前的观察

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver(Observer observer) {
        observer.update(mTemperature, mPressure, mHumidity);
    }


    public void dataChange() {
        if (observers != null && observers.size() > 0) {
            for (Observer observer : observers) {
                notifyObserver(observer);
            }
        }
    }

    //同步所有的被观察者
    public void syncAll(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    //设置当前的observer
    public void setCurrentObserver(Observer observer) {
        currentObserver = observer;
    }

    //通知某个观察者
    public void sync(Observer observer, float mTemperature, float mPressure, float mHumidity) {
        if (observers.contains(observer)) {
            observer.update(mTemperature, mPressure, mHumidity);
        } else {
            System.out.println("无法预测天气");
        }
    }

    public void syncNow(float mTemperature, float mPressure, float mHumidity) {
        sync(currentObserver, mTemperature, mPressure, mHumidity);
    }

}
