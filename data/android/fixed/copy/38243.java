@org.springframework.web.bind.annotation.RequestMapping(value = { "/" + (co.porkopolis.utils.FileConstants.INDEX) })
public java.lang.String index(@org.springframework.web.bind.annotation.ModelAttribute
co.porkopolis.model.BasicSummoner summoner, org.springframework.ui.Model model) {
    if ((summoner.name) != null) {
        return co.porkopolis.utils.FileConstants.INDEX;
    }else {
        return co.porkopolis.utils.FileConstants.HOME_PAGE;
    }
}