@org.junit.Before
public void setUp() {
    strawberries = new ford.rahmir.produceManagerApp.model.Product("Strawberries", 28.5, 8);
    productlogic = new ford.rahmir.produceManagerApp.service.ProductLogic(strawberries);
}