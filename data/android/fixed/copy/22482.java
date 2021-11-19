@java.lang.Override
public void setValue(java.lang.Object object) {
    if ((step) != null) {
        super.setValue(object);
        step.getParameters().put(parameterName, object);
    }
}