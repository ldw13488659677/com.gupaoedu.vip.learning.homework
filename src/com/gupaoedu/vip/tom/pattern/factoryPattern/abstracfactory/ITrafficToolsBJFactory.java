package com.gupaoedu.vip.tom.pattern.factoryPattern.abstracfactory;

public class ITrafficToolsBJFactory implements ITrafficToolsFactory{
    @Override
    public IBcycle createBcycle() {
        return new BcycleXinRi();
    }

    @Override
    public ICar createCar() {
        return new CarBenChi();
    }
}
