public void setSGroupClass(java.lang.String sgclass) {
    dispatcher.setSessionID();
    if (sgclass == null)
        sgclass = "";
    
    com.epam.indigo.Indigo.checkResult(this, _lib.indigoSetSGroupClass(self, sgclass));
}