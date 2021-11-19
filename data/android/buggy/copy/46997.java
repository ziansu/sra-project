@javax.ws.rs.GET
@javax.ws.rs.Path(value = "appliance_configuration_templates?id={ids}")
void getApplianceConfigurationsForIds(@javax.ws.rs.PathParam(value = "ids")
java.lang.String ids, org.fusesource.restygwt.client.MethodCallback<pl.cyfronet.coin.clew.client.controller.cf.applianceconf.ApplianceConfigurationsResponse> methodCallback);