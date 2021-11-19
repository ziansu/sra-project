private double totalKegs(final java.util.List<service.OpReportREST.MovementTables> array) {
    double kegTot = 0;
    for (service.OpReportREST.MovementTables mt : array) {
        kegTot += mt.getKeggingVolume();
        kegTot += mt.getFirkinVolume();
    }
    return kegTot;
}