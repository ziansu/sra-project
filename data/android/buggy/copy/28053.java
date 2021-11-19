@java.lang.Override
public void bindAdapter() {
    model = new cn.edu.jxnu.awesome_campus.model.education.ExamTimeModel();
    adapter = new cn.edu.jxnu.awesome_campus.support.adapter.education.ExamTimeAdapter(getContext(), model);
    recyclerView.setAdapter(adapter);
    model.loadFromNet();
    displayLoading();
}