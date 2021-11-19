public void updateDayBrief(com.android.egg.dreamnote.basetype.DayBrief dayBrief) {
    mContext.getContentResolver().update(NoteProvider.CONTENT_URI_DB_DAY_BRIEF, dayBrief.toContentValues(false), (((com.android.egg.dreamnote.storage.NoteDatabaseHelper.DB_TBL_DAY_BRIEF_TIME_OFST) + "=") + (dayBrief.getTimeOffset())), null);
}

private void setCurrentLocation(android.location.Location loc) {
    if (isBetterLocation(loc, currentBestLocation)) {
        currentBestLocation = loc;
    }
}

@butterknife.OnClick(value = R.id.btn_scan)
public void openQrScanner() {
    android.content.Intent intent = new android.content.Intent(this, com.inveitix.android.clue.scanner.BarcodeCaptureActivity.class);
    intent.putExtra(BarcodeCaptureActivity.AutoFocus, true);
    intent.putExtra(BarcodeCaptureActivity.UseFlash, false);
    startActivityForResult(intent, com.inveitix.android.clue.ui.MapActivity.RC_BARCODE_CAPTURE);
}

private void addAllOptionToSets() {
    com.example.android.absolutmixr.AdvSearch.allTastes.add("-All Drinks-");
    com.example.android.absolutmixr.AdvSearch.allSkills.add("-All Drinks-");
    com.example.android.absolutmixr.AdvSearch.allGlasses.add("-All Drinks-");
    com.example.android.absolutmixr.AdvSearch.allTimes.add("-All Drinks-");
}

protected void showLoadingDialog(android.content.Context context) {
    showLoadingDialog(context, null);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    android.support.design.widget.Snackbar.make(activityContent, item.getTitle(), Snackbar.LENGTH_LONG).show();
    activityContainer.closeDrawer(GravityCompat.START);
    return true;
}

public static chevalierx.kiwapp.models.DAO.DAOBase getInstance(android.content.Context context) {
    if ((chevalierx.kiwapp.models.DAO.DAOBase.mInstance) == null) {
        chevalierx.kiwapp.models.DAO.DAOBase.mInstance = new chevalierx.kiwapp.models.DAO.DAOBase(context);
    }
    return chevalierx.kiwapp.models.DAO.DAOBase.mInstance;
}

@java.lang.Override
public void tasksLoadedFromServer(java.util.List<org.grassroot.android.models.TaskModel> tasks) {
    handleTaskLoaded(tasks);
}

@java.lang.Override
public boolean onIconLongClicked(final android.view.View view) {
    return false;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    conn.Open();
    conn.Close();
}

private void toggleMediaControlsVisiblity() {
    android.util.Log.i(TAG, "toggleMediaControlsVisibility");
    if (mMediaController.isShowing()) {
        mMediaController.hide();
    }else {
        mMediaController.show(0);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mPresenter = new ru.android.vkapp.presenter.MainPresenter(this, getLoaderManager(), this);
    mPresenter.initVKSdk(this);
    init();
}

@java.lang.Override
public boolean onCreateActionMode(android.support.v7.view.ActionMode mode, android.view.Menu menu) {
    mode.getMenuInflater().inflate(R.menu.action_mode, menu);
    return true;
}

@android.support.annotation.NonNull
public static com.github.umeshkrpatel.growthmonitor.data.GrowthDataProvider get() {
    assert (com.github.umeshkrpatel.growthmonitor.data.GrowthDataProvider.instance) != null;
    return com.github.umeshkrpatel.growthmonitor.data.GrowthDataProvider.instance;
}

protected abstract void initView(android.view.View rootView);

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    android.util.Log.d(com.bogucki.router.database.dbHelper.TAG, ("onCreate: DB CREATED WITH FOLLOWING SCRIPT:" + (com.bogucki.router.database.dbHelper.CREATE_DATABASE)));
    sqLiteDatabase.execSQL(com.bogucki.router.database.dbHelper.CREATE_DATABASE);
}

@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName name) {
    android.util.Log.i(com.example.dscs.StartFragment.TAG, "Service is disconnected.");
    mBinder = null;
    refreshButtonState();
}

public void setStartTitle(java.lang.String startTitle) {
    this.startTitle = startTitle;
}

@java.lang.Override
public boolean tryCaptureView(android.view.View child, int pointerId) {
    return (!(mIsUnableToDrag)) && (child == (mSlideableView));
}

