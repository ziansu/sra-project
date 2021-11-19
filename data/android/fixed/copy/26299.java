@org.junit.Test
public void RentingAVehicleTest() {
    rental.Vehicle car = new rental.Vehicle("Mercedes-Benz", "CLS", 2015, 79);
    this.agency.addVehicle(car);
    assertEquals(this.agency.rentVehicle(this.client, car), 79);
}