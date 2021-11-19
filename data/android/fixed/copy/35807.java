public void setFunction(final jcl.functions.FunctionStruct function) {
    if (functionStack.isEmpty()) {
        functionStack.push(function);
    }else {
        functionStack.pop();
        functionStack.push(function);
    }
}