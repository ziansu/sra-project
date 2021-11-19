@java.lang.Override
public void onClick(android.view.View v) {
    txtScreen.append(b1.getText());
    if ((isFirstNumeric) && ((oneOperator) >= 1))
        isLastNumeric = true;
    
    isFirstNumeric = true;
}