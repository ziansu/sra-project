public java.lang.String getSimpleRestCollectionName() {
    java.lang.String versionedRestCollectionName = getRestCollectionName();
    return com.google.common.base.Strings.isNullOrEmpty(versionedRestCollectionName) ? "" : versionedRestCollectionName.substring(((versionedRestCollectionName.lastIndexOf('.')) + 1));
}