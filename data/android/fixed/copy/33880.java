public void setComponents() {
    if (isEditing) {
        remove(text);
        add(field, 0);
    }else {
        remove(field);
        add(text, 0);
    }
    validate();
    repaint();
}