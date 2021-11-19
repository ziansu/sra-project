@java.lang.Override
public void onSubmissionClick(com.example.android.grader.models.Submission submission, java.lang.String assignmentTitle) {
    com.example.android.grader.fragments.SubmissionDetailFragment submissionDetailFragment = com.example.android.grader.fragments.SubmissionDetailFragment.newInstance(submission, assignmentTitle);
    fragmentManager.beginTransaction().replace(R.id.fragmentContainer, submissionDetailFragment, com.example.android.grader.activities.MainActivity.SUBMISSION_DETAIL_FRAGMENT).addToBackStack(null).commit();
}