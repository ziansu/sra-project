public void bind(java.lang.Thread t) {
    me.enerccio.sp.interpret.PythonInterpreter.interpreterMap.remove(t);
    currentOwnerThread = t;
    me.enerccio.sp.interpret.PythonInterpreter.interpreter.set(this);
    me.enerccio.sp.interpret.PythonInterpreter.interpreterMap.put(t, this);
}