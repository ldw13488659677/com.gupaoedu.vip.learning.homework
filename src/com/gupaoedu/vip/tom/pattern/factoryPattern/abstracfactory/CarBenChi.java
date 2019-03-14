package com.gupaoedu.vip.tom.pattern.factoryPattern.abstracfactory;

public class CarBenChi implements  ICar {
    @Override
    public void create() {
        System.out.println("生产奔驰汽车");
    }
}
