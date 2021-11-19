@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putInt(Const.STEP_POS, stepPosition);
}