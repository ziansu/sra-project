@org.springframework.web.bind.annotation.GetMapping(value = "/suppliers_entries_new")
public java.lang.String suppliersEntriesNew(org.springframework.ui.Model model) {
    java.util.List<com.gh.gov.ns.model.Institution> institutions = institutionRepository.getAllInstitutions();
    model.addAttribute("institutions", institutions);
    model.addAttribute("suppliersEntries", new com.gh.gov.ns.model.SuppliersEntries());
    return "suppliers_entries_new";
}