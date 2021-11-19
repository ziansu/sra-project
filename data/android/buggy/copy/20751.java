@java.lang.Override
public java.util.List<java.lang.String> buildCommand(java.util.Map<java.lang.String, java.lang.String> env) throws java.io.IOException {
    if (org.apache.spark.launcher.SparkSubmitCommandBuilder.PYSPARK_SHELL.equals(appResource)) {
        return buildPySparkShellCommand(env);
    }else {
        return super.buildSparkSubmitCommand(env);
    }
}