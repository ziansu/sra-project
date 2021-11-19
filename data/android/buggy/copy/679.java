@java.lang.Override
public void redo() {
    if ((target) instanceof de.darwinspl.feature.graphical.base.model.DwFeatureWrapped) {
        redoForFeatureTarget();
    }else {
        redoForConnectionTarget();
    }
    viewer.getModelWrapped().rearrangeFeatures();
    viewer.refreshView();
}