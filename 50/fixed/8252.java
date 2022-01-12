@org.springframework.web.bind.annotation.RequestMapping(value = "/show/{id}")
public java.lang.String show(@org.springframework.web.bind.annotation.PathVariable
int id, org.springframework.ui.Model model) {
    initShow(model, id);
    return "train/show";
}