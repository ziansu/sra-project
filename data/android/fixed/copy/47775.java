@org.balaguta.currconv.web.ModelAttribute
public void setupModel(@org.balaguta.currconv.web.RequestParam(required = false)
java.lang.String results, org.balaguta.currconv.web.ConversionDto conversion, java.security.Principal principal, org.springframework.ui.ModelMap model) {
    if (principal != null) {
        setupAuthenticatedModel(results, model);
    }
}