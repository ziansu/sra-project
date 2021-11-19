public org.eclipse.xtext.xbase.lib.Procedures.Procedure1<org.eclipse.xtext.xbase.compiler.output.ITreeAppendable> forCacheVariable(org.eclipse.xtend.core.xtend.XtendFunction function) {
    org.eclipse.xtend.core.jvmmodel.CacheVariableCompileStrategy strategy = cacheVarProvider.get();
    strategy.init(function);
    return strategy;
}