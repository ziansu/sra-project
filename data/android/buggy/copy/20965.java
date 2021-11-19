private java.lang.String getNameToDisplay(net.osmand.plus.activities.LocalIndexInfo child) {
    java.lang.String mapName = net.osmand.plus.helpers.FileNameTranslationHelper.getFileName(ctx, ctx.getMyApplication().getResourceManager().getOsmandRegions(), child.getFileName());
    return mapName;
}