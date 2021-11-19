public static boolean doesOreExistAndValid(java.lang.String name) {
    if (!(net.minecraftforge.oredict.OreDictionary.getOres(name).isEmpty())) {
        return false;
    }
    return (net.minecraftforge.oredict.OreDictionary.getOres(name).size()) >= 1;
}