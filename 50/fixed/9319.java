@java.lang.Override
public org.apache.calcite.schema.SchemaPlus get() {
    return io.druid.sql.calcite.planner.Calcites.createRootSchema(druidSchema);
}