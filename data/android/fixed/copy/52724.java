public void executeAsyncServiceCall(java.lang.String functionName, java.lang.Object[] arguments) {
    org.sablo.websocket.CurrentWindow.get().executeAsyncServiceCall(name, functionName, arguments, getParameterTypes(functionName));
}