public void setRegistrationUrl(java.lang.String registrationUrl) {
    android.util.Log.i(com.ngusta.cupassist.domain.Tournament.TAG, ((("Trying to set reg url to: " + registrationUrl) + " Old value: ") + (this.registrationUrl)));
    this.registrationUrl = registrationUrl;
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mItemClickListener) != null) {
        mItemClickListener.onItemClick(viewHolder, mDatas.get(position), position);
    }
}

@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    myKitabPresenter.onSuccess(loginResult);
    android.content.Intent intent = new android.content.Intent(getActivity(), com.sujan.mykitaab.MainActivity.class);
    startActivity(intent);
}

public boolean freeze() {
    if ((mBuilderPtr) == 0) {
        throw new java.lang.IllegalStateException("This FontFamily is already frozen");
    }
    mNativePtr = android.graphics.FontFamily.nCreateFamily(mBuilderPtr);
    mBuilderPtr = 0;
    return (mNativePtr) != 0;
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.release();
    player = null;
    isPlaying = false;
    mediaPlayerCallback.onFinishedPlaying();
}

@java.lang.Override
public void onError(java.lang.String errorMsg) {
    android.widget.Toast.makeText(ctx, errorMsg, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.chriscartland.octaviastreethilton.auth.AuthManager.onActivityResult(this, requestCode, resultCode, data);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    calculateBill();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    syncronizeChannels(false);
}

@java.lang.Override
public android.graphics.RectF getGridClippingRect() {
    mGridClippingRect.set(mViewPortHandler.getContentRect());
    mGridClippingRect.inset(0.0F, (-(mAxis.getGridLineWidth())));
    return mGridClippingRect;
}

@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.field_report_button :
            fieldReportButtonPressed(view);
            break;
        case R.id.complete_button :
            submitListener(view);
            break;
        default :
            break;
    }
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation arg0) {
    viewHolder.swipeLayout.removeAllViews();
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivityForResult(captureImage, tvao.mmad.itu.tingle.Controller.Fragments.ThingDetailFragment.REQUEST_PHOTO);
}

@java.lang.Override
public void onTick(long millisUntilFinished) {
    java.lang.String time = timeFormatter(millisUntilFinished);
    updateTextViewTime(time);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.dotua.goldendictbridge.SharedFunction.sendMessage(v.getContext(), sendString);
}

@java.lang.Override
public void onMove(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, android.support.v7.widget.RecyclerView.ViewHolder target) {
}

public android.database.Cursor getCursor() {
    return mCursor;
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if ((mDrawerToggle) != null) {
        return mDrawerToggle.onOptionsItemSelected(item);
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.user.timekeeper.StatusActivity.class);
    startActivity(intent);
}

@java.lang.Override
public void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    if (resultCode == 100) {
        runOnUiThread(new test.maps.app.MapsActivity.UpdateUI(resultData.getDouble("latitude"), resultData.getDouble("longitude")));
    }
}

@java.lang.Override
public void setTypeface(final android.graphics.Typeface tf) {
    super.setTypeface(tf);
    adjustTextSize();
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.example.mypulz.UICore.Detail.FindDoctorFragment dFragment = new com.example.mypulz.UICore.Detail.FindDoctorFragment();
    changeFragment(dFragment);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    m_toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.create_game_toolbar)));
    setSupportActionBar(m_toolbar);
}

@android.support.annotation.NonNull
@java.lang.Override
public com.aniruddhfichadia.presentable.Registry getRegistry() {
    return ((com.aniruddhfichadia.presentableexample.DemoApplication) (getApplication())).getRegistry();
}

private android.media.AudioTrack getAudioTrack(int bufferSize) {
    return new android.media.AudioTrack(android.media.AudioManager.STREAM_MUSIC, 44100, android.media.AudioFormat.CHANNEL_OUT_MONO, android.media.AudioFormat.ENCODING_PCM_16BIT, bufferSize, android.media.AudioTrack.MODE_STATIC);
}

@java.lang.Override
public void onButtonClickListener(int position, java.lang.String value) {
    onDeleteButtonClicked(position, value);
}

public static org.bbt.kiakoa.model.LoanLists getInstance() {
    if ((org.bbt.kiakoa.model.LoanLists.instance) == null) {
        android.util.Log.i(org.bbt.kiakoa.model.LoanLists.TAG, "getInstance: Creating instance");
        org.bbt.kiakoa.model.LoanLists.instance = new org.bbt.kiakoa.model.LoanLists();
    }
    return org.bbt.kiakoa.model.LoanLists.instance;
}

@java.lang.Override
public boolean onClose() {
    list.search(this, null);
    listAdapter.notifyDataSetChanged();
    android.util.Log.d(diy.uigeneric.sample.SampleListActivity.TAG, "search stop");
    return false;
}

