@java.lang.Override
public void sendBroadcast(final android.content.Intent intent, final java.lang.String receiverPermission) {
    mCondom.proceedBroadcast(intent, new com.oasisfeng.condom.CondomCore.WrappedProcedure() {
        @java.lang.Override
        public void run(final android.content.Intent intent) {
            com.oasisfeng.condom.CondomContext.super.sendBroadcast(intent, receiverPermission);
        }
    });
}