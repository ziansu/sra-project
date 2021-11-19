@org.springframework.web.bind.annotation.RequestMapping(value = "/simpleemail")
@org.springframework.web.bind.annotation.ResponseBody
java.lang.String home() {
    try {
        sendEmail();
        return "Email Sent!";
    } catch (java.lang.Exception ex) {
        return "Error in sending email: " + ex;
    }
}