@java.lang.Override
public void post() {
    fetchMessages();
    if ((getContext()) != null) {
        android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (getContext().getSystemService(Context.NOTIFICATION_SERVICE)));
        notificationManager.cancel(0);
    }
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    menu.findItem(R.id.action_delete).setVisible(false);
    return true;
}

@java.lang.Override
protected void onPreExecute() {
    android.util.Log.d(finalproject.ece558.edu.pdx.ece.brailleblackjack.PlayBlackJackGameFragment.TAG, "AnimateDealerCards");
    changeAllButtonStates(false, false, false, false);
    android.transition.TransitionManager.beginDelayedTransition(group, new android.transition.Explode());
    finalproject.ece558.edu.pdx.ece.brailleblackjack.PlayBlackJackGameFragment.toggleVisibility(dealer_left_slot, dealer_right_slot);
}

@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    mRecyclerViewScrollY += dy;
    stickHeaderViewPagerManager.onRecyclerViewScroll(recyclerView, mRecyclerViewScrollY, position, false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    cancleOrder();
}

public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.blogimage)) {
        imageView.setImageResource(R.drawable.blog2);
        imageView.setEnabled(false);
        thread.start();
    }
}

protected void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    super.onActivityResult(requestCode, resultCode, intent);
}

@java.lang.Override
public void onConnectionSuspended(int i) {
    android.util.Log.d(com.airbitz.objects.PlayLocationManager.TAG, "Suspended. Please re-connect.");
    attemptConnection();
}

@com.taobao.weex.ui.component.WXComponentProp(name = Constant.Name.FILL_COLOR)
public void setFillColor(java.lang.String param) {
    mFillColor = android.graphics.Color.parseColor(param);
    mPolygon.setFillColor(mFillColor);
}

public static java.io.InputStream getInputStreamFromUrl(android.content.Context context, java.lang.String imageUrl, int readTimeOutMillis) {
    return cn.trinea.android.common.util.ImageUtils.getInputStreamFromUrl(context, imageUrl, readTimeOutMillis, null);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putCharSequence(net.xpece.material.floatinglabel.FloatingLabelView.SAVED_ORIGINAL_HINT, mOriginalHint);
    return super.onSaveInstanceState();
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    getLoaderManager().initLoader(net.brightron.jayaneetha.visitmihinthale.DetailFragment.DETAIL_LOADER, null, null);
    super.onActivityCreated(savedInstanceState);
}

private boolean isExternalStorageWritable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    return Environment.MEDIA_MOUNTED.equals(state);
}

@java.lang.Override
public void onAddPokemonClick() {
    loadFragment(valjevac.kresimir.homework3.fragments.AddPokemonFragment.newInstance(), valjevac.kresimir.homework3.activities.PokemonListActivity.ADD_POKEMON_FRAGMENT_TAG, null);
}

@java.lang.Override
public void onPositive(com.afollestad.materialdialogs.MaterialDialog dialog) {
    deleteItem(id);
    content = "";
    getActivity().getSupportFragmentManager().popBackStack("editor", FragmentManager.POP_BACK_STACK_INCLUSIVE);
}

public static int readKeyboardColor(final android.content.SharedPreferences prefs, final android.content.Context context) {
    return prefs.getInt(rkr.simplekeyboard.inputmethod.latin.settings.Settings.PREF_KEYBOARD_COLOR, rkr.simplekeyboard.inputmethod.latin.settings.Settings.readKeyboardDefaultColor(context));
}

@java.lang.Override
public void onQueryReturned(java.util.List<com.criptext.monkeychatandroid.models.conversation.ConversationItem> conversationPage) {
    getState().conversations.insertConversations(conversationPage, true);
}

@java.lang.Override
public void onCreate() {
    com.merlin.network.NetworkMgr.getInstance().init(this, true);
    super.onCreate();
}

public static com.edu.bit.nemare.todoapp.data.source.TasksRepository provideTasksRepository(@android.support.annotation.NonNull
android.content.Context context) {
    com.google.common.base.Preconditions.checkNotNull(context);
    return com.edu.bit.nemare.todoapp.data.source.TasksRepository.getInstance(com.edu.bit.nemare.todoapp.data.source.remote.TasksRemoteDataSource.getInstance(), com.edu.bit.nemare.todoapp.data.source.local.TasksLocalDataSource.getInstance(context));
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if ((train1) != null) {
        train1.setSpeed(progress);
        java.lang.String text = train1.GetSpeedTxt();
        setSpeed(progress, train1);
    }
}

