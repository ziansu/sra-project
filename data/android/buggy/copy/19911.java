@java.lang.Override
public boolean isComplete() {
    return ((name) != null) && (java.util.Arrays.asList(net.minecraftforge.oredict.OreDictionary.getOreNames()).contains(name));
}