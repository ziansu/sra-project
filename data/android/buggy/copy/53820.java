@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_map_select);
    msif = new com.unknown.navevent.interfaces.defaultImpl.MapSelectActivityLogicDefault(this);
    msif.onCreate(this);
}