@org.springframework.web.bind.annotation.RequestMapping(path = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String home(org.springframework.ui.Model model) {
    java.util.ArrayList<com.theironyard.Message> messageList = ((java.util.ArrayList) (messages.findAll()));
    model.addAttribute("messages", messageList);
    return "home";
}