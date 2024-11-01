package com.nholuongut.notifications.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@EnableAsync
@Configuration
public class ThreadPoolConfiguration {

	@Bean(name = "threadPoolExecutor")
	public Executor getAsyncExecutorNotificationBuilder() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(20);
		executor.setMaxPoolSize(30);
		executor.setQueueCapacity(200);
		executor.setThreadNamePrefix("threadPoolExecutor-");
		executor.initialize();
		return executor;
	}
}
