@org.junit.Test
@java.lang.SuppressWarnings(value = "rawtypes")
public void instantiateJavaApiClassWhichHasBootstrapClassLoader() {
    nl.jqno.equalsverifier.internal.Instantiator instantiator = nl.jqno.equalsverifier.internal.Instantiator.of(java.util.List.class);
    instantiator.instantiateAnonymousSubclass();
}