package cn.com.huo.zenghui.move.server.inter;

import cn.com.huo.zenghui.move.server.impl.ServerType;

/**
* @ClassName: Server
* @Description: 服务器接口
* @author huo.zenghui
* @date 2018年6月20日 下午9:15:48
 */
public interface Server {

    /**
    * 启动服务
    **/
    void start();

    /**
    * 销毁服务
    **/
    void destroy();

    /**
     * 重启服务
    **/
    void restart();

    /**
     *获取服务类型
    **/
    ServerType getServerType();
}
