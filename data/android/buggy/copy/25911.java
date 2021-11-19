public top.lizhengxian.easypermission.EasyPermissionDialog.Builder addPermission(int imageResId, java.lang.String[] permission, java.lang.String permTitle, java.lang.String permDescriptions) {
    mPermissions.add(new top.lizhengxian.easypermission.Permission(permTitle, permDescriptions, imageResId, permission));
    return this;
}