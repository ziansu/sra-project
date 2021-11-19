public static void addPermission(com.github.arsenalfcgunners.gappleperms.Rank rank, java.lang.String permission) {
    java.util.ArrayList<org.bukkit.permissions.Permission> perms = com.github.arsenalfcgunners.gappleperms.RankManager.getPermissionsFromDB(rank);
    perms.add(new org.bukkit.permissions.Permission(permission));
    com.github.arsenalfcgunners.gappleperms.RankManager.setPermissions(rank, perms);
}