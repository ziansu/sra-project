public static cucumber.runtime.java.spring.GlueCodeContext getInstance() {
    synchronized(cucumber.runtime.java.spring.GlueCodeContext.class) {
        cucumber.runtime.java.spring.GlueCodeContext context = cucumber.runtime.java.spring.GlueCodeContext.localContext.get();
        if (context == null) {
            cucumber.runtime.java.spring.GlueCodeContext.localContext.set(new cucumber.runtime.java.spring.GlueCodeContext());
        }
    }
    return cucumber.runtime.java.spring.GlueCodeContext.localContext.get();
}