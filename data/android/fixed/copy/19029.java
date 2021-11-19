public javax.xml.bind.JAXBContext getContext(java.lang.Class<?> objectType) {
    for (java.lang.Class<?> type : types) {
        if (type == objectType) {
            return context;
        }
    }
    return null;
}