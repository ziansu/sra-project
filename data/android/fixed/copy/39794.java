public java.util.List<org.pirateatbay.mars.model.Especialista> getEspecialistas() {
    especialistas = ((especialistas) == null) ? findAll() : especialistas;
    return especialistas;
}