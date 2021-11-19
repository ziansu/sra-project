public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("Timed event triggered");
    if (captureToggle) {
        ca.ubc.cs.commandrecommender.usagedata.gathering.contextwriters.ContextWriter.tsc.captureScreenContext();
    }else {
        aec.captureEditorContext();
    }
}