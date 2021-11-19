@org.springframework.web.bind.annotation.RequestMapping(value = "/atualizar_acervo", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String atualizarAcervo(org.springframework.ui.ModelMap modelMap, javax.servlet.http.HttpSession session) {
    java.util.List<br.ufc.npi.gal.model.AcervoDocumento> atualizacoesRealizadas = acervoDocumentoService.find(br.ufc.npi.gal.model.AcervoDocumento.class);
    modelMap.addAttribute("atualizacoesRealizadas", atualizacoesRealizadas);
    modelMap.addAttribute("atualizacaoAcervo", new br.ufc.npi.gal.model.AcervoDocumento());
    return "acervo/atualizar";
}