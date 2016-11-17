package com.xue.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 数据转型工具类
 * Created by xnl on 2016/11/16.
 */
public final class CastUtil {

    /**
     * 转换成String类型（提供默认值）
     * @param obj
     * @param defaultValue
     * @return
     */
    public static String castToString(Object obj, String defaultValue) {
        String target = defaultValue;
        if (obj != null) {
            target = String.valueOf(obj);
        }
        return target;
    }

    /**
     * 转换成String类型（默认值为空字符串）
     * @param obj
     * @return
     */
    public static String castToString(Object obj) {
        return castToString(obj, "");
    }

    /**
     * 转换成int型（提供默认值）
     * @param obj
     * @param defaultValue
     * @return
     */
    public static int castToInt(Object obj, int defaultValue) {
        int target = defaultValue;
        if (obj != null) {
            String strValue = castToString(obj);
            if (StringUtils.isNotEmpty(strValue)) {
                try {
                    target = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    target = defaultValue;
                }
            }
        }
        return target;
    }

    /**
     * 转换成int型（默认值为0）
     * @param obj
     * @return
     */
    public static int castToInt(Object obj) {
        return castToInt(obj, 0);
    }

    /**
     * 转换成boolean类型（提供默认值）
     * @param obj
     * @param defaultValue
     * @return
     */
    public static boolean castToBoolean(Object obj, boolean defaultValue) {
        boolean target = defaultValue;
        if (obj != null) {
            target = Boolean.parseBoolean(castToString(obj));
        }
        return target;
    }

    /**
     *
     * 转换成boolean（默认值false）
     * @param obj
     * @return
     */
    public static boolean castToBoolean(Object obj) {
        return castToBoolean(obj, false);
    }
}
