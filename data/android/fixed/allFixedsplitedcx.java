@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    progressBar = ((android.widget.ProgressBar) (activity.findViewById(R.id.mainProgressBar)));
    if ((progressBar) != null) {
        progressBar.setVisibility(ProgressBar.VISIBLE);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((myLocation) != null) {
        com.amap.api.maps2d.CameraUpdate update = com.amap.api.maps2d.CameraUpdateFactory.changeLatLng(myLocation);
        mAMap.animateCamera(update);
    }
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    super.onCreateOptionsMenu(menu);
    menu.add(0, com.android.demo.notepad1.Notepadv1.INSERT_ID, 0, R.string.menu_insert);
    return true;
}

private boolean shouldShowBoxAndPagesAnimation() {
    return getPostListType().isTagType();
}

@java.lang.Override
public void onEnabled(android.content.Context context) {
    android.util.Log.i(org.thecosmicfrog.luasataglance.widget.StopForecastWidget.LOG_TAG, "Widget first created.");
}

private void handleFirstRun() {
    if (com.darkrockstudios.iot.adventurephotoframe.Settings.getFirstRun(this)) {
        startActivity(new android.content.Intent(this, com.darkrockstudios.iot.adventurephotoframe.WelcomeActivity.class));
    }
}

public static layout.StreamFragment newInstance(android.content.Context context, java.lang.String value) {
    layout.StreamFragment fragment = new layout.StreamFragment(context);
    android.os.Bundle args = new android.os.Bundle();
    args.putString("key", value);
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
public void onDestroy() {
    if ((startIntent) != null) {
        android.support.v4.content.WakefulBroadcastReceiver.completeWakefulIntent(startIntent);
        startIntent = null;
    }
    super.onDestroy();
}

private int getPageCount() {
    if ((renderer) == null)
        return 0;
    
    return renderer.getPageCount();
}

private android.view.View bindUI(android.view.View root) {
    listView = ((android.widget.ListView) (root.findViewById(R.id.PXForm_linearPanel)));
    return root;
}

@com.mindorks.placeholderview.annotations.swipe.SwipeCancelState
private void onSwipeCancelState() {
}

public static rx.Observable<java.lang.Boolean> createObservable(android.content.Context ctx, com.google.android.gms.location.LocationRequest locationRequest) {
    return rx.Observable.create(new pl.charmas.android.reactivelocation.observables.location.LocationSettingsObservable(ctx, locationRequest, false));
}

@java.lang.Override
public void onClick(android.view.View view) {
    if (AudioListActivity.audioListIsActive)
        finish();
    else {
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), me.samuki.musicandspeed.AudioListActivity.class);
        startActivity(intent);
        finish();
    }
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        booster.mingliu.boostertest.models.QuestionModelManager.getsInstance().setCurOption(finalPos);
    }
    org.greenrobot.eventbus.EventBus.getDefault().post(new booster.mingliu.boostertest.events.QuestionCheckedEvent());
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
}

private void initPaint() {
    mPaint = new android.graphics.Paint();
    mPaint.setAntiAlias(true);
    mPaint.setTextAlign(Paint.Align.CENTER);
    mPaint.setColor(mTextColor);
    mPaint.setTextSize(mTextSize);
}

@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onPoisAndNotesDownloadedEvent(io.mapsquare.osmcontributor.core.events.PoisAndNotesDownloadedEvent event) {
    mapFragment.showProgressBar(false);
    forceRefreshPoi = true;
    loadPoisIfNeeded();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_goals, container, false);
    initializeGUI();
    setInitialValues();
    finalizeGUI();
    return view;
}

protected void showSimpleSnackbar(int mainTextResource, boolean shortLength) {
    android.view.View root = findViewById(R.id.root_layout);
    showSnackbar(mainTextResource, shortLength, (-1), null, root);
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    if (((videosAdapter) != null) && ((com.google.android.exoplayer2.util.Util.SDK_INT) > 23)) {
        videosAdapter.releasePlayers();
    }
}

@java.lang.Override
protected java.lang.String getSQL() {
    return androidSQLiteSt.toString().substring("SQLiteProgram: ".length());
}

