public java.util.List<has.Task.Task> organizeTasks(java.lang.Long employeeId) throws java.lang.Exception {
    has.Employee.EmployeeDTO employeeDTO = employeeService.transferEmployeeToDTO(employeeId, false);
    return repo.save(taskHandler.organizeTasks(employeeDTO));
}