package com.xue.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * 属性文件工具类
 * Created by xnl on 2016/11/16.
 */
public final class PropertiesUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesUtils.class);

    /**
     * 根据传入的文件名加载属性文件
     * @param fileName 文件名
     * @return
     */
    public static Properties loadProperties(String fileName) {
        Properties properties = null;
        InputStream inputStream = null;
        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if (inputStream == null) {
                throw new FileNotFoundException(fileName + ", 文件未找到!");
            }
            properties = new Properties();
            properties.load(inputStream);
        } catch (IOException e) {
            LOGGER.error("属性文件加载失败", e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    LOGGER.error("关闭文件流失败", e);
                }
            }
        }
        return properties;
    }

    /**
     * 获取字符型属性（可指定默认值）
     * @param properties 属性文件
     * @param key 属性key
     * @param defaultValue 默认值
     * @return 属性key对应的值
     */
    public static String getString(Properties properties, String key, String defaultValue) {
        String value = defaultValue;
        if (properties.containsKey(key)) {
            value = properties.getProperty(key);
        }
        return value;
    }

    /**
     * 获取字符型属性（默认值为空字符串）
     * @param properties 属性文件
     * @param key 属性key
     * @return 属性key对应的值
     */
    public static String getString(Properties properties, String key) {
        return getString(properties, key, "");
    }

    /**
     * 获取数值int型属性（可指定默认值）
     * @param properties 属性文件
     * @param key 属性key
     * @param defaultValue 默认值
     * @return 属性key对应的值
     */
    public static int getInt(Properties properties, String key, int defaultValue) {
        int value = defaultValue;
        if (properties.containsKey(key)) {
            value = CastUtil.castToInt(properties.getProperty(key));
        }
        return value;
    }

    /**
     * 获取数值int型属性（默认值为0）
     * @param properties 属性文件
     * @param key 属性key
     * @return 属性key对应的值
     */
    public static int getInt(Properties properties, String key) {
        return getInt(properties, key, 0);
    }

    /**
     * 获取布尔型属性（可指定默认值）
     * @param properties 属性文件
     * @param key 属性key
     * @param defaultValue 默认值
     * @return 属性key对应的值
     */
    public static boolean getBoolean(Properties properties, String key, boolean defaultValue) {
        boolean value = defaultValue;
        if (properties.containsKey(key)) {
            value = CastUtil.castToBoolean(properties.getProperty(key));
        }
        return value;
    }

    /**
     * 获取布尔型属性（默认值为false）
     * @param properties 属性文件
     * @param key 属性key
     * @return 属性key对应的值
     */
    public static boolean getBoolean(Properties properties, String key) {
        return getBoolean(properties, key, false);
    }
}
