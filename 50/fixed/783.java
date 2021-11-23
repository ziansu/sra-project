private void addMissingBlanks(int index) {
    final int count = index - (this.list.size());
    for (int i = 0; i < count; i++)
        this.list.add(this.blankElement);
    
}