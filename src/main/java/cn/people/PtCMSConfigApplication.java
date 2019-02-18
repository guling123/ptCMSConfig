/**
 *   
 *
 * @Title: PtCMSConfigApplication.java 
 * @Package cn.people 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author shidandan
 * @date 2018年11月26日 下午5:39:17 
 * @version V1.0   
 */
package cn.people;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *  
 *
 * @author shidandan
 * @ClassName: PtCMSConfigApplication 
 * @Description: 配置文件启动类
 * @date 2018年11月26日 下午5:39:17 
 *   
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class PtCMSConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(PtCMSConfigApplication.class, args);
    }
}
