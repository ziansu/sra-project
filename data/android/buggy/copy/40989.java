@java.lang.Override
protected void init() {
    addController(FileTransferController.NAME, org.labkey.filetransfer.FileTransferController.class);
    org.labkey.filetransfer.FileTransferModule.registerAdminConsoleLinks();
}