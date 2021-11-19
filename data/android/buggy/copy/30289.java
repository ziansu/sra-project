public void change(com.ankurdave.part.Node n) {
    if ((get()) != null) {
        get().decrement_refcount();
    }
    (n.refcount)++;
    set(n);
}