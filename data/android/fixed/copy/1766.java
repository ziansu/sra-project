public void update() {
    data = com.wagner.marcel.ManagedSettings.Generaldata.Modeprocessing.ModeFactory.getModeListArray(getContext());
    adapter = new android.widget.ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, data);
    listView.setAdapter(adapter);
    getActivity().recreate();
}