@java.lang.Override
public java.lang.String getString(java.lang.String key) {
    return naga.core.spi.platform.client.teavm.JSUtil.js2String(getNativeElement(key));
}