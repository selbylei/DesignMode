package com.selbylei.dm.observer.common;

import com.selbylei.dm.observer.common.CurrentConditions;

/**
 * Created by selbylei on 17/3/12.
 */
public class WeatherData {

    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return mTemperature;
    }

    public float getPressure() {
        return mPressure;
    }

    public float getHumidity() {
        return mHumidity;
    }

    public void dataChange() {
        currentConditions.update(getTemperature(), getPressure(), getHumidity());
    }

    //气象台更新数据
    public void setData(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }
}
