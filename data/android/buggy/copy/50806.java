public void storeLocalVariable(java.lang.String variableIdentifier, Model.DataType dataType) {
    localVariables.put(variableIdentifier, new Model.LocalByteCodeParameter(localVariables.size(), dataType));
}