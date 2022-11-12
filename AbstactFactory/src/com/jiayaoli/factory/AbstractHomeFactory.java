package com.jiayaoli.factory;

import com.jiayaoli.car.Car;
import com.jiayaoli.house.House;
import com.jiayaoli.money.Money;

public interface AbstractHomeFactory {
    Car makeCar();
    House makeHouse();
    Money makeMoney();
}
