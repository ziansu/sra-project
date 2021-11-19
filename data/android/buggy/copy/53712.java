public void update(com.goit.popov.restaurant.model.Employee employee) {
    com.goit.popov.restaurant.model.Employee emp = transform(employee);
    employeeDAO.update(employee);
    com.goit.popov.restaurant.service.EmployeeService.logger.info(("Updated employee: " + employee));
}