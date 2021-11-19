@java.lang.Override
public void setValue(java.lang.Object object) {
    super.setValue(object);
    step.getParameters().put(parameterName, object);
}