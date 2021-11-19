@org.springframework.web.bind.annotation.RequestMapping(value = "/sms/welcome/{name}/{phone_number}")
@org.springframework.web.bind.annotation.ResponseBody
public void sendSMS(@org.springframework.web.bind.annotation.PathVariable(value = "name")
java.lang.String name, @org.springframework.web.bind.annotation.PathVariable(value = "phone_number")
java.lang.String phoneNumber) {
    messageService.sendWelcomeMessage(phoneNumber, name);
}