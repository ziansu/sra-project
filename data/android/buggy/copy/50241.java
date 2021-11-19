public entity.Usuario createUsuario(java.lang.String cod) {
    entity.Usuario nuevo = new entity.Usuario(210437652, true);
    sesionBD.beginTransaction();
    sesionBD.save(nuevo);
    sesionBD.getTransaction().commit();
    return nuevo;
}