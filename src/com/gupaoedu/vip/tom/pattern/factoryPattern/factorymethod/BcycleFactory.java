package com.gupaoedu.vip.tom.pattern.factoryPattern.factorymethod;

import com.gupaoedu.vip.tom.pattern.factoryPattern.Bcycle;
import com.gupaoedu.vip.tom.pattern.factoryPattern.ITrafficTools;

public class BcycleFactory implements ITrafficToolsFactory{
    @Override
    public ITrafficTools create() {
        return new Bcycle();
    }
}
