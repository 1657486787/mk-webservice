/**
 * @ProjectName mk-webservice <br>
 * @Package: com.suns.service <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 15:45
 */
package com.suns.service;

import javax.jws.WebService;

/**
 * @ClassName Demo2Service <br>
 * @Description: TODO <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 15:45
 */

@WebService(name = "Demo2Service", // 暴露服务名称
        targetNamespace = "http://service.mq.primeton.com"// 命名空间,一般是接口的包名倒序
)
public interface Demo2Service {

    public String method1(String user);
    public String method2(String user);
}