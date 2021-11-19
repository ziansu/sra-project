static long nextInSequence(long number) {
    return (number & 1) == 0 ? number / 2 : (number * 3) + 1;
}