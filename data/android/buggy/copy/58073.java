public int twoscomplement(int b) {
    int bt = 255 & b;
    bt = 255 & ((255 - bt) + 1);
    return flags.adjust(bt);
}