@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mParam = getArguments().getString(de.th_nuernberg.harwedu.labcert.fragment.AddStudentFragment.ARG_PARAM);
    }
}