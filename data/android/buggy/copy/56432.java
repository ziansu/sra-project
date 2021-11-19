@java.lang.Override
public java.lang.CharSequence subSequence(int start, int end) {
    return new dfh.grammar.ReversedCharSequence(zero, ((zero) - end), (end - start), s, reversed);
}