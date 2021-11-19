@org.springframework.web.bind.annotation.RequestMapping(value = "")
public java.lang.String schedule(org.springframework.ui.Model model) {
    model.addAttribute("schedules", scheduleDao.findAll());
    model.addAttribute("title", "SCW Football Schedule");
    return "schedule/index";
}