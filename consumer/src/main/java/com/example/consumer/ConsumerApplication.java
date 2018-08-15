package com.example.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import rpcClient.RpcClient;
import service.HelloService;

@ImportResource({ "classpath*:rpc-sofa-boot-starter-samples.xml" })
@SpringBootApplication
public class ConsumerApplication   {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(ConsumerApplication.class);
		ApplicationContext applicationContext = springApplication.run(args);
		HelloService helloSyncServiceReference = (HelloService) applicationContext
				.getBean("helloSyncServiceReference");
		System.out.println(helloSyncServiceReference.saySync("aaa"));
		RpcClient rpcClient = new RpcClient();
		System.out.println(rpcClient.userService.getUserInfo(1,"aa",3).getAge());

	}
}
