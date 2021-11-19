@java.lang.Override
public void setReturnType(org.wso2.siddhi.query.api.definition.Attribute.Type returnType) {
    if (returnType == null) {
        throw new org.wso2.siddhi.extension.evalscript.exceptions.FunctionReturnTypeNotPresent(("Cannot find the return type of the function " + (functionName)));
    }
    this.returnType = returnType;
}