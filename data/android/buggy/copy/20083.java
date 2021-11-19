private JavaFile.Term toBigInteger(wyjc.core.JavaFile.Term term, wyjc.builder.Type type) throws wybs.lang.NameResolver.ResolutionError {
    if (isDynamicallySized(type)) {
        return term;
    }else {
        return new wyjc.core.JavaFile.Invoke(null, new java.lang.String[]{ "BigInteger" , "valueOf" }, term);
    }
}