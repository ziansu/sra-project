private void clear() {
    if ((mInput.length()) == 0) {
        return ;
    }
    mInput.deleteCharAt(((mInput.length()) - 1));
    evaluate();
}