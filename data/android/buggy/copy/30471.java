@java.lang.Override
public org.python.core.PyObject __call__(org.python.core.PyObject key) {
    return new org.python.core.PyJavaType.ListIndexDelegate(asList()).checkIdxAndGetItem(key);
}