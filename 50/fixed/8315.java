@java.lang.Override
protected void onLoad() {
    super.onLoad();
    this.name = "weatherContainer";
    this.addStyleName(name);
    this.getElement().setId("weatherContainer");
    gwt.material.design.client.ui.MaterialWeather.showWeather(location, name, color);
}