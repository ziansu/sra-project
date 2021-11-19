@java.lang.Override
public void onClick(android.view.View view) {
    startActivityForResult(new android.content.Intent(getActivity(), ru.ifmo.md.lesson8.AddCity.class), REQUEST_ADD_CITY);
}