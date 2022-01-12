@java.lang.Override
public void setText(java.lang.String text) {
    if ((text == null) || (text.isEmpty())) {
        super.setText(defaultText);
    }else {
        super.setText(text);
    }
}