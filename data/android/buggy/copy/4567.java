public void setNaam(java.lang.String naam) {
    if ((naam.trim().isEmpty()) || (naam == null)) {
        throw new domain.DomainException("Naam mag niet leeg zijn");
    }else {
        this.naam = naam;
    }
}