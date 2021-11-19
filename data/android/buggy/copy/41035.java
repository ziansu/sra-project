public boolean normalize(java.lang.String options) {
    dispatcher.setSessionID();
    if (options == null)
        options = "";
    
    return (com.epam.indigo.Indigo.checkResult(this, _lib.indigoNormalize(self, options))) == 1;
}