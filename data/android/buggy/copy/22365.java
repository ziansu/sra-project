@java.lang.Override
public java.lang.String resolveStreamAlias(com.wowza.wms.application.IApplicationInstance appInstance, java.lang.String name) {
    return this.getOriginURLs(name);
}