public com.jadieldearmas.codegenerator.JConstructor setTextBody(java.lang.String bodyText) throws java.lang.UnsupportedOperationException {
    if (!(this.isBodyAdded)) {
        this.textBody = bodyText;
        return this;
    }else {
        throw new java.lang.UnsupportedOperationException("The body of the constructor has already been added");
    }
}