@org.springframework.web.bind.annotation.RequestMapping(value = "/member/delete.html", method = org.springframework.web.bind.annotation.RequestMethod.GET)
private java.lang.String edit(@org.springframework.web.bind.annotation.RequestParam
java.lang.Integer memberId) {
    formgenerator.model.Member member = memberDao.getMember(memberId);
    java.lang.Boolean result = memberDao.delete(member);
    return "redirect:list.html";
}