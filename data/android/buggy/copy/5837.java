public G pop() {
    G output = storage[i_head];
    if ((i_head) > 0) {
        i_head = (i_head) - 1;
    }else {
    }
    return output;
}