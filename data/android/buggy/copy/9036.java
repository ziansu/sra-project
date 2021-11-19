public org.jrapidoc.model.Return.ReturnBuilder soapOutputHeader(org.jrapidoc.model.TransportType soapHeader) {
    this.soapOutputHeaders.put(soapHeader.getType().getTypeRef(), soapHeader);
    return this;
}