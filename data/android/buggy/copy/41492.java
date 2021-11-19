@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if (enterAmount_editText.getText().toString().equals("")) {
        clear_Button.performClick();
    }else
        calculateBill();
    
}