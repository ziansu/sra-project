@org.junit.Before
public void before() {
    methodList = new java.util.ArrayList<java.lang.String>();
    methodList.add("Credit Card");
    methodList.add("Debit Card");
    methodList.add("Paypal");
    customer = new com.codeclan.example.onestopshop.Customer(25.0);
}