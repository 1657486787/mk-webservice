/**
 * @ProjectName mk-webservice <br>
 * @Package: com.suns.service.impl <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 11:32
 */
package com.suns.service.impl;

import com.suns.service.DemoService;

import javax.jws.WebService;
import java.util.Date;

/**
 * @ClassName DemoServiceImpl <br>
 * @Description: TODO <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 11:32
 */
@WebService(serviceName = "DemoService", // 与接口中指定的name一致
        targetNamespace = "http://service.mq.primeton.com", // 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.suns.service.DemoService"// 接口地址
)
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String user) {
        System.out.println(user+"，现在时间："+"("+new Date()+")");
        return user+"，现在时间："+"("+new Date()+")";
    }
}