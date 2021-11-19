@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.classify = getArguments().getString(com.laudandjolynn.mytv.ProgramTableFragment.ARG_CLASSIFY);
    this.date = getArguments().getString(com.laudandjolynn.mytv.ProgramTableFragment.ARG_AIR_DATE);
}