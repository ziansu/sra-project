public void startButtonAction(android.view.View view) {
    for (android.widget.CheckBox check : checkBoxes)
        if (!(check.isChecked()))
            return ;
        
    
    android.content.Intent intent = new android.content.Intent(this, com.rizz.pdf.pdfsensing.FullscreenActivity.class);
    startActivity(intent);
}