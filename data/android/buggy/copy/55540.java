public java.util.List<org.pirateatbay.mars.model.Especialista> findAll() {
    java.util.List<org.pirateatbay.mars.model.Especialista> especialistas = especialistaDao.findAll();
    return especialistas;
}