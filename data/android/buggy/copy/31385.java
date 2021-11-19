@java.lang.Override
public void modificarRuta(com.google.android.gms.maps.model.LatLng miPosicion) {
    controlador.obtenerRuta(this, ubicacion, miPosicion);
    cambiarFragmento(fragMapa, fragRincones, fragMisRincones, getString(R.string.fragmento_mapa));
}