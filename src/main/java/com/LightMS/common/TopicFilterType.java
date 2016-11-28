package com.LightMS.common;

/**
 * Topic过滤方式，默认单个tag过滤
 * 
 * @author LuoJin
 * @since 2016年11月24日
 */
public enum TopicFilterType {
	/**
     * 每个消息只能有一个Tag
     */
    SINGLE_TAG,
    /**
     * 每个消息可以有多个Tag（暂时不支持，后续视情况支持）<br>
     * 为什么暂时不支持？<br>
     * 此功能可能会对用户造成困扰，且方案并不完美，所以暂不支持
     */
    MULTI_TAG
}
