public java.lang.String label() {
    lbl = instruction.split("(")[0];
    lbl = lbl.split(")")[0];
    return lbl;
}