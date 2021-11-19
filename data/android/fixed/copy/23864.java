public boolean isOlderThan(com.gumtree.addressbookanalyser.domain.Person other) {
    return (this.dateOfBirth.compareTo(other.dateOfBirth)) < 0;
}