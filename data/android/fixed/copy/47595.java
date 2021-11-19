public void checkId(long id) {
    mCheckedStateMap.put(id, (!(isChecked(id))));
    notifyDataSetChanged();
}