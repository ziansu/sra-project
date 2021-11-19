@java.lang.Override
public java.lang.Double evalDouble(java.lang.String script, javax.script.Bindings bindings) throws javax.script.ScriptException {
    java.lang.System.Object value = ((java.lang.System.Object) (eval(script, bindings)));
    return value == null ? null : new java.lang.Double(value.ToString());
}