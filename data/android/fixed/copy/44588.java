@org.springframework.web.bind.annotation.RequestMapping(value = "/editCat")
public java.lang.String edit(java.lang.Long idCat, org.springframework.ui.Model model) {
    com.univ.angers.entities.Categorie c = metier.getCategorie(idCat);
    model.addAttribute("categorie", c);
    return "adminSystem";
}