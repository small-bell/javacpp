package com.example;

import org.bytedeco.javacpp.Loader;
import org.bytedeco.javacpp.annotation.Platform;
import org.bytedeco.javacpp.tools.Builder;
import org.bytedeco.javacpp.tools.Logger;

import java.io.File;

@Platform(include = "HeadAndDll.h", link = "HeadAndDll")
public class HeadAndDllTest {

    private static final Logger logger = Logger.create(com.example.MyExample.class);
    static {
        System.setProperty("java.library.path", new File(".").getAbsolutePath() + File.pathSeparator + System.getProperty("java.library.path"));
//        System.setProperty("org.bytedeco.javacpp.pathsFirst", "true");
        logger.info(System.getProperty("java.library.path"));
        Loader.load();
    }


    public static native int add(int a, int b);
    public static native void sayHello();
    public static void main(String[] args) throws Exception {
        System.out.println(add(1, 2));
        sayHello();
    }
}
