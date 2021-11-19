@org.springframework.web.bind.annotation.RequestMapping(value = { "/" })
public java.lang.String index(org.springframework.ui.Model model) {
    if (!(categoriesCreated))
        subcategoryRepository.save(at.fh.swenga.project.data.Categories.FillCategories());
    
    categoriesCreated = true;
    return "index";
}