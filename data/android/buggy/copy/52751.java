@java.lang.Override
public boolean isAssigningClusterIds() {
    return (OScenarioThreadLocal.INSTANCE.get()) != (com.orientechnologies.orient.core.db.OScenarioThreadLocal.RUN_MODE.RUNNING_DISTRIBUTED);
}