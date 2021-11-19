@java.lang.Override
public void dropAccept(org.eclipse.swt.dnd.DropTargetEvent event) {
    java.lang.System.out.println("dropAccept() called");
    if (!(org.eclipse.swt.dnd.FileTransfer.getInstance().isSupportedType(event.currentDataType))) {
        event.detail = org.eclipse.swt.dnd.DND.DROP_NONE;
    }
}