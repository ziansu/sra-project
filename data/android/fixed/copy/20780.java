public static boolean isPTWay(org.openstreetmap.josm.data.osm.RelationMember rm) {
    return !(org.openstreetmap.josm.plugins.pt_assistant.utils.RouteUtils.isPTStop(rm));
}