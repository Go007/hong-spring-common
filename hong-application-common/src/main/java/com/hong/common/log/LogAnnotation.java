package com.hong.common.log;

import java.lang.annotation.*;

/**
 * <pre>
 * 如果是日志入库，则不能用于service的只读事务方法
 * </pre>
 * 
 * @ClassName: LogAnnotation
 * @Description: 日志注解
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {
    LogType type() default LogType.UNDEFINED;

    String desc() default "";

    public static enum LogType {
        ADD(0x1, "新增"), UPDATE(0x2, "更新"), DELETE(0x3, "删除"), QUERY(0x4, "查询"), UNDEFINED(0, null);

        private int type;

        private String comment;

        private LogType(int type, String comment) {
            this.type = type;
            this.comment = comment;
        }

        public String comment() {
            return comment;
        }

        public int type() {
            return type;
        }
    }

}