@android.support.annotation.Nullable
public java.lang.String getSupervisor(int i) {
    i--;
    if ((i < (sections.length)) && (i >= 0))
        return sections[i].getSupervisor();
    
    return null;
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if ((placeLocateResults) != null) {
        outState.putParcelable(com.doglandia.geogame.activity.RecentLocationsActivity.PLACE_LOCATE_RESULTS, org.parceler.Parcels.wrap(placeLocateResults));
    }
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public void onClick(android.view.View v) {
    showNotifyTimeDialog(spinnerCardView.getSpinnerStops().getSelectedItem().toString(), inboundStopForecastCardView.getTextViewStopTimes(), index);
}

@java.lang.Override
public boolean onPrepareActionMode(android.support.v7.view.ActionMode actionMode, android.view.Menu menu) {
    return true;
}

public void onSaveInstanceState(android.os.Bundle saveInstanceState) {
    super.onSaveInstanceState(saveInstanceState);
    saveInstanceState.putBoolean(geoquiz.android.bignerdranch.com.geoquiz.CheatActivity.EXTRA_ANSWER_SHOWN, mIsCheater);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.main_activity_actions, menu);
    return super.onCreateOptionsMenu(menu);
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    com.vijay.jsonwizard.widgets.TreeViewFactory.changeEditTextValue(editText, "", "");
    return true;
}

public void glUniform1(int location, java.nio.IntBuffer value) {
    android.opengl.GLES20.glUniform1iv(location, com.jme3.renderer.android.AndroidGL.getLimitCount(value, 1), value);
}

@java.lang.Override
protected void onPreExecute() {
    progDailog = new android.app.ProgressDialog(this);
    progDailog.setMessage("Chargement des fiches...");
    progDailog.setIndeterminate(false);
    progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
    progDailog.setCancelable(false);
    progDailog.show();
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    onActivityShareResult(requestCode, resultCode, data);
    super.onActivityResult(requestCode, resultCode, data);
}

@java.lang.Override
public void onTap(org.osmdroid.views.overlay.OverlayItem item, android.content.ContentValues values) {
    markItem(values, false);
}

public void setInnerXML(android.view.ViewGroup parentView, java.lang.String parentClassName, java.lang.String markup, android.view.View viewRef) {
    if (parentClassName == null)
        parentClassName = parentView.getClass().getName();
    
    setInnerXMLInsertPageFragment(parentView, parentClassName, markup, viewRef);
}

public void run() {
    android.widget.Toast.makeText(getApplicationContext(), getString(R.string.connection_failed), Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void handleMessage(android.os.Message msg) {
    float second = ((float) (msg.obj));
    if ((youTubeListener) != null) {
        youTubeListener.onCurrentSecond(second);
    }
}

@java.lang.Override
public void onLocationFailed() {
}

@java.lang.Override
public void onResourceReady(android.graphics.Bitmap resource, com.bumptech.glide.request.animation.GlideAnimation<? super android.graphics.Bitmap> glideAnimation) {
    mBitmaps.put(i, resource);
    refresh(i);
}

@java.lang.Override
public void onClick(android.view.View v) {
    imageViewResult4.setBackgroundColor(getResources().getColor(R.color.Brown));
    band4 = 1;
    doCalc();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    ch.bailu.aat.helpers.AppLog.i(context, ch.bailu.aat.helpers.AppBroadcaster.getFile(intent));
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (co.smartreceipts.android.BuildConfig.DEBUG) {
        android.util.Log.d(co.smartreceipts.android.fragments.ReceiptsFragment.TAG, "onCreate");
    }
    mCurrentTrip = getArguments().getParcelable(Trip.PARCEL_KEY);
}

private void initUI() {
    setSupportActionBar(toolbar);
    listview.setAdapter(adapter);
    listview.setLayoutManager(new android.support.v7.widget.GridLayoutManager(this, 3));
}

private void showOpen311ProblemFragment(edu.usf.cutr.open311client.models.Service service, org.onebusaway.android.io.elements.ObaArrivalInfo obaArrivalInfo) {
    org.onebusaway.android.report.ui.Open311ProblemFragment.show(this, R.id.ri_report_stop_problem, mOpen311, service, obaArrivalInfo, mAgencyName);
}

@java.lang.Override
public void onClick(android.view.View view) {
    attemptLogin();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if ((receiveDataService) != null) {
        onReceivingData();
    }
}

@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((adapter) != null) {
        adapter.filter(s.toString());
        addFooterHandler(s.toString());
    }
}

public java.lang.String weatherIcon() {
    return weatherIconID;
}

@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.drive.DriveFolder.DriveFileResult result) {
    if (!(result.getStatus().isSuccess())) {
        showMessage("Error while trying to create the file");
        finish();
        return ;
    }
    showMessage("Backup Success!");
    finish();
}

