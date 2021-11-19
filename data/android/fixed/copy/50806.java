public void storeLocalVariable(java.lang.String variableIdentifier, Model.DataType dataType) {
    if ((localVariables.get(variableIdentifier)) != null) {
        return ;
    }
    localVariables.put(variableIdentifier, new Model.LocalByteCodeParameter(localVariables.size(), dataType));
}