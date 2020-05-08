/**
 * @ProjectName mk-webservice <br>
 * @Package: com.suns.service.impl <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 15:46
 */
package com.suns.service.impl;

import com.suns.service.Demo2Service;

import javax.jws.WebService;
import java.util.Date;

/**
 * @ClassName Demo2ServiceImpl <br>
 * @Description: TODO <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 15:46
 */
@WebService(serviceName = "Demo2Service", // 与接口中指定的name一致
        targetNamespace = "http://service.mq.primeton.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.suns.service.Demo2Service"// 接口地址
)
public class Demo2ServiceImpl implements Demo2Service {

    @Override
    public String method1(String user) {
        System.out.println(user+"，现在时间："+"("+new Date()+")");
        return user+"，现在时间："+"("+new Date()+")";
    }

    @Override
    public String method2(String user) {
        System.out.println(user+"，现在时间2："+"("+new Date()+")");
        return user+"，现在时间2："+"("+new Date()+")";
    }
}