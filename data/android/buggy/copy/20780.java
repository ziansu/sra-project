public static boolean isPTStop(org.openstreetmap.josm.data.osm.RelationMember rm) {
    return !(org.openstreetmap.josm.plugins.pt_assistant.utils.RouteUtils.isPTWay(rm));
}