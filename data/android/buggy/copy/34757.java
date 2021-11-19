@java.lang.Override
public void onFinish() {
    getActivity().getSupportFragmentManager().beginTransaction().remove(THIS_FRAGMENT).commit();
}