springboot 整合webservice
参考：https://blog.csdn.net/sujin_/article/details/83865124

1.服务端
    1.1引入jar
    <!-- webservice -->
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web-services</artifactId>
            </dependency>
            <dependency>
                <groupId>org.apache.cxf</groupId>
                <artifactId>cxf-rt-frontend-jaxws</artifactId>
                <version>3.2.6</version>
            </dependency>
            <dependency>
                <groupId>org.apache.cxf</groupId>
                <artifactId>cxf-rt-transports-http</artifactId>
                <version>3.2.6</version>
            </dependency>
    1.2 增加配置类CxfConfig, 定义路径为/demo/*
    1.3 定义接口，需在接口和实现类上增加注解@WebService  ，如DemoService 和 DemoServiceImpl
    1.4 启动项目
    1.5 验证：
      访问 http://localhost:9001/mk-webservice-demo/demo/  查看所有的接口
      访问 http://localhost:9001/mk-webservice-demo/demo/api?wsdl  可以访问具体的某个接口


    详见mk-webservice-demo项目

2.客户端

    2.1 方法一：生成客户端的代码 如果接口发生变化，代码需要重新生成，不建议用这种方法  详见mk-webservice-client
    2.2 方法二：实现WebService客户端不一定要生成客户端的代码，可以通过地址动态调用。
         详见mk-webservice-client-2
