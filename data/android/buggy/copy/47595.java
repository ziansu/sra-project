public void checkId(long id) {
    if (isChecked(id)) {
        mCheckedStateMap.put(id, false);
    }else {
        mCheckedStateMap.put(id, true);
    }
    notifyDataSetChanged();
}