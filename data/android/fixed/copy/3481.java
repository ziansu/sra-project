@java.lang.Override
public char peek(long offset) {
    return data[((int) ((position) + offset))];
}