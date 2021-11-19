@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mStudentsDbHandler = new com.studios.lucian.students.util.StudentsDbHandler(getContext());
    mGroupDao = new com.studios.lucian.students.repository.GroupDAO(getActivity());
    mGroups = mGroupDao.getAll();
}