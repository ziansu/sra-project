public void setItemsArray(final java.util.List<?> list) {
    android.widget.ArrayAdapter<?> adapter = new android.widget.ArrayAdapter(getContext(), android.R.layout.simple_spinner_item, list);
    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    setAdapter(adapter);
}