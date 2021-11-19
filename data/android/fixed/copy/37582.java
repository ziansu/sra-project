@java.lang.Override
public int compareTo(com.ciandt.techgallery.persistence.model.profile.UserProfileItem arg0) {
    int endorsementsComparison = arg0.getEndorsementQuantity().compareTo(this.getEndorsementQuantity());
    return endorsementsComparison != 0 ? endorsementsComparison : this.getTechnologyName().compareTo(arg0.getTechnologyName());
}