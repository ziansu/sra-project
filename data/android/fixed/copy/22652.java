public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    minSound1.play();
    moduleList.clear();
    moduleList.addAll(config.ConfigToList("minConfig1"));
    loadBackground();
    loadConfigImages();
}