package com.jiayaoli.factory;

import com.jiayaoli.car.Benz;
import com.jiayaoli.car.Car;
import com.jiayaoli.house.Apartment;
import com.jiayaoli.house.House;
import com.jiayaoli.money.Doller;
import com.jiayaoli.money.Money;

public class RichHomeFactory implements AbstractHomeFactory{
    @Override
    public Car makeCar() {
        return new Benz();
    }

    @Override
    public House makeHouse() {
        return new Apartment();
    }

    @Override
    public Money makeMoney() {
        return new Doller();
    }
}
