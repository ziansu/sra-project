public void deleteEspecialista() {
    org.pirateatbay.mars.model.Especialista e = especialistaDao.find(especialista.getIdEspecialista());
    java.lang.System.out.println(especialista.getIdEspecialista());
    especialistaDao.delete(e);
}