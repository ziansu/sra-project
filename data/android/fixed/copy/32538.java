@java.lang.Override
public void onCreate() {
    super.onCreate();
    org.gemini.init.Receiver.register(this);
    if ((org.gemini.init.ExecService.instance) == (this))
        logger = new org.gemini.init.Logger(this, "service.log");
    
}