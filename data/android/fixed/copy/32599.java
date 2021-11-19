@java.lang.Override
public java.lang.RuntimeException runtimeException(java.lang.Exception e, java.lang.String format, java.lang.Object... objects) {
    return new sf.net.experimaestro.exceptions.XPMRhinoException(e, format, objects);
}