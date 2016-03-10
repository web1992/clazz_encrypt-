package com.web1992.launch;

import com.web1992.clazz.LaunchClazzLoafer;

import java.lang.reflect.Method;

/**
 * Created by erbao.wang on 2016/3/10.
 *
 * @desc
 */
public class LaunchMain {

    public static void main(String[] args) throws Exception {
        ClassLoader clazzLoader = new LaunchClazzLoafer();

        Class clazz = clazzLoader.loadClass("com.web1992.app.AppMain");

        Method mainMethod= clazz.getMethod("main",new Class[]{String[].class});

        mainMethod.invoke((Object)null,(Object)new String[]{"run with LaunchMain"});


    }

}
