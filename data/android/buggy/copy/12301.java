protected java.lang.Object callWithNamedValues(railo.runtime.PageContext pc, int access, java.lang.String name, railo.runtime.type.Struct args) throws railo.runtime.exp.PageException {
    return _call(pc, access, railo.runtime.type.KeyImpl.init(name), args, null, false);
}