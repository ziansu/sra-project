public de.craftolution.craftoplugin.core.database.columns.TimestampColumn standard(final java.sql.Timestamp timestamp) {
    super.standard(timestamp.getTime());
    return this;
}