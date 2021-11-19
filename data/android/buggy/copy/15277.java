@org.springframework.web.bind.annotation.RequestMapping(value = (org.freeplace.cloudide.applicationinfo.Path.SLASH) + (Page.MAIN), method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getMainPage(org.springframework.ui.Model m) {
    if (true)
        throw new java.lang.NullPointerException((111 + ""));
    
    m.addAttribute("navigationPanel", navigationPanelService.loadMainNavigationPanel());
    return Page.MAIN;
}