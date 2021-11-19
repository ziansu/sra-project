@de.cschulz.jackson.xmlshowcase.PUT
@de.cschulz.jackson.xmlshowcase.Path(value = "/items/{packageNumber}")
@io.swagger.annotations.ApiOperation(value = "op1")
public javax.ws.rs.core.Response op1(@io.swagger.annotations.ApiParam(value = "PackageNumber", required = true)
@de.cschulz.jackson.xmlshowcase.PathParam(value = "packageNumber")
de.cschulz.jackson.xmlshowcase.PackageNumber number) {
    java.lang.Package pkg = new java.lang.Package();
    pkg.assignPackageNumber(number);
    return javax.ws.rs.core.Response.ok().entity(pkg).build();
}