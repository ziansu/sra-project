public boolean isVacancyLinkUnique(java.lang.Integer id, java.lang.String link) {
    ua.martynenko.vacancymvc.model.Vacancy vacancy = findVacancyByLink(link);
    return (vacancy == null) || ((id != null) && ((vacancy.getId()) == id));
}