public static boolean isAWrench(net.minecraft.item.Item item) {
    for (java.lang.Class c : com.thecodewarrior.mcjty.varia.WrenchChecker.wrenchClasses) {
        if (item.getClass().isAssignableFrom(c)) {
            return true;
        }
    }
    return false;
}