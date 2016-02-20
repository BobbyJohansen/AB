package org.alicebot.ab.utils;

import java.io.InputStream;

public class ResourceReader {
    public static InputStream readResource(String resourcePath){
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        return classloader.getResourceAsStream(resourcePath);
    }
}
