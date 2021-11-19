public boolean canBeSelected() {
    return (!(isDirectory())) && (getName().endsWith(".jpg"));
}