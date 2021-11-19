public static com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment newInstance() {
    com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment fragment = new com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment();
    android.os.Bundle args = new android.os.Bundle();
    com.example.evoca.evocaforandroidlearning.fragments.CheckBoxFragment.exercise = ListActivity.lesson.getExam_questions().get(ListActivity.exerciseIndex);
    return fragment;
}