@java.lang.Override
public void setConf(org.apache.hadoop.conf.Configuration configuration) {
    if (((expressionProxy) == null) || ((conf) != configuration)) {
        expressionProxy = org.apache.hadoop.hive.metastore.PartFilterExprUtil.createExpressionProxy(conf);
    }
    conf = configuration;
}