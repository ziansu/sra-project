public void onClick(android.content.DialogInterface dialog, int which) {
    android.content.res.Resources res = getResources();
    java.lang.String[] choices = res.getStringArray(R.array.choices);
    mChoice = choices[which].toLowerCase();
}