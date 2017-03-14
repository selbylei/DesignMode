package com.selbylei.dm.observer.javaObserver;


import java.util.Observable;

/**
 * Created by selbylei on 17/3/14.
 */
public class WeatherData extends Observable {

    private float mTemperature;  //温度
    private float mPressure;//气压
    private float mHumidity;//湿度

    public float getmTemperature() {
        return mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    public class Data {

        public float mTemperature;  //温度
        public float mPressure;//气压
        public float mHumidity;//湿度

        public Data(float mTemperature, float mPressure, float mHumidity) {
            this.mTemperature = mTemperature;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }
    }


    public void dataChange() {
        this.setChanged();
        this.notifyObservers(new Data(getmTemperature(), getmPressure(), getmHumidity()));
    }


    @Override
    public synchronized void addObserver(java.util.Observer o) {
        super.addObserver(o);
    }


    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }
}



