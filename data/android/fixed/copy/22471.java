@java.lang.Override
public void dropAccept(org.eclipse.swt.dnd.DropTargetEvent event) {
    if (!(org.eclipse.swt.dnd.FileTransfer.getInstance().isSupportedType(event.currentDataType))) {
        event.detail = org.eclipse.swt.dnd.DND.DROP_NONE;
    }
}