private static simons.squest2.Item getTemplate(java.lang.String item) {
    for (simons.squest2.Item i : simons.squest2.Item.itemLookup) {
        if (i.name.equals(item))
            return new simons.squest2.Item(i);
        
    }
    return null;
}