@java.lang.Override
public void onClick(android.view.View v) {
    checkBox.performClick();
    if (!(mSelectFiles.contains(file))) {
        mSelectFiles.add(file);
    }else
        mSelectFiles.remove(file);
    
}