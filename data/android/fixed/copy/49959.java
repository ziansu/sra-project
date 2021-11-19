private io.realm.RealmResults<com.example.samu.poolmii.Beans.Trayecto> findAllTrayectosDia() {
    io.realm.RealmResults<com.example.samu.poolmii.Beans.Trayecto> resultadoTrayectos = realm.where(com.example.samu.poolmii.Beans.Trayecto.class).findAll();
    return resultadoTrayectos;
}