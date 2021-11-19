public java.util.List<org.pirateatbay.mars.model.Especialista> findAll() {
    especialistas = especialistaDao.findAll();
    return especialistas;
}