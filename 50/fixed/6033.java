private SalarySlipKata.domain.GBP perMonth(SalarySlipKata.domain.GBP value) {
    return value.divideBy(SalarySlipKata.application_service.SalarySlipApplication.TWELVE_MONTHS);
}