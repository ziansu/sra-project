public it.unipv.payroll.model.Employee findEmployeeByCode(java.lang.String code) {
    loggedUser = emController.find(code);
    return loggedUser;
}