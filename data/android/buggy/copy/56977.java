@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.detailed_item_screen_withpicker);
    init_views();
    setHomeButton();
    get_set_intentdata();
    setInitial_itemPrice();
    setTotalPrice_withquantity();
    send_data_tomainmenu();
}