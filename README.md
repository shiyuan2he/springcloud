### 文章汇总

[springcloud实战之1技术选型：dubbo还是springcloud](http://blog.csdn.net/u012806787/article/details/78789312)

[springcloud实战之2 服务注册与发现（eureka实现）](http://blog.csdn.net/u012806787/article/details/78790958)

[springcloud实战之3 高可用服务注册中心（eureka集群）](http://blog.csdn.net/u012806787/article/details/78793639)

[springcloud实战之5 服务消费者（ribbon）](http://blog.csdn.net/u012806787/article/details/78796605)

[springcloud实战之6 服务消费者（Feign）](http://blog.csdn.net/u012806787/article/details/78798951)

[springcloud实战之7 断路器（Hystrix）](http://blog.csdn.net/u012806787/article/details/78801119)

[springcloud实战之8 断路器-仪表盘-单例监控（Hystrix）](http://blog.csdn.net/u012806787/article/details/78843576)

[springcloud实战之9断路器-集群监控（turbine）](http://blog.csdn.net/u012806787/article/details/78862637)

[springcloud实战之10 分布式配置中心（config）](http://blog.csdn.net/u012806787/article/details/78803198)

[springcloud实战之11路由网关（zuul）](http://blog.csdn.net/u012806787/article/details/78863867)

[springcloud实战之12 路由网关拦截器](http://blog.csdn.net/u012806787/article/details/78864281)

[springcloud实战之13 rabbitmq消息总线（bus）](http://blog.csdn.net/u012806787/article/details/78864867)

[springcloud实战之14动态刷新分布式配置中心属性配置（config）](http://blog.csdn.net/u012806787/article/details/78865414)

### 快速开始


```shell
git clone https://github.com/shiyuan2he/springcloud.git
cd springcloud
```

### 启动Eureka Server

```
cd springcloud-server-eureka
mvn clean package -Dmaven.test.skip=true
java -jar target/springcloud-eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar target/springcloud-eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer2
```

http://peer1:8080

![image](https://github.com/shiyuan2he/springcloud/tree/master/springcloud-repo-doc/images/enreka server.png)

