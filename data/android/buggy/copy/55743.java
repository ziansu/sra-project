@java.lang.Override
public void ancestorRemoved(javax.swing.event.AncestorEvent event) {
    new king.flow.action.business.RWFingerPrintAction.FingerPrintTask(true).execute();
}