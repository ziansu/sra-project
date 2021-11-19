@org.springframework.context.annotation.Bean(name = "networkPool")
public org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor networkPool() {
    org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor pool = new org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor();
    pool.setThreadPriority(((java.lang.Thread.NORM_PRIORITY) + 1));
    return pool;
}