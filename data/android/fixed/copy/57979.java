@java.lang.Override
public void bindAdapter() {
    model = new cn.edu.jxnu.awesome_campus.model.education.CourseScoreModel();
    adapter = new cn.edu.jxnu.awesome_campus.support.adapter.education.CourseScoreAdapter(getActivity(), model);
    recyclerView.setAdapter(adapter);
}