@javax.validation.constraints.AssertTrue(message = "não pode ficar em branco, caso não seja preenchido a altura numérica.")
public boolean isLocalizacao2() {
    return !((((this.getLocalizacao2()) == null) || (this.getLocalizacao2().isEmpty())) && ((this.getAlturaNumerica()) == null));
}