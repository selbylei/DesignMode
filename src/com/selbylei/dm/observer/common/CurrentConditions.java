package com.selbylei.dm.observer.common;

/**
 * Created by selbylei on 17/3/12.
 * 公告表
 */
public class CurrentConditions {

    private float mTemperature;  //温度
    private float mPressure;//气压
    private float mHumidity;//湿度

    public void update(float mTemperature ,float mPressure ,float mHumidity){

        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;

        display();
    }


    public void display(){
        System.out.println("天气＝＝＝"+mTemperature);
        System.out.println("气压＝＝＝"+mPressure);
        System.out.println("湿度＝＝＝"+mHumidity);
    }



}
