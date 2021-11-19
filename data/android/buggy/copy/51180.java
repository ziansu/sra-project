@play.mvc.Util
public static void setActiveProjectId(java.lang.String activeProjectId) {
    if ((org.apache.commons.lang.StringUtils.isNotBlank(activeProjectId)) && (ResourceType.PROJECT.equals(com.emc.sa.util.ResourceType.fromResourceId(activeProjectId)))) {
        session.put(controllers.resources.ResourceController.ACTIVE_PROJECT_ID, activeProjectId);
    }
}