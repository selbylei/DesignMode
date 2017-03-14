package com.selbylei.dm.observer.using;

/**
 * Created by selbylei on 17/3/12.
 */
public class ForcastConditions implements Observer {

    private float mTemperature;  //温度
    private float mPressure;//气压
    private float mHumidity;//湿度

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        //业务逻辑
        display();
    }

    private void display(){
        System.out.println("ForcastConditions数据更新为＝＝＝温度："+mTemperature+";气压："+mPressure+";湿度："+mHumidity);
    }
}