@butterknife.OnClick(value = R.id.tipDialog)
public void tipDialog(android.view.View v) {
    com.bryan.lib.dialog.FastDialog.ShowTipDialog(context, "提示", "你今天的抢购名额已用完~", new com.flyco.dialog.listener.OnBtnClickL() {
        @java.lang.Override
        public void onBtnClick() {
            com.bryan.lib.util.T.showShort(context, "确定");
        }
    });
}

@java.lang.Override
protected void onStart() {
    android.util.Log.d(com.mixey69.roulettevideochat.MainActivity.LOG_TAG, "onStart");
    super.onStart();
    mConnectionManager.init(this);
}

@java.lang.Override
@android.annotation.TargetApi(value = Build.VERSION_CODES.HONEYCOMB)
public void onBuildHeaders(java.util.List<com.example.abhijeetsinghkgp.popularmovies.Header> target) {
    loadHeadersFromResource(R.xml.pref_headers, target);
}

public void onClick(android.view.View v) {
    this.changeExpress(ivLike, ivDislike, tvLikeCount, true, false, llLikeAnimator);
}

@java.lang.Override
public boolean onJsAlert(android.webkit.WebView view, java.lang.String url, java.lang.String message, android.webkit.JsResult result) {
    if ((mWebChromeClient) != null) {
        return mWebChromeClient.onJsAlert(view, url, message, result);
    }
    return false;
}

@java.lang.Override
public void onClick(android.view.View view) {
    init_twitter_data(1);
}

private void removeSubForm() {
    formLayout.setVisibility(com.auth0.android.lock.views.VISIBLE);
    if ((this.subForm) != null) {
        removeView(this.subForm);
        this.subForm = null;
    }
}

private void holdButtonEndTouch(android.view.View view) {
    if ((buttonPressCountDown) != null) {
        buttonPressCountDown.cancel();
    }
    if ((currentTeamCapture) == 0) {
        blockButton(0);
    }
}

@java.lang.Override
protected void populateView(android.view.View view, com.travelersdiary.models.Travel travel, int position) {
    ((android.widget.TextView) (view.findViewById(android.R.id.text1))).setText(travel.getTitle());
}

public static java.lang.String getApplicationStorageRootPath() {
    return ((android.os.Environment.getExternalStorageDirectory().getPath()) + "/") + (com.fezrestia.android.localcheckpointscheduler.storage.StorageController.ROOT_DIR_PATH);
}

public void onClick(android.view.View v) {
    android.content.Intent intentSubmitSMS = new android.content.Intent(v.getContext(), com.example.yugch.projectepsilon.Home.class);
    startActivity(intentSubmitSMS);
}

public static void play(android.content.Context context, int resource) {
    aditi.hangman.Music.stop(context);
    aditi.hangman.Music.mp = android.media.MediaPlayer.create(context, resource);
    aditi.hangman.Music.mp.start();
}

@java.lang.Override
public boolean onMyLocationButtonClick() {
    return false;
}

@retrofit2.http.GET(value = "/repos/{owner}/{repo}/contents/{path}")
rx.Observable<java.lang.String> getFileContent(@retrofit2.http.Header(value = "Authorization")
java.lang.String auth, @android.support.annotation.Nullable
@retrofit2.http.Header(value = "Accept")
java.lang.String acc, @retrofit2.http.Path(value = "owner")
java.lang.String owner, @retrofit2.http.Path(value = "repo")
java.lang.String repo, @retrofit2.http.Path(value = "path")
java.lang.String path);

@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    mDbAdapter.resetWordStatus(id);
    mCursorAdapter.changeCursor(mDbAdapter.fetchWordsByTrained(null, java.lang.Integer.MAX_VALUE, java.lang.Integer.MAX_VALUE, (-1)));
    dialog.dismiss();
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    startMediaDeleteService(null);
    org.wordpress.android.ui.ActivityId.trackLastActivity(ActivityId.MEDIA);
}

