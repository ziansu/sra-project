@org.iris4sdn.csdncm.vptopology.resources.GET
@org.iris4sdn.csdncm.vptopology.resources.Produces(value = javax.ws.rs.core.MediaType.APPLICATION_JSON)
public javax.ws.rs.core.Response getVMInstance(@org.iris4sdn.csdncm.vptopology.resources.PathParam(value = "portMac")
java.lang.String portMac) {
    java.lang.String result = get(org.iris4sdn.csdncm.vptopology.TopoManagerService.class).getVmInstance(portMac);
    return javax.ws.rs.core.Response.status(202).entity(result).build();
}