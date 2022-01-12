@java.lang.Override
public void onClick(android.view.View v) {
    if (listener != null) {
        listener.onItemClick(expense);
    }
}

@org.junit.Test
public void testMoodEventMarker() {
    java.lang.String trigger = "trigger";
    com.example.moodswing.moodswing_000.EmotionalState emotionalState = new com.example.moodswing.moodswing_000.EmotionalState("happy", "somewhere", android.graphics.Color.BLACK);
    com.example.moodswing.moodswing_000.MoodEvent moodEvent = new com.example.moodswing.moodswing_000.MoodEvent("username1", emotionalState, trigger, null, null, null, null);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((remDP) != null) {
        remDateTxt.setText(s.toString());
    }
}

public int getCurrentPosition() {
    return currentPosition;
}

public synchronized void removeLeftwards(android.view.View view, int position) {
    if (position != (android.support.v7.widget.RecyclerView.NO_POSITION)) {
        animateOut(view, position, R.anim.slide_out_left, 150);
    }
}

public void set(java.lang.String var, java.lang.String value) {
    try {
        interpreter.set(var, value);
    } catch (java.lang.Exception e) {
        au.org.intersect.faims.android.log.FLog.i("error executing code", e);
        showWarning("Logic Error", "Error encountered in logic script");
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
}

public <T> void attachDataSource(java.util.List<T> list) {
    adapter = new org.angmarch.views.NiceSpinnerAdapter(getContext(), list, textColor, backgroundSelector);
    setAdapterInternal(adapter);
}

@java.lang.Override
public void finish() {
    super.finish();
}

@java.lang.Override
public void run() {
    try {
        if ((bmp) != null)
            bmp = android.graphics.BitmapFactory.decodeStream(urlimage.openConnection().getInputStream());
        
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}

@java.lang.Override
public void onRefresh() {
    new android.os.Handler().postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            mRefresher.setRefreshing(false);
            setupRecycler();
            onItemsChanged();
        }
    }, 2500);
}

public void done(com.parse.ParseException e) {
    if (e == null) {
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "There was an error signing up.", Toast.LENGTH_LONG).show();
    }
}

public void turnOver() {
    if ((android.os.Build.VERSION.SDK_INT) >= 16) {
        this.button.setBackground(back);
    }else {
        this.button.setBackgroundDrawable(back);
    }
    this.button.setEnabled(false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.haitran.cura.fragments.CustomDialogChoiceFolderToSave customDialogChoiceFolderToSave = new com.example.haitran.cura.fragments.CustomDialogChoiceFolderToSave(getActivity(), mData);
    customDialogChoiceFolderToSave.onCreateDialog();
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.example.mykola.cleancity.screen.FeedbackActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    startActivity(intent);
}

@butterknife.OnClick(value = R.id.limegreenButton)
public void limeGreenButton(android.view.View view) {
    checkButtonsAnswer(view);
}

