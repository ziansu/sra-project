private void checkBundle() {
    if ((getIntent().getExtras()) != null) {
        this.isEditing = getIntent().getExtras().getBoolean("isEditing");
    }else {
        this.isEditing = false;
    }
}