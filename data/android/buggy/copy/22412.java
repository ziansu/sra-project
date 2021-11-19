@org.springframework.web.bind.annotation.RequestMapping(value = "/submitEvent", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String submitEvent(org.springframework.ui.ModelMap model, @org.springframework.web.bind.annotation.RequestParam(value = "eventTitle")
java.lang.String title, @org.springframework.web.bind.annotation.RequestParam(value = "eventDesc")
java.lang.String desc, @org.springframework.web.bind.annotation.RequestParam(value = "date")
java.lang.String date, @org.springframework.web.bind.annotation.RequestParam(value = "eventClass")
java.lang.String postClass, @org.springframework.web.bind.annotation.RequestParam(value = "type")
java.lang.String type) {
    return postService.submitEvent(title, desc, date, java.lang.Integer.parseInt(postClass), type);
}