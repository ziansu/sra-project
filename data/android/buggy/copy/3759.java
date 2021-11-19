@java.lang.Override
public void onClick(android.view.View v) {
    if ((mathText.length()) != 0)
        mathText.append("0");
    
    resultView.setText(mathText);
}