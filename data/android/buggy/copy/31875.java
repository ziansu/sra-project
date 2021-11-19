public static void initResponseData(owltools.gaf.lego.json.JsonModel jsonModel, owltools.gaf.lego.server.handler.M3BatchHandler.M3BatchResponse.ResponseData data, boolean addAnnotations) {
    data.individuals = jsonModel.individuals;
    data.facts = jsonModel.facts;
    data.properties = jsonModel.properties;
    if (addAnnotations) {
        data.annotations = jsonModel.annotations;
    }
}