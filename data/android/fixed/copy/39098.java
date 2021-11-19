@java.lang.Override
public void removeItem(int position) {
    databaseModel.deleteUserEntry(((de.szut.passkeeper.property.EntryProperty) (vectorEntryPropery.get(position))).getEntryId());
    vectorEntryPropery.remove(position);
    recyclerViewAdapter.refresh(vectorEntryPropery, position);
}