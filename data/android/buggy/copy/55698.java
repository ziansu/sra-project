@java.lang.Override
public void call(final org.json.JSONArray properties) throws org.json.JSONException {
    java.lang.System.out.println(("onSelect" + properties));
    org.vaadin.visjs.networkDiagram.SelectEvent event = org.vaadin.visjs.networkDiagram.EventGenerator.getNodeSelectEvent(properties);
    fireNodeSelectEvent(event);
}