@java.lang.Override
public void onClick(android.view.View v) {
    MainContent.setText(R.string.reverb_text);
    TitleContent.setText(R.string.reverb_title);
    if (ReverbButton.isChecked()) {
        ReverbButton.setBackgroundColor(Color.GREEN);
    }else
        ReverbButton.setBackgroundColor(Color.LTGRAY);
    
}