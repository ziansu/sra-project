private net.sourceforge.usbdm.constants.UsbdmSharedConstants.InterfaceType getInterfaceType() {
    int deviceIndex = comboInterfaceType.getSelectionIndex();
    if (deviceIndex < 0) {
        return null;
    }
    return interfaceTypes[deviceIndex];
}