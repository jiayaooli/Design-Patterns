package com.jiayaoli;

import com.jiayaoli.factory.AbstractHomeFactory;
import com.jiayaoli.factory.FamilyType;
import com.jiayaoli.factory.HomeFactoryMaker;

public class Application {
    public static void main(String[] args) {
        Application a = new Application();
        a.BuildFamily(HomeFactoryMaker.makeHomeFactory(FamilyType.POOR));

    }
    public void BuildFamily(AbstractHomeFactory f) {
        System.out.println(f.makeCar().printCarName());
        System.out.println(f.makeHouse().printHouseName());
        System.out.println(f.makeMoney().printMoney());
    }
}
