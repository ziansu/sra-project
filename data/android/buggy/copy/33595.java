protected void wasOk() {
    gov.usgs.volcanoes.swarm.chooser.DataSourcePanel p = panels.get(tabPane.getSelectedIndex());
    result = ((name.getText()) + ";") + (p.wasOk());
}