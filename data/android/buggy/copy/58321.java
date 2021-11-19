@java.lang.Override
public void setupProperties() {
    super.setupProperties();
    setSchemaListener(new org.talend.components.api.component.ISchemaListener() {
        @java.lang.Override
        public void afterSchema() {
            updateOutputSchemas();
            updateConditionsTable();
        }
    });
}