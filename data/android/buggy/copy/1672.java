@java.lang.Override
public void createPartControl(org.eclipse.swt.widgets.Composite parent) {
    if (vtm.rcp.app.View._isMapAlreadyCreated) {
        createUI_Restart(parent);
    }else {
        vtm.rcp.app.View._isMapAlreadyCreated = true;
        createUI_Map(parent);
    }
    addPartListener();
}