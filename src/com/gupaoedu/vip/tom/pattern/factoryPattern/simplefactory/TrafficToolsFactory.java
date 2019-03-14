package com.gupaoedu.vip.tom.pattern.factoryPattern.simplefactory;

import com.gupaoedu.vip.tom.pattern.factoryPattern.Bcycle;
import com.gupaoedu.vip.tom.pattern.factoryPattern.Car;
import com.gupaoedu.vip.tom.pattern.factoryPattern.ITrafficTools;

/*
* 工厂方法
* */
public class TrafficToolsFactory {

    public ITrafficTools create(String clazzName) {
        if ("bcycle".equals(clazzName)) {
            return new Bcycle();
        }else if ("car".equals(clazzName)){
            return new Car();
        }
        return null;
    }
    public ITrafficTools create1(String clazzName) {
        try {
            if (null!=clazzName&&!"".equals(clazzName)){
                return  (ITrafficTools)Class.forName(clazzName).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public ITrafficTools create2(Class<? extends ITrafficTools > clazz) {
        try {
            if (clazz!=null){
                return  (ITrafficTools)clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
