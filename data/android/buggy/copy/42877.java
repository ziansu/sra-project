public void setText(java.lang.String text) {
    if (text != null) {
        this.text = text;
        editText.setText(this.text);
        if (!(text.equals("")))
            activate(false);
        
    }
}