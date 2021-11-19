private void group(java.lang.String groupArg, java.lang.String tagArg) {
    igv.groupAlignmentTracks(org.broad.igv.batch.CommandExecutor.getAlignmentGroupOption(groupArg), tagArg);
    igv.repaintDataPanels();
}