@org.junit.jupiter.api.Test
void getNameTest1() {
    core.model.Database.setupDatabase();
    org.junit.jupiter.api.Assertions.assertEquals("Louis", booking.getCustName(1));
}