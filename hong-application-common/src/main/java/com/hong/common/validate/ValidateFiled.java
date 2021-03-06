package com.hong.common.validate;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(ValidateGroup.class)
public @interface ValidateFiled {
	
	/**
	 * 参数索引位置
	 */
	 int index() default -1 ;
	
	/**
	 * 如果参数是基本数据类型或String ，就不用指定该参数，如果参数是对象，要验证对象里面某个属性，就用该参数指定属性名
	 */
	 String filedName() default "" ;
	
	/**
	 * 正则验证
	 */
	 String regStr() default "";
	
	/**
	 * 是否能为空  ， 为true表示不能为空 ， false表示能够为空
	 */
	 boolean notNull() default false;
	
	/**
     * 不为空（只针对CharSequence,Collection,Map,Dictionary,Array）
     */
	 boolean notEmpty() default false;
    
    /**
     * 是否不为空白串（只针对CharSequence） 为true表示不能为空 ， false表示能够为空
     * @return
     */
	 boolean notBlank() default false;
	
	/**
	 * 是否能为空  ， 为true表示不能为空 ， false表示能够为空
	 */
	 int maxLen() default -1 ;
	
	/**
	 * 最小长度 ， 用户验证字符串
	 */
	 int minLen() default -1 ;
	
	/**
	 *最大值 ，用于验证数字类型数据
	 */
	 int maxVal() default -1 ;
	
	/**
	 *最小值 ，用于验证数值类型数据
	 */
	 int minVal() default -1 ;
	
	/**
	 *提示信息：校验失败时候自动拼装 
	 */
	 String msg() default "";
}
