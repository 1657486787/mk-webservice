/**
 * @ProjectName mk-webservice <br>
 * @Package: com.suns <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 15:28
 */
package com.suns;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.junit.Test;

/**
 * @ClassName Test001 <br>
 * @Description: TODO <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 15:28
 */
public class Test001 {


    /**
     　* @description: 注意：实现WebService客户端不一定要生成客户端的代码，可以通过地址动态调用。
     　* @author sunguangyishenzhenjav@dingtalk.com
     　* @date 2020/5/8 14:25
     　*/
    @Test
    public void test2(){
        //创建动态客户端
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient("http://localhost:9001/mk-webservice-demo/demo/api?wsdl");
        // 需要密码的情况需要加上用户名和密码
        //client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,PASS_WORD));
        HTTPConduit conduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(2000);  //连接超时
        httpClientPolicy.setAllowChunking(false);    //取消块编码
        httpClientPolicy.setReceiveTimeout(120000);     //响应超时
        conduit.setClient(httpClientPolicy);
        //client.getOutInterceptors().addAll(interceptors);//设置拦截器
        try{
            Object[] objects = new Object[0];
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("sayHello", "mk");
            System.out.println("返回数据:" + objects[0]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public void test3(){
        //创建动态客户端
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient("http://localhost:9001/mk-webservice-demo/demo/api2?wsdl");
        // 需要密码的情况需要加上用户名和密码
        //client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME,PASS_WORD));
        HTTPConduit conduit = (HTTPConduit) client.getConduit();
        HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
        httpClientPolicy.setConnectionTimeout(2000);  //连接超时
        httpClientPolicy.setAllowChunking(false);    //取消块编码
        httpClientPolicy.setReceiveTimeout(120000);     //响应超时
        conduit.setClient(httpClientPolicy);
        //client.getOutInterceptors().addAll(interceptors);//设置拦截器
        try{
            Object[] objects = new Object[0];
            // invoke("方法名",参数1,参数2,参数3....);
            objects = client.invoke("method1", "mk");
            System.out.println("返回数据:" + objects[0]);
            objects = client.invoke("method2", "mk2222222");
            System.out.println("返回数据:" + objects[0]);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}