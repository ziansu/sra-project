public boolean normalize(java.lang.String options) {
    if (options == null)
        options = "";
    
    dispatcher.setSessionID();
    return (com.epam.indigo.Indigo.checkResult(this, _lib.indigoNormalize(self, options))) == 1;
}