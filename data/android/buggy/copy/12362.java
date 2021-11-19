@java.lang.Override
public void onBackPressed() {
    getFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
    super.onBackPressed();
}