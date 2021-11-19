public boolean isBound(int top, int nested) {
    return (((top * nested) < (maximum)) && (top > 0)) && (nested > 0);
}