@java.lang.Override
public de.factoryfx.factory.LiveCycleController<de.factoryfx.javafx.util.LongRunningActionExecutor, V> createLifecycleController() {
    return () -> new de.factoryfx.javafx.util.LongRunningActionExecutor();
}