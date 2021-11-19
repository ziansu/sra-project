@java.lang.Override
public void onItemMove(int fromPosition, int toPosition) {
    java.util.Collections.swap(categoryList, fromPosition, toPosition);
    android.util.Log.d("ZHAP", ((("2 moved from " + fromPosition) + " to ") + toPosition));
}