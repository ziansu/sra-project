@java.lang.Override
public void onResume() {
    super.onResume();
    currentIndex = savedValues.getInt("index", 0);
    displayContent(currentIndex);
}