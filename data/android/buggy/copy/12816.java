@javax.ws.rs.POST
@javax.ws.rs.Path(value = "/simpleForm")
@javax.ws.rs.Consumes(value = { javax.ws.rs.core.MediaType.APPLICATION_FORM_URLENCODED , javax.ws.rs.core.MediaType.MULTIPART_FORM_DATA })
public javax.ws.rs.core.Response simpleForm(@org.wso2.msf4j.formparam.FormDataParam(value = "age")
int age, @org.wso2.msf4j.formparam.FormDataParam(value = "name")
java.lang.String name) {
    return javax.ws.rs.core.Response.ok().entity(((("Name and age " + name) + ", ") + age)).build();
}