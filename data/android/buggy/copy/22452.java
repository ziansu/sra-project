@org.springframework.web.bind.annotation.RequestMapping(value = "staff", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public void saveStaff(@org.springframework.web.bind.annotation.RequestBody
it.adfor.rapportino.controller.Staff staff) {
    staffRepository.save(new it.adfor.rapportino.controller.Staff(staff.getName(), staff.getSname(), staff.getFiscal(), staff.getDescription(), staff.getCompany()));
}