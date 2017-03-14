package com.selbylei.dm.observer.javaObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by selbylei on 17/3/14.
 */
public class CurrentConditions implements Observer {

    private float mTemperature;  //温度
    private float mPressure;//气压
    private float mHumidity;//湿度

    @Override
    public void update(Observable arg0, Object arg1) {

        this.mTemperature =( (WeatherData.Data)arg1).mTemperature;
        this.mPressure =( (WeatherData.Data)arg1).mPressure;
        this.mHumidity =( (WeatherData.Data)arg1).mHumidity;
        display();
    }

    public void display(){
        System.out.println("CurrentConditions数据更新为＝＝＝温度："+mTemperature+";气压："+mPressure+";湿度："+mHumidity);
    }
}
