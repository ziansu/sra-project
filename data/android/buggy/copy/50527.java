@java.lang.Override
public void onResume() {
    super.onResume();
    if ((in.silive.scrolls.Fragments.Register.collegeIds.size()) == 0) {
        loadCollegeList();
    }
}