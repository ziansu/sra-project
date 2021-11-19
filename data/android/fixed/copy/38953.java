@java.lang.Override
public void onDismiss(android.content.DialogInterface dialogInterface) {
    if ((getActivity()) != null) {
        ((com.door43.translationstudio.MainActivity) (getActivity())).closeKeyboard();
    }
}