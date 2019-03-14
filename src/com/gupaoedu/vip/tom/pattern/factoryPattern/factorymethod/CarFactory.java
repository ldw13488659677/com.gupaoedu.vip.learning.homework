package com.gupaoedu.vip.tom.pattern.factoryPattern.factorymethod;

import com.gupaoedu.vip.tom.pattern.factoryPattern.Car;
import com.gupaoedu.vip.tom.pattern.factoryPattern.ITrafficTools;

public class CarFactory  implements ITrafficToolsFactory {
    @Override
    public ITrafficTools create() {
        return new Car();
    }
}
