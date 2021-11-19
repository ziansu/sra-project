public ListItem pop() {
    if (!(this.list.isEmpty())) {
        return this.list.remove(0);
    }
    return null;
}