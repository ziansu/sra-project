public static void updateGroupPrefixCache() {
    for (java.lang.String group : me.vemacs.prefixstacker.PrefixStacker.permission.getGroups()) {
        me.vemacs.prefixstacker.PrefixStacker.groupPrefixCache.put(group, me.vemacs.prefixstacker.PrefixStacker.chat.getGroupPrefix(((java.lang.String) (null)), group));
    }
}