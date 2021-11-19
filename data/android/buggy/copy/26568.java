public void execute(us.cownet.jforth.ExecutionContext context) {
    try {
        m.invoke(null, context);
    } catch (java.lang.reflect.InvocationTargetException e) {
    } catch (java.lang.IllegalAccessException e) {
    }
}