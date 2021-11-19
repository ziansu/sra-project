public void checkCurrentObject() {
    if ((currentRecord) == null)
        throw new com.orientechnologies.common.exception.OException("The is no current object selected: create a new one or load it");
    
}