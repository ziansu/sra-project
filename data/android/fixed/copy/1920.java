public boolean isEditing() {
    return ((getWorker()) != null) && (!(getWorker().isNewObject()));
}