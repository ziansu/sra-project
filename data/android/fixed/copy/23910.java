@java.lang.Override
public void destroy() {
    com.sun.identity.common.ShutdownManager.getInstance().shutdown();
    super.destroy();
}