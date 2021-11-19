@java.lang.Override
public void onClick(android.view.View v) {
    if ((getActivity()) instanceof adonai.diary_browser.PasteSelector.PasteAcceptor)
        ((adonai.diary_browser.PasteSelector.PasteAcceptor) (getActivity())).acceptDialogClick(v, mShouldPaste.isChecked());
    
    dismiss();
}