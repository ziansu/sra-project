@java.lang.Override
public void onPositive(com.afollestad.materialdialogs.MaterialDialog dialog) {
    deleteItem(id);
    android.widget.Toast.makeText(getActivity(), "Item deleted", Toast.LENGTH_SHORT).show();
    content = "";
    getActivity().getSupportFragmentManager().popBackStack("editor", FragmentManager.POP_BACK_STACK_INCLUSIVE);
}