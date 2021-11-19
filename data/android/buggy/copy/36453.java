private org.w3c.dom.Element getViewElement(java.lang.String userID) throws exceptions.DocumentNullException, exceptions.ElementNullException, exceptions.XMLBrokenException {
    org.w3c.dom.Document doc = getUserviewDocument(userID);
    return doc.getDocumentElement();
}