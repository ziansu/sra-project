public static void addItem(final java.lang.Integer id, final java.lang.String itemName) {
    java.util.AbstractMap.SimpleEntry entry = new java.util.AbstractMap.SimpleEntry(id, itemName);
    net.sourceforge.kolmafia.swingui.DatabaseFrame.allItems.add(new net.sourceforge.kolmafia.utilities.LowerCaseEntry(entry));
    net.sourceforge.kolmafia.swingui.DatabaseFrame.allItems.sort(new net.sourceforge.kolmafia.swingui.DatabaseFrame.IntegerEntryKeyComparator());
}