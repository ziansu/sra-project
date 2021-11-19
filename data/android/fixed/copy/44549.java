public boolean isSpouseOf(com.isys315.familytree.family.Person that) {
    com.isys315.familytree.family.Person spouse = this.getSpouse();
    return (spouse != null) && ((spouse.getPersonId()) == (that.getPersonId()));
}