/**
 * @ProjectName mk-webservice <br>
 * @Package: com.suns.controller <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 11:22
 */
package com.suns.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @ClassName TestController <br>
 * @Description: TODO <br>
 * @Author sunguangyishenzhenjav@dingtalk.com <br>
 * @Date 2020/5/8 11:22
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public Object test(){
        return "now:"+new Date();
    }
}