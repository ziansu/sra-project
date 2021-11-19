public static boolean verifyCheckcode(group3.beef.employee.model.EmployeeVO empVO, java.lang.String checkCode) {
    if (group3.beef.mail.model.GenerateLinkUtils.generateCheckcode(empVO).equals(checkCode)) {
        return true;
    }else {
        return false;
    }
}