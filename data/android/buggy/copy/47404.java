@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    java.lang.Long orderValue = ((java.lang.Long) (dataSnapshot.getValue()));
    android.util.Log.e("Order update:", ("" + orderValue));
    orderRef.setValue((orderValue - 1));
}