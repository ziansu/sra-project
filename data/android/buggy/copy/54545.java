public json.JSONObject getMSAGraphJSON() {
    api.PartialOrderGraph msa = asr.getMSAGraph();
    vis.POAGJson json = new vis.POAGJson(msa);
    java.lang.System.out.println(("msa: " + (json.toJSON())));
    return json.toJSON();
}