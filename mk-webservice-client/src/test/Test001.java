/**
 * @ProjectName mk-webservice-client <br>
 * @Package: test <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 14:19
 */
package test;

import org.junit.Test;

/**
 * @ClassName Test001 <br>
 * @Description: TODO <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 14:19
 */
public class Test001 {


    @Test
    public void test1() throws Exception{
        DemoService_Service  service = new DemoService_ServiceLocator();
        String result = service.getDemoServiceImplPort().sayHello("zhangsan");
        System.out.println("===========================================");
        System.out.println(result);
        System.out.println("===========================================");
    }

}