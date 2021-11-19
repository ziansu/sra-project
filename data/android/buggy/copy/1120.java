@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    com.kit10.csci448.catastrophe.GameFragment.mHandler = getHandler();
}