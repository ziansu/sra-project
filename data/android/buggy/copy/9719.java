public static boolean deleteEmployee(java.lang.String employee_id) throws java.sql.SQLException {
    controller.SQL_Handler.stmt = controller.SQL_Handler.sql_statements.get("DelEmp");
    controller.SQL_Handler.stmt.setString(1, employee_id);
    controller.SQL_Handler.rs = controller.SQL_Handler.stmt.executeQuery();
    return controller.SQL_Handler.employeeExists(employee_id);
}