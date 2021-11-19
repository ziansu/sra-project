public static boolean isClass(java.lang.String name) {
    if (name == null)
        return false;
    
    return org.caliog.myRPG.Entities.ClazzLoader.classes.isConfigurationSection(name);
}