public void closeSingleton() {
    com.example.zoardgeocze.clickonmap.Singleton.SingletonFacadeController.INSTANCE = null;
    android.util.Log.d("Teste", "Matei singleton");
}