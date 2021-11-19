@java.lang.Override
public boolean existsStyle(java.lang.String name, boolean quietOnNotFound) {
    java.lang.String url = buildXmlUrl(null, name);
    java.lang.String composed = it.geosolutions.geoserver.rest.Util.appendQuietOnNotFound(quietOnNotFound, url);
    return it.geosolutions.geoserver.rest.cas.CASHTTPUtils.exists(composed, gsuser, gspass);
}