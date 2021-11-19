public void setNaam(java.lang.String naam) {
    if ((naam == null) || (naam.trim().isEmpty())) {
        throw new domain.DomainException("Naam mag niet leeg zijn");
    }
    this.naam = naam;
}