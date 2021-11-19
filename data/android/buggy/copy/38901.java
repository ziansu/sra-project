public void setUniqueAttribute(java.lang.String uniqueAttribute) {
    this.uniqueAttribute = uniqueAttribute;
    if (org.identityconnectors.common.StringUtil.isEmpty(nameAttribute)) {
        nameAttribute = uniqueAttribute;
    }
}