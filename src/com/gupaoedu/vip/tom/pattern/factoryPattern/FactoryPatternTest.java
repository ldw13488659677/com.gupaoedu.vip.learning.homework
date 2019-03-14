package com.gupaoedu.vip.tom.pattern.factoryPattern;

import com.gupaoedu.vip.tom.pattern.factoryPattern.abstracfactory.IBcycle;
import com.gupaoedu.vip.tom.pattern.factoryPattern.abstracfactory.ITrafficToolsFactory;
import com.gupaoedu.vip.tom.pattern.factoryPattern.abstracfactory.ITrafficToolsSHFactory;
import com.gupaoedu.vip.tom.pattern.factoryPattern.factorymethod.BcycleFactory;
import com.gupaoedu.vip.tom.pattern.factoryPattern.factorymethod.CarFactory;
import com.gupaoedu.vip.tom.pattern.factoryPattern.simplefactory.TrafficToolsFactory;

public class FactoryPatternTest {

    public static void main(String[] args) {
      /*  TrafficToolsFactory ttf=new TrafficToolsFactory();
        ITrafficTools tt=ttf.create("bcycle");
        tt.buildingTools();
        System.out.println(tt);*/

        /*TrafficToolsFactory ttf=new TrafficToolsFactory();
        ITrafficTools tt= ttf.create1("com.gupaoedu.vip.tom.pattern.factoryPattern.Car");
        tt.buildingTools();
        System.out.println(tt);*/

       /* TrafficToolsFactory ttf=new TrafficToolsFactory();
        ITrafficTools tt= ttf.create2(Bcycle.class);
        tt.buildingTools();
        System.out.println(tt);*/
//----------------------------------------------------------------------------------
       /* ITrafficToolsFactory itt=new BcycleFactory();
        ITrafficTools tt=itt.create();
        tt.buildingTools();
        ITrafficToolsFactory itt=new CarFactory();
        ITrafficTools tt=itt.create();
        tt.buildingTools();*/
//       ---------------------------------------------------------------------------------------

        ITrafficToolsFactory ittf=new ITrafficToolsSHFactory();
        IBcycle ib=ittf.createBcycle();
        ib.create();
    }
}
