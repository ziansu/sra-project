public byte[] mdlct() {
    dispatcher.setSessionID();
    com.epam.indigo.IndigoObject buf = dispatcher.writeBuffer();
    com.epam.indigo.Indigo.checkResult(this, _lib.indigoSaveMDLCT(self, buf.self));
    return buf.toBuffer();
}