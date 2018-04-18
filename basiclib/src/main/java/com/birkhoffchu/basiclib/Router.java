package com.birkhoffchu.basiclib;

import java.util.HashMap;

/**
 * Created by jerry on 2018/4/13.
 */

public class Router {


    private static HashMap<String, Object> compents = new HashMap<>();

    public static void addService(String serviceName, Object serviceImp) {
        compents.put(serviceName, serviceImp);
    }

    public static Object getService(String serviceName) {
        return compents.get(serviceName);
    }


    public static void registerCompent(String className){
        try {
            Class<?> clz = Class.forName(className);
            Object o = clz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
