public void ANDLW(int k) {
    int result = (getWRegister()) & k;
    if (result == 0) {
        setSTATUSbitZ(1);
    }
    setWRegister(result);
}