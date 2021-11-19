@java.lang.Override
@javax.annotation.Nullable
public co.cask.cdap.api.data.schema.Schema getInputSchema() {
    return inputSchemas.isEmpty() ? null : inputSchemas.entrySet().iterator().next().getValue();
}