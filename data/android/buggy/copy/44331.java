void datainicial() {
    values = filmData.getAllFilmstitol();
    listViewAdapter = new android.widget.ArrayAdapter<com.example.pr_idi.movierecord.Film>(getActivity().getApplicationContext(), R.layout.list_item, R.id.txtitem, values);
    listView.setAdapter(listViewAdapter);
}