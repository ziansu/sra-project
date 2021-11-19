public void start() {
    spark = ai.grakn.engine.controller.SparkContext.startSparkCopyOnNewPort(config);
    createControllers.accept(spark, config);
    spark.awaitInitialization();
}