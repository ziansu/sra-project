@org.springframework.web.bind.annotation.RequestMapping(value = "editContact/{id}", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String editContact(@org.springframework.web.bind.annotation.ModelAttribute(value = "contact")
com.luckydron.domain.Contact contact, @org.springframework.web.bind.annotation.PathVariable
java.lang.Integer id) {
    this.contactRepository.editContact(contact, id);
    return "redirect:/";
}