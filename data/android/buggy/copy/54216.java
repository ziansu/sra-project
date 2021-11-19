@org.junit.Test
@junitparams.Parameters(value = { "45000, 7200" , "50000, 9200" , "60000, 13200" , "100000, 29200" , "105500, 32500" })
public void calculate_tax_payable_for_higher_rate_band(int annualGrossSalaryAmount, int taxPayable) {
    es.rachelcarmena.domain.AnnualGrossSalary annualGrossSalary = new es.rachelcarmena.domain.AnnualGrossSalary(annualGrossSalaryAmount);
    org.junit.Assert.assertEquals(new es.rachelcarmena.domain.Amount(taxPayable), taxesCalculator.calculateTaxPayable(annualGrossSalary));
}