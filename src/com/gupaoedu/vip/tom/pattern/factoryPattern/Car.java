package com.gupaoedu.vip.tom.pattern.factoryPattern;

public class Car implements ITrafficTools {

    @Override
    public ITrafficTools buildingTools() {
        System.out.println("建造汽车");
        return  new Car();
    }
}
