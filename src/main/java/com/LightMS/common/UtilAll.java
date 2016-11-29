package com.LightMS.common;

public class UtilAll {
	/**
     * 计算耗时操作，单位ms
     */
    public static long computeEclipseTimeMilliseconds(final long beginTime) {
        return (System.currentTimeMillis() - beginTime);
    }
}
