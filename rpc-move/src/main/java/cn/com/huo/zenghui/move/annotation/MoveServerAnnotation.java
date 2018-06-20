package cn.com.huo.zenghui.move.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
* @ClassName: MoveServerAnnotation
* @Description: 添加服务器
* @author huo.zenghui
* @date 2018年6月20日 下午8:08:50
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface MoveServerAnnotation {

    /**
    * @Title: value
    * @Description: 业务bean
    * @author huo.zenghui
    * @date  2018年6月20日 下午8:30:56
    * @return
     */
    String value();
}
