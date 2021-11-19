@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (null != (_listener)) {
        loci.slim.SLIMProcessor.record(SLIMProcessor.SET_START_BATCH, "");
        _listener.openFile();
    }
}