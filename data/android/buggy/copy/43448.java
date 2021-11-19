public step.grid.io.OutputMessage run(java.lang.Class<?> functionClass, java.lang.String function, javax.json.JsonObject argument, java.util.Map<java.lang.String, java.lang.String> properties) {
    step.handlers.javahandler.SimpleJavaHandler handler = new step.handlers.javahandler.SimpleJavaHandler(functionClass);
    return execute(function, argument, properties, handler);
}