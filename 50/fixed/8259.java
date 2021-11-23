public json.JSONObject getAncestralGraphJSON(java.lang.String nodeLabel) {
    api.PartialOrderGraph graph = asr.getGraph(nodeLabel);
    java.lang.System.out.println(graph.toString());
    vis.POAGJson json = new vis.POAGJson(graph);
    return json.toJSON();
}