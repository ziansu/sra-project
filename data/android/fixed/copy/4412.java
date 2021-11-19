private boolean archivePermissionsGranted(int[] permissionRequestResults) {
    return ((permissionRequestResults.length) > 0) && (this.archivePermissionsGranted(permissionRequestResults[0]));
}