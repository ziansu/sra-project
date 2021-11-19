public void addConfigurationProperties(java.util.Properties properties) {
    this.properties.putAll(properties);
    this.suppressDate = org.mybatis.generator.internal.util.StringUtility.isTrue(properties.getProperty("suppressDate"));
    this.suppressAllComments = org.mybatis.generator.internal.util.StringUtility.isTrue(properties.getProperty("suppressAllComments"));
}