public void setComponents() {
    if (isEditing) {
        remove(text);
        add(field, java.awt.BorderLayout.WEST);
    }else {
        remove(field);
        add(text, java.awt.BorderLayout.WEST);
    }
    validate();
    repaint();
}