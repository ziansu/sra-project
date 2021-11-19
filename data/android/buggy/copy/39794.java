public java.util.List<org.pirateatbay.mars.model.Especialista> getEspecialistas() {
    if ((especialistas) == null) {
        this.especialistas = this.findAll();
    }
    return especialistas;
}