@java.lang.Override
public boolean isGui3d() {
    return ((model) != null) && (model.hasCustomData()) ? model.customData.gui3d : true;
}