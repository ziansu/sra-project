@java.lang.Override
public org.quartz.SchedulerFactory get() {
    synchronized(com.jensfendler.ninjaquartz.provider.QuartzSchedulerFactoryProvider.schedulerFactory) {
        logger.debug("{} called to get SchedulerFactory.", getClass().getName());
        if ((com.jensfendler.ninjaquartz.provider.QuartzSchedulerFactoryProvider.schedulerFactory) == null) {
            loadSchedulerFactory();
        }
        return com.jensfendler.ninjaquartz.provider.QuartzSchedulerFactoryProvider.schedulerFactory;
    }
}