@java.lang.Override
protected android.support.v4.app.Fragment createFragment() {
    if ((this.searchFragment) == null) {
        this.searchFragment = new uk.co.ribot.androidboilerplate.ui.fragment.SearchFragment();
    }
    return searchFragment;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, byte[] responseBody) {
    com.adsamcik.signalcollector.services.TrackerService.approxSize -= size;
    android.util.Log.d(com.adsamcik.signalcollector.DataStore.TAG, ("Successfully uploaded " + name));
}

@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... urls) {
    android.util.Log.d("Rest", "doinbackground");
    java.lang.String response = "";
    for (java.lang.String url : urls) {
        response = edu.ubbcluj.canvasAndroid.backend.repository.restApi.RestInformationDAO.getData(url);
    }
    return response;
}

public void regresaInicio() {
    android.content.Intent myIntent = new android.content.Intent(this, com.team.android.MenuActivity.class);
    startActivity(myIntent);
}

private void initializeMediaPlayer() {
    if ((leMediaPlayer) == null) {
        leMediaPlayer = new android.media.MediaPlayer();
    }else {
        leMediaPlayer.reset();
    }
    playerStatus = !(leMediaPlayer.equals(null));
}

@java.lang.Override
public void onFailure(int reasonCode) {
    android.widget.Toast.makeText(getActivity(), ("Discovery Failed : " + reasonCode), Toast.LENGTH_SHORT).show();
}

public void morphIntoFab(android.view.View fab, long hideSheetDuration, long hideSheetColorDuration, com.gordonwong.materialsheetfab.animations.AnimationListener listener) {
    revealSheetWithFab(fab, getSheetRevealRadius(), getFabRevealRadius(fab), hideSheetDuration, sheetColor, fabColor, hideSheetColorDuration, listener);
}

@java.lang.Override
public void onLoaded(java.util.List<net.ltfc.chinaartgallery.base.model.entities.Painting> paintingList) {
    android.util.Log.i("onLoaded", ("category:" + (category)));
    paintingListAdapter.setPaintingList(paintingList);
    swipeRefresh.setRefreshing(false);
}

public static void removeLocationUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.location.LocationListener locationListener) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.e(com.peets.socialplay.TreasureHuntRestActivity.TAG, "buttons[1] OnClick");
    buttons[1].setText(R.string.connecting);
    participantAccount = accountArray.get(1).getAccountId();
    inviteToPlay();
}

public void draw(android.graphics.Canvas canvas, android.graphics.Rect destination) {
    if (!(isPlaying)) {
        return ;
    }
    canvas.drawBitmap(frames[frameIndex], null, destination, null);
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    android.widget.Toast.makeText(getActivity(), R.string.UnfinishedFeatureText, Toast.LENGTH_SHORT).show();
    return true;
}

public static synchronized fast.simple.download.DownloadManager getInstance(android.content.Context context) {
    if (null == (fast.simple.download.DownloadManager.mInstance)) {
        fast.simple.download.DownloadManager.mInstance = new fast.simple.download.DownloadManager(context);
    }
    return fast.simple.download.DownloadManager.mInstance;
}

public void listQuestion(int surveyId) {
    android.content.Intent intent = new android.content.Intent(this, survey.shakya.sugan.surveyapp.activity.ListQuestionForSurveyerActivity.class);
    intent.putExtra("SURVEY_ID", surveyId);
    this.startActivity(intent);
}

@java.lang.Override
public void onResume() {
    super.onResume();
}

public void onClick(android.content.DialogInterface arg0, int arg1) {
    this.saveRecipes();
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if (!(intentional_end))
        endQuiz();
    else
        intentional_end = false;
    
}

public void onDialogPositiveClick(java.lang.String recipeUrl);

@java.lang.Override
protected void onPostExecute(java.lang.String result) {
    if (result != null) {
        android.util.Log.i("Response", result);
    }
}

public void onCreate() {
    super.onCreate();
    android.os.HandlerThread thread = new android.os.HandlerThread("DownloadService");
    thread.start();
    mServiceLooper = thread.getLooper();
    mServiceHandler = new edu.vuum.mocca.DownloadService.ServiceHandler(mServiceLooper);
}

