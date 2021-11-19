public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getHadoopPropertiesFullList(org.talend.core.model.metadata.builder.connection.Connection connection, java.lang.String propertiesJsonStr, boolean includeQuotes) {
    return org.talend.core.hadoop.repository.HadoopRepositoryUtil.getHadoopPropertiesFullList(connection, propertiesJsonStr, null, null, includeQuotes);
}