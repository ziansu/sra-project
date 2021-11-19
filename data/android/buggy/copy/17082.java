@java.lang.Override
public org.apache.chemistry.opencmis.commons.definitions.TypeDefinitionList getTypeChildren(java.lang.String repositoryId, java.lang.String typeId, java.lang.Boolean includePropertyDefinitions, java.math.BigInteger maxItems, java.math.BigInteger skipCount, org.apache.chemistry.opencmis.commons.data.ExtensionsData extension) {
    return this.getRepository().getTypes();
}