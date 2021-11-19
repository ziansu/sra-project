public void setFunction(final jcl.functions.FunctionStruct function) {
    functionStack.pop();
    functionStack.push(function);
}