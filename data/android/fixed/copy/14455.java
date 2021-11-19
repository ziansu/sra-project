@java.lang.Override
public void execute(final java.lang.Runnable task, long startTimeout) {
    super.execute(new amqp.spring.camel.component.SpringAMQPConsumer.SpringAMQPExecutorTask(endpoint, task), startTimeout);
}