@java.lang.Override
public void onClick(android.view.View v) {
    readTextFromEditText();
    isAllValid();
    if (isAllValid()) {
        com.example.a2017.mentoring.Model.Register register = new com.example.a2017.mentoring.Model.Register(_email, _first_password, _first_name, _last_name, _type, _phone_number);
        sendRegisterToServer(register);
    }
}

@java.lang.Override
public void onUpdateScrollBarBounds(android.graphics.Rect barBounds) {
    xyz.danoz.recyclerviewfastscroller.calculation.VerticalScrollBoundsProvider boundsProvider = new xyz.danoz.recyclerviewfastscroller.calculation.VerticalScrollBoundsProvider(0, barBounds.height());
    mIndicatorOffset = barBounds.top;
    mScreenPositionCalculator = new xyz.danoz.recyclerviewfastscroller.calculation.position.VerticalScreenPositionCalculator(boundsProvider);
}

private java.util.ArrayList<android.support.v4.app.Fragment> getPlayerPages() {
    java.util.ArrayList<android.support.v4.app.Fragment> pages = new java.util.ArrayList<>();
    pages.add(slim.body.spring.fragment.PlayerFragment.newInstance(mTracks));
    pages.add(slim.body.spring.fragment.AdviceFragment.newInstance());
    return pages;
}

@java.lang.Override
public void onClick(android.view.View v) {
    dismiss();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    android.support.v4.app.ActivityCompat.requestPermissions(mainActivity, new java.lang.String[]{ Manifest.permission.WRITE_CONTACTS }, org.dbhatt.d_deleted_contact.Deleted_contact.REQUEST_WRITE_EXTERNAL_STORAGE);
}

@java.lang.Override
public void onClick(int position) {
    android.content.Intent intent = new android.content.Intent(this, com.example.yukinohara.accuweather.ui.base.DetailsActivity.class);
    intent.putExtra("INDEX", position);
    startActivity(intent);
}

@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle state) {
    super.onRestoreInstanceState(state);
    recipe = state.getParcelable(com.example.floating.bakingapp.ui.RecipeListActivity.RECIPE_LIST);
    stepsListState = state.getParcelable(com.example.floating.bakingapp.ui.RecipeListActivity.STEPS_LIST_KEY);
}

public void deleteTrend(java.lang.String sdetails) {
    if ((db) == null) {
        db = getWritableDatabase();
    }
    db.delete(android.internest.com.internest.MyDBHandler.TABLE_TRENDS, ((((android.internest.com.internest.MyDBHandler.SCANNED_COLUMN_DETAILS) + " = \'") + sdetails) + "\'"), null);
}

public static java.lang.String getBatteryLevelRequest(android.content.Context context) {
    return context.getResources().getString(R.string.battery_level_message, org.addhen.smssync.util.Util.getBatteryLevel(context));
}

@java.lang.Override
public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    github.johnnysc.testappintech.MainActivity.positionOfItem = position;
    android.content.Intent intent = new android.content.Intent(this, github.johnnysc.testappintech.PlayerActivity.class);
    startActivityForResult(intent, 0);
}

@java.lang.Override
public boolean apply(java.lang.String input) {
    return (input.split(":").length) == 2;
}

public void createInstance(android.view.View v) {
    this.progressDialogWaitStop.show();
    new org.stackdroid.activities.ServersActivity.AsyncTaskOSListImages().execute();
    if ((this.manageInstanceDialog) != null)
        this.manageInstanceDialog.dismiss();
    
}

public static boolean isFirstRun(android.content.Context context) {
    android.content.SharedPreferences sharedPreferences = ((Build.VERSION.SDK_INT) >= 19) ? android.preference.PreferenceManager.getDefaultSharedPreferences(context) : context.getSharedPreferences("general_settings", Context.MODE_PRIVATE);
    return sharedPreferences.getBoolean(tz.co.wadau.calenderapp.InitialSettingsActivity.IS_FIRST_RUN, true);
}

public static void e(final java.lang.String logTag, final java.lang.String msg, final java.lang.Exception e) {
    android.util.Log.e(logTag, msg, e);
}

