public org.jdom2.Element makeExplicitNetcdfElement(ucar.nc2.NetcdfFile ncFile, java.lang.String location) {
    org.jdom2.Element netcdfElem = makeNetcdfElement(ncFile, location);
    netcdfElem.addContent(new org.jdom2.Element("explicit", namespace));
    return netcdfElem;
}