private boolean currentUserIsOwner(org.molgenis.data.Entity entity) {
    return org.molgenis.security.core.utils.SecurityUtils.getCurrentUsername().equals(getOwnerUserName(entity));
}