public void rpc(@android.support.annotation.NonNull
java.lang.String procedureName, @android.support.annotation.NonNull
java.util.List<de.kuschku.libquassel.primitives.types.QVariant> params) {
    de.kuschku.util.AndroidAssert.assertNotNull(provider);
    de.kuschku.libquassel.functions.types.RpcCallFunction function = new de.kuschku.libquassel.functions.types.RpcCallFunction(procedureName, params);
    provider.dispatch(function);
}