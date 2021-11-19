public void internetProblems() {
    android.content.Intent startInternet = new android.content.Intent(this, nl.pcmeesters.pcmeestersnl.InternetProblemsActivity.class);
    startInternet.putExtra("User", acct);
    startActivity(startInternet);
}