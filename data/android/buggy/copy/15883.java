public boolean update() {
    state = next;
    next = 0;
    java.lang.System.out.println(((state) + " state"));
    if ((state) == 1)
        return true;
    else
        return false;
    
}