public void setSGroupClass(java.lang.String sgclass) {
    if (sgclass == null)
        sgclass = "";
    
    dispatcher.setSessionID();
    com.epam.indigo.Indigo.checkResult(this, _lib.indigoSetSGroupClass(self, sgclass));
}