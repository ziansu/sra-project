private org.openlca.core.model.Category create() {
    org.openlca.core.model.Category category = new org.openlca.core.model.Category();
    category.setRefId(java.util.UUID.randomUUID().toString());
    category.setName("name");
    category.setModelType(ModelType.FLOW);
    return category;
}