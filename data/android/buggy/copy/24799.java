@org.springframework.web.bind.annotation.RequestMapping(value = "/inserimentoPiede", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String inserimentoNuovoMateriale(org.springframework.ui.Model model) {
    it.sela3.Beans.Materiale bancale = it.sela3.Factories.MaterialeFactory.creaMateriale(Constants.PIEDE);
    model.addAttribute("Piede", piede);
    return "insertBancale";
}