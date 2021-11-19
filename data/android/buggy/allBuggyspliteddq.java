@java.lang.Override
public void onClick(android.view.View v) {
    listener.onItemClick(expense);
}

@org.junit.Test
public void testMoodEventMarker() {
    java.lang.String trigger = "trigger";
    com.example.moodswing.moodswing_000.EmotionalState emotionalState = new com.example.moodswing.moodswing_000.EmotionalState("happy", "somewhere", android.graphics.Color.BLACK);
    com.example.moodswing.moodswing_000.MoodEvent moodEvent = new com.example.moodswing.moodswing_000.MoodEvent("username1", emotionalState, trigger, null, null, null);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((remDP) != null) {
        remDateTxt.setText(s.toString());
        updateRemDate(remDateTxt.getText().toString());
    }
}

public int getCurrentPosition() {
    android.util.Log.e("ForecastArrayAdapter", ("getCurrentPosition" + (currentPosition)));
    printisFlipp("getCurrentPosition");
    return currentPosition;
}

protected synchronized void removeLeftwards(android.view.View view, int position) {
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        removeItem(position);
        animateOut(view, R.anim.slide_out_left, 150);
    }
}

public void set(java.lang.String var, java.lang.String value) {
    try {
        interpreter.set(var, value);
    } catch (bsh.EvalError e) {
        au.org.intersect.faims.android.log.FLog.i("error executing code", e);
        showWarning("Logic Error", "Error encountered in logic script");
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Context context = v.getContext();
    android.content.Intent intent = new android.content.Intent(context, AlbumAdapter.MovieDetailsActivity.class);
    intent.putExtra(Constants.EXTRA_POSITION, getAdapterPosition());
    context.startActivity(intent);
}

public <T> void attachDataSource(@android.support.annotation.NonNull
java.util.List<T> dataset) {
    adapter = new org.angmarch.views.NiceSpinnerAdapter(getContext(), dataset, textColor, backgroundSelector);
    setAdapterInternal(adapter);
}

@java.lang.Override
public void finish() {
    android.content.Intent intent = new android.content.Intent();
    intent.putParcelableArrayListExtra("workList", toReturn);
    intent.putExtra("index", index);
    setResult(anvenkat.calpoly.edu.studybuddiesv02.RESULT_OK, intent);
    super.finish();
}

@java.lang.Override
public void run() {
    try {
        bmp = android.graphics.BitmapFactory.decodeStream(urlimage.openConnection().getInputStream());
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
public void onRefresh() {
    setupRecycler();
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mRefresher.setRefreshing(false);
        }
    }, 2500);
    onItemsChanged();
}

public void done(com.parse.ParseException e) {
    if (e == null) {
        startService(serviceIntent);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "There was an error signing up.", Toast.LENGTH_LONG).show();
    }
}

public void turnOver() {
    if ((android.os.Build.VERSION.SDK_INT) >= 16)
        this.button.setBackground(back);
    else
        this.button.setBackgroundDrawable(back);
    
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getContext(), "OK", Toast.LENGTH_LONG).show();
    com.example.haitran.cura.fragments.CustomDialogChoiceFolderToSave customDialogChoiceFolderToSave = new com.example.haitran.cura.fragments.CustomDialogChoiceFolderToSave(getActivity(), mData);
    customDialogChoiceFolderToSave.onCreateDialog();
}

@java.lang.Override
public void onClick(android.view.View view) {
    startChronometer();
    android.content.Intent intent = new android.content.Intent(this, com.example.mykola.cleancity.screen.FeedbackActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    startActivity(intent);
}

@butterknife.OnClick(value = R.id.limegreenButton)
public void limeGreenButton(android.view.View view) {
    checkButtonsAnswer(view.getBackground());
}

