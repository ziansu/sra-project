@java.lang.Override
public org.talend.daikon.schema.SchemaElement addChild(org.talend.daikon.schema.SchemaElement child) {
    if ((children) == null) {
        children = new java.util.ArrayList<>();
    }
    children.add(child);
    return this;
}