package com.alibaba.otter.canal.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CanalTable {

    /**
     * canal 指令
     * default for all
     * @return destination name
     */
    String destination() default "";

    /**
     * 数据库实例
     * default for all
     * @return schema name
     */
    String schema() default "*";

    /**
     * 监听的表
     * default for all
     * @return table name
     */
    String table() default "*";

}
