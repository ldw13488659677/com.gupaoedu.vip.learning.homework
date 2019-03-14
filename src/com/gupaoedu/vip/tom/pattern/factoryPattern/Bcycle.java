package com.gupaoedu.vip.tom.pattern.factoryPattern;

public class Bcycle implements ITrafficTools {
    @Override
    public ITrafficTools buildingTools() {
        System.out.println("建造自行车");
        return  new Bcycle();
    }
}
