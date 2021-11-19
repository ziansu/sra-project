private void insetIDAndTypeForJsonObject(org.wso2.developerstudio.datamapper.TreeNode node, org.json.simple.JSONObject nodeObject) {
    java.lang.String schemaType = getPropertyKeyValuePairforTreeNode(node, org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_TYPE);
    java.lang.String schemaID = getPropertyKeyValuePairforTreeNode(node, org.wso2.developerstudio.datamapper.diagram.tree.generator.SchemaTransformer.JSON_SCHEMA_ID);
    insertIDandTypeforItemsBlock(nodeObject, schemaID, schemaType);
}