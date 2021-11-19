@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    conn.Open();
    listBill = conn.getListBill();
    conn.Close();
}