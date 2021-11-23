public java.util.ArrayList<de.tmasser.responsetemplates.MultiLingualEntry> getAllEntries() {
    java.util.ArrayList<de.tmasser.responsetemplates.MultiLingualEntry> list = new java.util.ArrayList<>();
    for (de.tmasser.responsetemplates.MultiLingualEntry entry : this.entries) {
        list.add(entry);
    }
    java.util.Collections.sort(list);
    return list;
}