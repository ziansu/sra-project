@org.junit.jupiter.api.BeforeAll
public static void setUpDB() {
    core.model.Database.getInstance();
    core.model.EmployeeTest.employee = new core.model.Employee(core.model.Database.getInstance());
}