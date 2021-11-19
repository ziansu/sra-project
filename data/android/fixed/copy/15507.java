public byte[] mdlct() {
    com.epam.indigo.IndigoObject buf = dispatcher.writeBuffer();
    dispatcher.setSessionID();
    com.epam.indigo.Indigo.checkResult(this, _lib.indigoSaveMDLCT(self, buf.self));
    return buf.toBuffer();
}