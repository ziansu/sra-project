public static boolean deleteEmployee(java.lang.String employee_id) throws java.sql.SQLException {
    controller.SQL_Handler.stmt = controller.SQL_Handler.sql_statements.get("DelEmp");
    controller.SQL_Handler.stmt.setString(1, employee_id);
    return controller.SQL_Handler.stmt.execute();
}