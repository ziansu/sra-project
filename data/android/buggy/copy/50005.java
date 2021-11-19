@org.springframework.web.bind.annotation.RequestMapping(value = "/registerNewSynagogue", method = org.springframework.web.bind.annotation.RequestMethod.PUT)
public java.lang.String createSynagogue(@org.springframework.web.bind.annotation.RequestParam(value = "synagogueName")
java.lang.String synagogueName, @org.springframework.web.bind.annotation.RequestParam(value = "address")
java.lang.String address) {
    synagogueService.addNewSynagogue(synagogueName, address);
    return null;
}