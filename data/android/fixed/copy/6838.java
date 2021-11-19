@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.google.firebase.database.FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    com.example.gek.pizza.data.AllDishes.getInstance();
}