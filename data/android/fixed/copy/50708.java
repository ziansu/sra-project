@me.enerccio.sp.types.pointer.WrapAnnotationFactory.WrapMethod
public void signal(me.enerccio.sp.types.callables.CallableObject o, me.enerccio.sp.types.sequences.TupleObject args, me.enerccio.sp.interpret.InternalDict dict) {
    PythonInterpreter.interpreterMap.get(t).interruptInterpret(o, args, dict.asKwargs());
}