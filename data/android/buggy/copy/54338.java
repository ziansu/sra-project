private void maybeGetTypeVarSymbolTypes(gw.internal.gosu.parser.DynamicFunctionSymbol dfs, java.util.List<gw.lang.ir.IRSymbol> parameters) {
    if (gw.lang.reflect.Modifier.isReified(dfs.getModifiers())) {
        addTypeParamDescriptor(parameters, getTypeVarsForDFS(dfs));
    }
}