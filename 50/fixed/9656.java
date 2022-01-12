@com.fasterxml.jackson.annotation.JsonProperty(value = "age")
@com.fasterxml.jackson.annotation.JsonView(value = { JView.CardView.class , JView.InvitationView.class })
public java.lang.Integer getAge() {
    if ((getBirthday()) == null)
        return null;
    
    java.time.LocalDate now = java.time.LocalDate.now();
    java.time.Period age = java.time.Period.between(getBirthday(), now);
    return age.getYears();
}