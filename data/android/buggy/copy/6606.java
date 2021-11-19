@org.springframework.context.annotation.Bean
public org.springframework.core.task.AsyncTaskExecutor metadataRecorderTaskRunner() {
    org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor threadPoolTaskExecutor = new org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor();
    threadPoolTaskExecutor.setMaxPoolSize(10);
    threadPoolTaskExecutor.setCorePoolSize(5);
    return threadPoolTaskExecutor;
}