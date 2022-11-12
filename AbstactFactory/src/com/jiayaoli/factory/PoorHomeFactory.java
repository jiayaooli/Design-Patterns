package com.jiayaoli.factory;

import com.jiayaoli.car.Audi;
import com.jiayaoli.car.Car;
import com.jiayaoli.house.Cabin;
import com.jiayaoli.house.House;
import com.jiayaoli.money.Money;
import com.jiayaoli.money.Yuan;

public class PoorHomeFactory implements AbstractHomeFactory{

    @Override
    public Car makeCar() {
        return new Audi();
    }

    @Override
    public House makeHouse() {
        return new Cabin();
    }

    @Override
    public Money makeMoney() {
        return new Yuan();
    }
}
