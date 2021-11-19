@java.lang.Override
public boolean existsStyle(java.lang.String name, java.lang.Boolean quietOnNotFound) {
    java.lang.String url = buildXmlUrl(null, name);
    java.lang.String composed = it.geosolutions.geoserver.rest.Util.appendQuietOnNotFound(quietOnNotFound, url);
    return it.geosolutions.geoserver.rest.cas.CASHTTPUtils.exists(composed, gsuser, gspass);
}