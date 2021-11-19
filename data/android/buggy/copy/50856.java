public com.nnpcgroup.comd.cosm.entitlement.controller.util.ProductionDataModel getDataModel() {
    loadProductions();
    dataModel = new com.nnpcgroup.comd.cosm.entitlement.controller.util.ProductionDataModel(productions);
    return dataModel;
}