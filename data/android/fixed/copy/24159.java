public void add(java.lang.Character c) {
    if (!(characters.contains(c))) {
        characters.add(c);
    }
    reArrange();
}