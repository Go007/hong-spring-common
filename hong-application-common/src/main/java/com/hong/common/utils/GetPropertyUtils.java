package com.hong.common.utils;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <br>properties属性文件读取工具类，默认读取config.properties</br>
 */
public class GetPropertyUtils {

    private static ResourceBundle resourceBundle;

    public GetPropertyUtils(){
        this("config");
     }

    /**
     * @param propertiesHolder property文件名称
     */
    public GetPropertyUtils(String propertiesHolder){
        resourceBundle = ResourceBundle.getBundle(propertiesHolder, Locale.getDefault());;
    }

    public static String getLabel(String key) {
        String label;
        try {
            label = new String(resourceBundle.getString(key).getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return label;
    }
}
