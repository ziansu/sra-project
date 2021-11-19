@org.springframework.web.bind.annotation.RequestMapping(value = "/editPage")
public java.lang.String editPage(java.lang.Integer id, org.springframework.ui.Model model) {
    com.wangzhixuan.model.PeopleTransfer peopleTransfer = peopleTransferService.findPeopleTransferById(id);
    model.addAttribute("peopleTransfer", peopleTransfer);
    return "/admin/peopleTransfer/peopleEdit";
}