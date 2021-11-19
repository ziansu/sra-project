public void makeUnseen(java.lang.Integer i) {
    seen.remove(i);
    if (!(unseen.contains(i)))
        unseen.add(i);
    
}