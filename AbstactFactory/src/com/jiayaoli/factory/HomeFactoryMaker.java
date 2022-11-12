package com.jiayaoli.factory;

import com.jiayaoli.factory.AbstractHomeFactory;

public class HomeFactoryMaker {
    public static AbstractHomeFactory makeHomeFactory(FamilyType f) {
        if(f == FamilyType.POOR) return new PoorHomeFactory();
        if(f == FamilyType.RICH) return new RichHomeFactory();
        return null;
    }
}
