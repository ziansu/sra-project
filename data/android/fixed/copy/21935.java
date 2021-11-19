@com.oracle.truffle.api.dsl.Specialization(guards = "doMap(x)")
protected java.lang.Object map(java.lang.Object x) {
    return (trueBranch) == null ? x : trueBranch.execute(x);
}