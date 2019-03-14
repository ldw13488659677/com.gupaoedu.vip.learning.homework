package com.gupaoedu.vip.tom.pattern.factoryPattern.abstracfactory;

public class ITrafficToolsSHFactory implements ITrafficToolsFactory{
    @Override
    public IBcycle createBcycle() {
        return new BcycleFeiGe();
    }

    @Override
    public ICar createCar() {
        return new CarBaoMa();
    }
}
