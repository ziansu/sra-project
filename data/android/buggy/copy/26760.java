public A findAttributeById(java.lang.String id) {
    for (A attribute : attributes) {
        if ((attribute.getId()) == id) {
            return attribute;
        }
    }
    return null;
}