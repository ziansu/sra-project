public double getNetAmount() {
    double result = ((((grossAmount) - (federalWithholdingTax)) - (stateWithholdingTax)) - (medicareWithholdingTax)) - (socialSecurityWithholdingTax);
    return result;
}