@java.lang.Override
public com.jaspersoft.jasperserver.jaxrs.client.core.RequestBuilder<ResponseType> addHeader(java.lang.String name, java.lang.String... values) {
    headers.addAll(name, values);
    return null;
}