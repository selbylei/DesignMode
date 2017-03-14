package com.selbylei.dm.observer;


import com.selbylei.dm.observer.javaObserver.WeatherData;

import com.selbylei.dm.observer.javaObserver.ForcastConditions;
import com.selbylei.dm.observer.javaObserver.CurrentConditions;
import com.selbylei.dm.observer.using.WeatherDataStr;

/**
 * Created by selbylei on 17/3/12.
 */
public class Main {

    public static void main(String[] args) {

//        CurrentConditions currentConditions = new CurrentConditions();
//        WeatherData weatherData = new WeatherData(currentConditions);
//
//        weatherData.setData(30, 150, 40);


//-----------------自定义观察者模式-----------------------//
//        //定义被观察者
//        CurrentConditions currentConditions = new CurrentConditions();
//        ForcastConditions forcastConditions = new ForcastConditions();
//        //定义观察者
//        WeatherDataStr weatherDataStr = new WeatherDataStr();
//        //注册被观察者
//        weatherDataStr.registerObserver(currentConditions);
//        weatherDataStr.registerObserver(forcastConditions);
//
//
//        weatherDataStr.sync(forcastConditions, 100, 300, 20);
//
//        weatherDataStr.setCurrentObserver(currentConditions);
//
//        weatherDataStr.syncNow(100, 110, 334);
//
//        weatherDataStr.syncAll(1, 1, 1);



        //-----------------java内置观察者模式-----------------------//

        WeatherData weatherData = new WeatherData();
        CurrentConditions currentConditions = new CurrentConditions();
        ForcastConditions forcastConditions = new ForcastConditions();

        weatherData.addObserver(currentConditions);
        weatherData.addObserver(forcastConditions);

        weatherData.setData(100,100,100);

        weatherData.deleteObserver(forcastConditions);

        weatherData.setData(100,100,100);



    }
}
