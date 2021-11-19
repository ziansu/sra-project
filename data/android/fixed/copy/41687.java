@java.lang.Override
public void onCreate() {
    super.onCreate();
    solid.ren.skinlibrary.SkinConfig.setCanChangeStatusColor(true);
    solid.ren.skinlibrary.SkinConfig.setCanChangeFont(true);
    solid.ren.skinlibrary.SkinConfig.setDebug(true);
    solid.ren.skinlibrary.SkinConfig.addSupportAttr("tabLayoutIndicator", new solid.ren.themeskinning.custom_attr.TabLayoutIndicatorAttr());
}