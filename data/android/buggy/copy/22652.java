public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    moduleList.clear();
    moduleList.addAll(config.ConfigToList("minConfig1"));
    loadBackground();
    loadConfigImages();
    minSound1.play();
}