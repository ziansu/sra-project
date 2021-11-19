@java.lang.Override
protected void onPostResume() {
    super.onPostResume();
    this.tabAdapter = new com.example.matteoaldini.lessonmanager.adapters.TabAdapter(this.getSupportFragmentManager());
    pager.setAdapter(this.tabAdapter);
}