public void checkedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    switch (buttonView.getId()) {
        case R.id.imperialMetricSwitch :
            setUseImperial(isChecked);
            break;
        case R.id.aebSwitch :
            setAebPhotoMode(isChecked);
            break;
    }
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    mProgress.setVisibility(View.GONE);
}

@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent e) {
    return false;
}

@java.lang.Override
public void onClick(android.view.View v) {
    list.remove(position);
    notifyDataSetChanged();
    tattoo.tags = list;
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    updateList(this.searchString);
}

void onTrackSelected(int trackPos);

public static boolean newOutMessage(android.content.Context ctx, org.spinsuite.sync.content.SyncMessage message) {
    return org.spinsuite.bchat.model.SPS_BC_Message.newMessage(ctx, message, MQTTDefaultValues.TYPE_OUT);
}

private void attemptLogin() {
    if ((mAuthTask) != null)
        return ;
    
    showProgress(true);
}

@java.lang.Override
protected void onPreExecute() {
    isUserInLD = false;
    android.view.View container = bhApp.mainActivity.findViewById(R.id.weeklyLdUserRL);
    if (container != null)
        container.setVisibility(View.GONE);
    
}

public static com.tudarmstadt.barrierefreiesrouting.datacollectionapp.ui.fragments.ObstacleDetailsFragment newInstance() {
    com.tudarmstadt.barrierefreiesrouting.datacollectionapp.ui.fragments.ObstacleDetailsFragment fragment = new com.tudarmstadt.barrierefreiesrouting.datacollectionapp.ui.fragments.ObstacleDetailsFragment();
    android.os.Bundle args = new android.os.Bundle();
    fragment.setArguments(args);
    return fragment;
}

private void setResultAndFinish() {
    android.content.Intent resultValue = new android.content.Intent();
    resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
    setResult(Activity.RESULT_OK, resultValue);
    this.finish();
}

@android.support.annotation.UiThread
void showPdf(java.io.File pdfFile) {
    getSupportFragmentManager().beginTransaction().replace(R.id.content, com.github.gfx.android.tinypdfreader.PdfViewerFragment.newInstance(pdfFile)).commit();
}

public void onDrawerOpened(android.view.View drawerView) {
    supportInvalidateOptionsMenu();
}

public void run() {
    Data.mainAct.getFragmentManager().beginTransaction().replace(R.id.content_frame, new map.minimap.mainActivityComponents.LobbyFragment()).commit();
}

@java.lang.Override
protected void onRestart() {
    super.onRestart();
    if (!(isLoggedIn())) {
        startActivity(new android.content.Intent(getApplicationContext(), com.becker.nolan.mileagelog.LoginActivity.class));
        finish();
    }
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    if ((marker.getTag()) != null) {
        int rackId = ((int) (marker.getTag()));
        launchDetailActivity(rackId);
    }
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    (cards)++;
    updateValues(true);
}

private static void updateTriggerIndicator(android.view.View trigger) {
    if ((com.ceco.lollipop.gravitybox.ModPieControls.mCenterTrigger) && (com.ceco.lollipop.gravitybox.ModPieControls.mTrigindEnabled)) {
        trigger.setBackgroundColor(com.ceco.lollipop.gravitybox.ModPieControls.mTrigindColor);
    }else {
        trigger.setBackgroundColor(0);
    }
}

public void setOnItemViewClickedListener(android.support.v17.leanback.widget.OnItemViewClickedListener listener) {
    mOnItemViewClickedListener = listener;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.DialogFragment newFragment = new pl.dom133.dzwonek.TimePickerFragment(((android.widget.EditText) (deleteDialog.findViewById(R.id.od_time))), ts);
    newFragment.show(getSupportFragmentManager(), "timePicker");
}

public void onClick(android.view.View v) {
    dispatchTakePictureIntent();
    v.performHapticFeedback(HapticFeedbackConstants.CONTEXT_CLICK);
}

@java.lang.Override
public void onReject() {
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu, menu);
    menu.findItem(R.id.alerts).setVisible(false);
    return true;
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_about :
            openAbout();
            return true;
        case android.R.id.home :
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void run() {
    enterBarcode.requestFocus();
}

public void setEmpty(int res) {
    android.view.View view = getView();
    if (view == null)
        return ;
    
}

public static boolean skipPage(android.content.Context context) {
    return (com.cyanogenmod.account.setup.PersonalizationPage.hideWhisperPush(context)) && (com.cyanogenmod.account.setup.PersonalizationPage.hideThemeSwitch(context));
}

@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    mFadeImageSwitcher.onPageScrolled(position, positionOffsetPixels);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    startActivityForResult(intent, REQUEST_CODE_PHOTO);
}

