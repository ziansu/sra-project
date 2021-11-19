@gov.nasa.gsfc.seadas.ocsswrest.GET
@gov.nasa.gsfc.seadas.ocsswrest.Path(value = "/ocsswEnv")
@gov.nasa.gsfc.seadas.ocsswrest.Produces(value = { javax.ws.rs.core.MediaType.APPLICATION_XML , javax.ws.rs.core.MediaType.APPLICATION_JSON })
public gov.nasa.gsfc.seadas.ocsswrest.utilities.OCSSWInfo getOCSSWInfo() {
    gov.nasa.gsfc.seadas.ocsswrest.utilities.OCSSWInfo ocsswInfo = new gov.nasa.gsfc.seadas.ocsswrest.utilities.OCSSWInfo();
    ocsswInfo.setInstalled(true);
    ocsswInfo.setOcsswDir(java.lang.System.getProperty(("user.home" + "/ocssw")));
    return ocsswInfo;
}