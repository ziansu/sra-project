@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    shouldGetLocationFromUserData = false;
    if (count > 0) {
        shouldGetLocationFromLocationEditText = true;
    }else {
        shouldGetLocationFromUserData = false;
    }
}