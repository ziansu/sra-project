@org.springframework.web.bind.annotation.PostMapping(value = "/merchant/add")
public java.lang.String addNewMerchant(@javax.validation.Valid
com.capstone_project.models.Merchant merchant, @javax.validation.Valid
com.capstone_project.models.Category merchantCategory, @org.springframework.web.bind.annotation.RequestParam(name = "category")
java.lang.String category) {
    merchantRepo.save(merchant);
    return "redirect:/home";
}