@java.lang.Override
public void setupProperties() {
    super.setupProperties();
    table = new org.talend.components.snowflake.SnowflakeTableProperties("table");
    table.connection = getConnectionProperties();
}