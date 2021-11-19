@java.lang.Override
public naga.core.spi.platform.client.teavm.TeaVmJsonArray nativeToJavaJsonArray(java.lang.Object nativeArray) {
    if (nativeArray instanceof naga.core.spi.platform.client.teavm.TeaVmJsonArray)
        return ((naga.core.spi.platform.client.teavm.TeaVmJsonArray) (nativeArray));
    
    return naga.core.spi.platform.client.teavm.TeaVmJsonArray.create(((org.teavm.jso.core.JSArray) (nativeArray)));
}