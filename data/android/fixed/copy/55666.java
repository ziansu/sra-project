@org.python.expose.ExposedMethod(doc = BuiltinDocs.unicode_upper_doc)
final org.python.core.PyObject unicode_upper() {
    return new org.python.core.PyUnicode(getString().toUpperCase());
}