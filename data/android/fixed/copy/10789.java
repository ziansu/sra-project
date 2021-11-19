@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    PhoneCode.setText(("+" + (myCountries.get(position).getCode())));
    CountryPos = position;
}