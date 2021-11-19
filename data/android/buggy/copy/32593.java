@com.softserve.edu.documents.document.meta.Placeholder(name = "VERIFICATOR_EMPLOYEE_MAIL")
public java.lang.String getVerificatorEmployeeMail() {
    com.softserve.edu.entity.user.User verificatorEmployee = getVerification().getStateVerificatorEmployee();
    if (verificatorEmployee != null) {
        return verificatorEmployee.getEmail();
    }
    return "None";
}