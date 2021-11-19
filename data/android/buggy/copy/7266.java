@java.lang.Override
public void onResume() {
    super.onResume();
    if ((state) != 0) {
        currentIndex = savedValues.getInt("index", 0);
        displayContent(currentIndex);
    }
    (state)++;
}