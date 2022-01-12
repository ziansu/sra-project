@java.lang.Override
public void start() {
    java.util.List<net.abstractfactory.plum.interaction.rich.field.RichField> inputs = createInteractiveFields();
    try {
        java.lang.Object result = invokeMethod(method);
    } catch (java.lang.Exception e) {
        onError(e);
    }
}