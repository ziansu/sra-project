@org.junit.Test
public void testCreateEmployee() {
    com.example.domain.Employee emp = new com.example.domain.Employee("Krishna");
    emp = employeeService.create(emp);
    org.junit.Assert.assertNotNull(emp.getOid());
}