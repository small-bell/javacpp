package com.example;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.tools.Builder;
import org.bytedeco.javacpp.tools.Logger;

import java.io.File;

@Platform(include = "MyExample.h", library = "MyExample")
public class MyExample {
    private static final Logger logger = Logger.create(MyExample.class);
    static {
        System.setProperty("java.library.path", new File(".").getAbsolutePath() + File.pathSeparator + System.getProperty("java.library.path"));
        logger.info(System.getProperty("java.library.path"));
        Loader.load();
    }


    public static native int add(int a, int b);
    public static native void sayHello();
    public static void main(String[] args) throws Exception {
//        Class c = MyExample.class;
//        new Builder().classesOrPackages(c.getName()).build();
//        Loader.load(c);

        System.out.println(add(1, 2));
        sayHello();
    }
}
