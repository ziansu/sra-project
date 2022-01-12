@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String processRegistration(web.quotes.data.User user) {
    userRepository.save(user);
    return "redirect:/users/" + (user.getUsername());
}