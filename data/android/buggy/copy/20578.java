@java.lang.Override
public com.celements.pagetype.IPageTypeConfig getPageTypeConfig(java.lang.String pageTypeName) {
    if (pageTypeName != null) {
        com.celements.pagetype.PageTypeReference pageTypeRef = getPageTypeRefByConfigName(pageTypeName);
        return getPageTypeConfigForPageTypeRef(pageTypeRef);
    }
    return null;
}