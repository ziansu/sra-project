private java.lang.String getNameToDisplay(net.osmand.plus.activities.LocalIndexInfo child) {
    java.lang.String mapName = net.osmand.plus.helpers.FileNameTranslationHelper.getFileName(fragment.getActivity(), fragment.getMyActivity().getMyApplication().getResourceManager().getOsmandRegions(), child.getFileName());
    return mapName;
}