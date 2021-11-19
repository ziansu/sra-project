@org.springframework.web.bind.annotation.RequestMapping(value = { "/ioss/knowledge/saveDataTrigger" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String saveDataTrigger(@org.springframework.web.bind.annotation.RequestParam
java.lang.String filePath) {
    ticketOperator.saveTicketMainInfo(filePath);
    return "SUCCESS";
}