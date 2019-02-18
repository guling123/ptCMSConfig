1.官方文档地址：https://cloud.spring.io/spring-cloud-static/Finchley.SR2/single/spring-cloud.html#_spring_cloud_config

2.中文文档地址：https://github.com/Netflix/eureka

3.配置管理工具包,让你可以把配置放到远程服务器,集中化管理集群配置,目前支持本地存储GIT以及SUBVERSION,
也就是说,我们可以使用Spring Cloud Config来获取远程服务器上的配置信息

4.客服端使用类似如下：
spring:
  cloud:
    config:
      name:  application
      profile: eureka-service,mysql-pool,redis,rabbitmq,${spring.application.name}
      label: dev
      uri: http://config.people.cn


