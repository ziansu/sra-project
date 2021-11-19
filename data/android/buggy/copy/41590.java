@org.springframework.web.bind.annotation.RequestMapping(value = "save", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String save(@org.springframework.web.bind.annotation.RequestParam
long id, org.springframework.ui.Model model) {
    com.appengine.task.domain.Task task = taskService.getTask(id);
    model.addAttribute("task", task);
    return "task/save";
}