@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putSerializable("image", image);
    outState.putInt("level", level);
}