@java.lang.Override
public void run(org.eclipse.jface.action.IAction action) {
    if ((featureHouseComposer) != null) {
        featureHouseComposer.setUseFuji((!(featureHouseComposer.usesFuji())));
    }
}