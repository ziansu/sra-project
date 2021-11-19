@java.lang.Override
public void run() {
    super.run();
    com.iwedia.example.tvinput.engine.DtvManager.instantiate(this);
    mDtvManager = com.iwedia.example.tvinput.engine.DtvManager.getInstance();
    mDtvManager.getDtvManager().getServiceControl().registerCallback(this);
}