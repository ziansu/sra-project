@org.springframework.web.bind.annotation.RequestMapping(value = "testTicket")
public void testTicket() {
    java.lang.System.out.println("test the ticket");
    com.gc.model.Seat s = dataService.findSeatById(1);
    java.lang.System.out.println(("seat:" + s));
}