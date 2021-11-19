@org.springframework.web.bind.annotation.RequestMapping(value = "/addForm")
public java.lang.String addForm(org.springframework.ui.Model model) {
    java.lang.String message = "Select request successfully completed";
    java.lang.String response = "Form is ready";
    model.addAttribute("greeting", com.omut.exampleWebApp.controller.AppController.greeting);
    model.addAttribute("message", message);
    model.addAttribute("response", response);
    return "addForm";
}