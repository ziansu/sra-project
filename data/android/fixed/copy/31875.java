public static void initResponseData(owltools.gaf.lego.json.JsonModel jsonModel, owltools.gaf.lego.server.handler.M3BatchHandler.M3BatchResponse.ResponseData data) {
    data.individuals = jsonModel.individuals;
    data.facts = jsonModel.facts;
    data.properties = jsonModel.properties;
    data.annotations = jsonModel.annotations;
}