@javax.ws.rs.GET
@javax.ws.rs.Path(value = "appliance_configuration_templates?_={token}&id={ids}")
void getApplianceConfigurationsForIds(@javax.ws.rs.PathParam(value = "ids")
java.lang.String ids, @javax.ws.rs.PathParam(value = "token")
long date, org.fusesource.restygwt.client.MethodCallback<pl.cyfronet.coin.clew.client.controller.cf.applianceconf.ApplianceConfigurationsResponse> methodCallback);