public void change(com.ankurdave.part.Node n) {
    (n.refcount)++;
    if ((get()) != null) {
        get().decrement_refcount();
    }
    set(n);
}