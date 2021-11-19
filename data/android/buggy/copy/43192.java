@org.springframework.web.bind.annotation.RequestMapping(value = { "/ioss/knowledge/saveDataTrigger" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String saveDataTrigger() {
    ticketOperator.saveTicketMainInfo(null);
    return "SUCCESS";
}