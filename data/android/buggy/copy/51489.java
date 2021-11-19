@java.lang.Override
public void onClick(android.view.View v) {
    isReadFolder = true;
    openBooksLayout.setVisibility(View.GONE);
    listBookLayout.setVisibility(View.VISIBLE);
    handleChooseFileLayout.setVisibility(View.VISIBLE);
    getDirectory(rootDirectory);
    showFileOptionButton(2);
}