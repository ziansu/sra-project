public java.util.List<models.Organization> getFavoriteOrganizations() {
    java.util.List<models.Organization> organizations = new java.util.ArrayList<>();
    for (models.FavoriteOrganization favoriteOrganization : this.favoriteOrganizations) {
        organizations.add(favoriteOrganization.organization);
    }
    return organizations;
}