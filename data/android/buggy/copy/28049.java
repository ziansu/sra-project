@org.springframework.web.bind.annotation.RequestMapping(value = "/listar/anuncios", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView getPageListarAnuncios() {
    org.springframework.web.servlet.ModelAndView model = new org.springframework.web.servlet.ModelAndView();
    model.addObject("anuncios", anuncioService.getAnuncioRepository().findAll());
    model.setViewName("sharedProfile/listar_anuncios");
    return model;
}