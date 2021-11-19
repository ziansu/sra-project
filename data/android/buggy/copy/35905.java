private void updateStDev(int col) {
    if ((height) < 5) {
        return ;
    }
    deviations[col] = com.calculator.aa.calc.Calc.stdevYields(getCol(col), averages[col]);
}