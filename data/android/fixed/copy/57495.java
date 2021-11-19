@java.lang.Override
public void initialize() {
    mReactChoreographer = com.facebook.react.uimanager.ReactChoreographer.getInstance();
    mJSTimersModule = getReactApplicationContext().getCatalystInstance().getJSModule(com.facebook.react.modules.core.JSTimersExecution.class);
    getReactApplicationContext().addLifecycleEventListener(this);
}