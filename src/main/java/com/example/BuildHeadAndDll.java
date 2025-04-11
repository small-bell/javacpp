package com.example;

import org.bytedeco.javacpp.tools.Builder;

import java.io.File;

public class BuildHeadAndDll {
    public static void main(String[] args) throws Exception {
        System.setProperty("java.library.path", new File(".").getAbsolutePath() + File.pathSeparator + System.getProperty("java.library.path"));
        String[] builderArgs = {"com/example/HeadAndDllTest"};
        Builder.main(builderArgs);
    }
}
