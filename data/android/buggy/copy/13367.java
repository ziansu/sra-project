@java.lang.Override
public void onPageSelected(int position) {
    currentText.setText(java.lang.String.format(getString(R.string.reading_current), position, listStories.size()));
}