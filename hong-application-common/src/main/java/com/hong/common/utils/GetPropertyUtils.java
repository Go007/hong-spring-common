package com.hong.common.utils;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * <br>property属性文件读取工具类</br>
 */
public class GetPropertyUtils {

    private ResourceBundle resourceBundle;

    /**
     * @param propertiesHolder property文件名称
     */
    public GetPropertyUtils(String propertiesHolder){
        this.resourceBundle = ResourceBundle.getBundle(propertiesHolder, Locale.getDefault());;
    }

    public String getLabel(String key) {
        String label;
        try {
            label = new String(resourceBundle.getString(key).getBytes("ISO-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return label;
    }
}
