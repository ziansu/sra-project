@java.lang.Override
public java.lang.Boolean remove(java.lang.Integer ignore) {
    if (stack.isEmpty()) {
        return false;
    }else {
        stack.remove(stack.get(((size()) - 1)));
        return true;
    }
}