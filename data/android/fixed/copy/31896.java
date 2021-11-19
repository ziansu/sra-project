@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    double orderValue = ((double) (dataSnapshot.getValue()));
    android.util.Log.e("Order update:", ("" + orderValue));
    orderRef.setValue((orderValue + 1));
}