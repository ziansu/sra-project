public void updateDayBrief(com.android.egg.dreamnote.basetype.DayBrief dayBrief) {
    mContext.getContentResolver().update(NoteProvider.CONTENT_URI_DB_DAY_BRIEF, dayBrief.toContentValues(true), (((com.android.egg.dreamnote.storage.NoteDatabaseHelper.DB_TBL_DAY_BRIEF_TIME_OFST) + "=") + (dayBrief.getTimeOffset())), null);
}

private void setCurrentLocation(android.location.Location loc) {
    if (isBetterLocation(loc, currentBestLocation)) {
        currentBestLocation = loc;
        locationsCount += 1;
    }
}

@butterknife.OnClick(value = R.id.btn_scan)
private void openQrScanner() {
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
    com.example.android.absolutmixr.AdvSearch.allAlcoholic.add("-All Drinks-");
}

protected void showLoadingDialog(android.content.Context context) {
    com.yanxing.util.LoadDialogUtil.showLoadingDialog(context, null);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    int sum = setIt(1, 2, 3, 5, 7);
}

@java.lang.Override
public boolean onNavigationItemSelected(android.view.MenuItem item) {
    android.support.design.widget.Snackbar.make(activityContent, item.getTitle(), Snackbar.LENGTH_LONG).show();
    activityContainer.closeDrawer(GravityCompat.START);
    return onOptionsItemSelected(item);
}

public static chevalierx.kiwapp.models.DAO.DAOBase getInstance(android.content.Context context) {
    if ((chevalierx.kiwapp.models.DAO.DAOBase.mInstance) == null) {
        chevalierx.kiwapp.models.DAO.DAOBase.mInstance = new chevalierx.kiwapp.models.DAO.DAOBase(context.getApplicationContext());
    }
    return chevalierx.kiwapp.models.DAO.DAOBase.mInstance;
}

@java.lang.Override
public void tasksLoadedFromServer(java.util.List<org.grassroot.android.models.TaskModel> tasks) {
    handleTaskLoaded(tasks, group);
}

@java.lang.Override
public boolean onIconLongClicked(android.view.View v) {
    return false;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    conn.Open();
    listBill = conn.getListBill();
    conn.Close();
}

private void toggleMediaControlsVisiblity() {
    android.util.Log.i(TAG, "toggleMediaControlsVisibility");
    if (mMediaController.isShowing()) {
        mMediaController.hide();
    }else {
        mMediaController.show();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    init();
    mPresenter = new ru.android.vkapp.presenter.MainPresenter(this, getLoaderManager(), this);
    mPresenter.initVKSdk(this);
}

@java.lang.Override
public boolean onCreateActionMode(android.support.v7.view.ActionMode mode, android.view.Menu menu) {
    mode.getMenuInflater().inflate(R.menu.action_mode, menu);
    mode.setTitle((1 + " items selected"));
    return true;
}

@android.support.annotation.Nullable
public static com.github.umeshkrpatel.growthmonitor.data.GrowthDataProvider get() {
    return com.github.umeshkrpatel.growthmonitor.data.GrowthDataProvider.instance;
}

public abstract void initView(android.view.View rootView);

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    android.util.Log.d(com.bogucki.router.database.dbHelper.TAG, ("onCreate: DB CREATED WITH FOLLOWING SCRIPT:" + (com.bogucki.router.database.dbHelper.CREATE_DATABASE)));
    getWritableDatabase().execSQL(com.bogucki.router.database.dbHelper.CREATE_DATABASE);
}

@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName name) {
    android.util.Log.i(com.example.dscs.StartFragment.TAG, "Service is disconnected.");
    mBinder = null;
    refreshButtonState(false);
}

public void setStartTitle(java.lang.String startTitle) {
    android.widget.TabHost.TabSpec startDatePage = tabHost.newTabSpec("start");
    startDatePage.setIndicator(startTitle);
}

@java.lang.Override
public boolean tryCaptureView(android.view.View child, int pointerId) {
    if (mIsUnableToDrag) {
        return false;
    }
    return child == (mSlideableView);
}

public void setRegistrationUrl(java.lang.String registrationUrl) {
    android.util.Log.i(com.ngusta.cupassist.domain.Tournament.TAG, ((("Trying to set reg url to: " + registrationUrl) + " Old value: ") + (this.registrationUrl)));
    if (registrationUrl != null) {
        this.registrationUrl = registrationUrl;
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    mItemClickListener.onItemClick(viewHolder, mDatas.get(position), position);
}

@java.lang.Override
public void onSuccess(com.facebook.login.LoginResult loginResult) {
    android.content.Intent intent = new android.content.Intent(getActivity(), com.sujan.mykitaab.MainActivity.class);
    startActivity(intent);
    myKitabPresenter.onSuccess(loginResult);
}

public void freeze() {
    if ((mBuilderPtr) == 0) {
        throw new java.lang.IllegalStateException("This FontFamily is already frozen");
    }
    mNativePtr = android.graphics.FontFamily.nCreateFamily(mBuilderPtr);
    mBuilderPtr = 0;
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    mp.release();
    mp = null;
    player = null;
    isPlaying = false;
    mediaPlayerCallback.onFinishedPlaying();
}

@java.lang.Override
public void onError(java.lang.String errorMsg) {
    android.widget.Toast.makeText(ctx, errorMsg, Toast.LENGTH_SHORT).show();
    nr = new com.example.ishaandhamija.zinder.Utils.NearbyRestaurants(ctx, area, latitude, longitude, rvList, activity, getResponse);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    android.util.Log.d(com.example.sunsai.mymusicplayer.PlayerActivity.TAG, "onProgressChanged");
}

@java.lang.Override
public void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.chriscartland.octaviastreethilton.auth.AuthManager.getInstance(this).onActivityResult(requestCode, resultCode, data);
}

@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    if (enterAmount_editText.getText().toString().equals("")) {
        clear_Button.performClick();
    }else
        calculateBill();
    
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    syncronizeChannels(true);
}

@java.lang.Override
public android.graphics.RectF getGridClippingRect() {
    mGridClippingRect.set(mViewPortHandler.getContentRect());
    mGridClippingRect.inset(0.0F, ((-(mAxis.getGridLineWidth())) / 2.0F));
    return mGridClippingRect;
}

@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.field_report_button :
            fieldReportButtonPressed(view);
            break;
        case R.id.complete_button :
            submitListener();
            break;
        default :
            break;
    }
}

@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation arg0) {
    viewHolder.swipeLayout.removeAllViews();
    notifyItemChanged(viewType);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(hasPermissionInManifest(getContext(), android.Manifest.permission.CAMERA.toString()))) {
        requestPermissions(new java.lang.String[]{ android.Manifest.permission.CAMERA }, tvao.mmad.itu.tingle.Controller.Fragments.ThingDetailFragment.REQUEST_PHOTO);
    }
    startActivityForResult(captureImage, tvao.mmad.itu.tingle.Controller.Fragments.ThingDetailFragment.REQUEST_PHOTO);
}

@java.lang.Override
public void onTick(long millisUntilFinished) {
    java.lang.String time = timeFormatter(millisUntilFinished);
    android.util.Log.d("waleola", "called onTick");
    updateTextViewTime(time);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.dotua.goldendictbridge.SharedFunction.sendMessage(sendString);
}

@java.lang.Override
public boolean onMove(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, android.support.v7.widget.RecyclerView.ViewHolder target) {
    return false;
}

public android.database.Cursor getCursor() {
    java.lang.System.out.println(("GET CURSOR: " + (mCursor.getColumnCount())));
    return mCursor;
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    return (mDrawerToggle.onOptionsItemSelected(item)) || (super.onOptionsItemSelected(item));
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, com.example.user.timekeeper.StatusActivity.class);
    startActivity(intent);
    if (checkIns.isEmpty()) {
    }
}

@java.lang.Override
protected void onReceiveResult(int resultCode, android.os.Bundle resultData) {
    if (resultCode == 100) {
        runOnUiThread(new test.maps.app.MapsActivity.UpdateUI(resultData.getDouble("latitude"), resultData.getDouble("longitude")));
    }else {
    }
}

@java.lang.Override
public void setTypeface(final android.graphics.Typeface tf) {
    _paint.setTypeface(tf);
    adjustTextSize();
    super.setTypeface(tf);
}

@java.lang.Override
public void onClick(android.view.View view) {
    com.example.mypulz.UICore.Detail.FindDoctorFragment dFragment = new com.example.mypulz.UICore.Detail.FindDoctorFragment();
    new Common.CommonFunction().changeFragment(dFragment, dFragment.getFragmentManager());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    m_toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.create_game_toolbar)));
    setSupportActionBar(m_toolbar);
    getSupportActionBar().setDisplayShowTitleEnabled(false);
}

@android.support.annotation.NonNull
@java.lang.Override
protected com.aniruddhfichadia.presentable.Registry getRegistry() {
    return ((com.aniruddhfichadia.presentableexample.DemoApplication) (getApplication())).getRegistry();
}

private android.media.AudioTrack getAudioTrack(int bufferSize) {
    android.media.AudioTrack audioTrack = new android.media.AudioTrack(android.media.AudioManager.STREAM_MUSIC, 44100, android.media.AudioFormat.CHANNEL_OUT_MONO, android.media.AudioFormat.ENCODING_PCM_16BIT, bufferSize, android.media.AudioTrack.MODE_STATIC);
    return audioTrack;
}

@java.lang.Override
public void onButtonClickListener(int position, java.lang.String value) {
    android.widget.Toast.makeText(getContext(), ("Button click " + value), Toast.LENGTH_SHORT).show();
    onDeleteButtonClicked(position, value);
}

public static org.bbt.kiakoa.model.LoanLists getInstance() {
    if ((org.bbt.kiakoa.model.LoanLists.instance) == null) {
        android.util.Log.i(org.bbt.kiakoa.model.LoanLists.TAG, "getInstance: Creating instance");
        org.bbt.kiakoa.model.LoanLists.setInstance(new org.bbt.kiakoa.model.LoanLists());
    }
    return org.bbt.kiakoa.model.LoanLists.instance;
}

@java.lang.Override
public boolean onClose() {
    list.search(this, "");
    listAdapter.notifyDataSetChanged();
    android.util.Log.d(diy.uigeneric.sample.SampleListActivity.TAG, "search stop");
    return false;
}

@java.lang.Override
public void post() {
    fetchMessages();
    android.app.NotificationManager notificationManager = ((android.app.NotificationManager) (getContext().getSystemService(Context.NOTIFICATION_SERVICE)));
    notificationManager.cancel(0);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.main, menu);
    menu.findItem(R.id.action_delete).setVisible(true);
    return true;
}

@java.lang.Override
protected void onPreExecute() {
    android.util.Log.d(finalproject.ece558.edu.pdx.ece.brailleblackjack.PlayBlackJackGameFragment.TAG, "AnimateDealerCards");
    android.transition.TransitionManager.beginDelayedTransition(group, new android.transition.Explode());
    finalproject.ece558.edu.pdx.ece.brailleblackjack.PlayBlackJackGameFragment.toggleVisibility(dealer_left_slot, dealer_right_slot);
    changeAllButtonStates(false, false, false, false);
}

@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    mRecyclerViewScrollY += dy;
    stickHeaderViewPagerManager.onRecyclerViewScroll(recyclerView, mRecyclerViewScrollY, position);
}

@java.lang.Override
public void onClick(android.view.View v) {
    cancleOrder();
    cancleOrder.setEnabled(false);
    sureSendGoods.setEnabled(false);
}

public void onClick(android.view.View v) {
    if ((v.getId()) == (R.id.blogimage)) {
        imageView.setImageResource(R.drawable.blog2);
        thread.start();
    }
}

protected void onActivityResult(int requestCode, int resultCode, android.content.Intent intent) {
    super.onActivityResult(requestCode, resultCode, intent);
    showPlayShareDialog();
}

@java.lang.Override
public void onConnectionSuspended(int i) {
    android.util.Log.d(com.airbitz.objects.PlayLocationManager.TAG, "Suspended. Please re-connect.");
    if ((mObservers.size()) != 0) {
        attemptConnection();
    }
}

@com.taobao.weex.ui.component.WXComponentProp(name = Constant.Name.FILL_COLOR)
public void setFillColor(java.lang.String param) {
    mFillColor = android.graphics.Color.parseColor(param);
    mPolygon.setStrokeColor(mFillColor);
}

public static java.io.InputStream getInputStreamFromUrl(java.lang.String imageUrl, int readTimeOutMillis) {
    return cn.trinea.android.common.util.ImageUtils.getInputStreamFromUrl(imageUrl, readTimeOutMillis, null);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.util.List<org.mixare.sectionedlist.Item> list;
    list = createList();
    sectionedListAdapter = new org.mixare.SectionedListAdapter(this.getActivity(), this.getActivity(), 0, list);
}

@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putCharSequence(net.xpece.material.floatinglabel.FloatingLabelView.SAVED_ORIGINAL_HINT, mOriginalHint);
    bundle.putInt(net.xpece.material.floatinglabel.FloatingLabelView.SAVED_COLOR_ACTIVATED, mColorActivated);
    return super.onSaveInstanceState();
}

@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    getLoaderManager().initLoader(net.brightron.jayaneetha.visitmihinthale.DetailFragment.DETAIL_LOADER, null, this);
    super.onActivityCreated(savedInstanceState);
}

private boolean isExternalStorageWritable() {
    java.lang.String state = android.os.Environment.getExternalStorageState();
    if (Environment.MEDIA_MOUNTED.equals(state)) {
        return true;
    }
    return false;
}

@java.lang.Override
public void onAddPokemonClick() {
    loadFragment(valjevac.kresimir.homework3.fragments.AddPokemonFragment.newInstance(), valjevac.kresimir.homework3.activities.PokemonListActivity.ADD_POKEMON_FRAGMENT_TAG, null);
    android.util.Log.e("OPENING ADD POKEMON", "Add pokemon");
}

@java.lang.Override
public void onPositive(com.afollestad.materialdialogs.MaterialDialog dialog) {
    deleteItem(id);
    android.widget.Toast.makeText(getActivity(), "Item deleted", Toast.LENGTH_SHORT).show();
    content = "";
    getActivity().getSupportFragmentManager().popBackStack("editor", FragmentManager.POP_BACK_STACK_INCLUSIVE);
}

public static int readKeyboardColor(final android.content.SharedPreferences prefs, final android.content.Context context) {
    int color = prefs.getInt(rkr.simplekeyboard.inputmethod.latin.settings.Settings.PREF_KEYBOARD_COLOR, rkr.simplekeyboard.inputmethod.latin.settings.Settings.UNDEFINED_PREFERENCE_VALUE_INT);
    return color == (rkr.simplekeyboard.inputmethod.latin.settings.Settings.UNDEFINED_PREFERENCE_VALUE_INT) ? rkr.simplekeyboard.inputmethod.latin.settings.Settings.readKeyboardDefaultColor(context) : color;
}

@java.lang.Override
public void onQueryReturned(java.util.List<com.criptext.monkeychatandroid.models.conversation.ConversationItem> conversationPage) {
    getState().conversations.setHasReachedEnd(true);
    getState().conversations.insertConversations(conversationPage, ((conversationPage.size()) == 0));
}

@java.lang.Override
public void onCreate() {
    com.facebook.drawee.backends.pipeline.Fresco.initialize(this, com.merlin.androidtest.FImageLoaderConfig.getImagePipelineConfig(this));
    com.merlin.network.NetworkMgr.getInstance().init(this, true);
    super.onCreate();
}

public static com.edu.bit.nemare.todoapp.data.source.TasksRepository provideTasksRepository(@android.support.annotation.NonNull
android.content.Context context) {
    com.google.common.base.Preconditions.checkNotNull(context);
    return com.edu.bit.nemare.todoapp.data.source.TasksRepository.getInstance(com.edu.bit.nemare.todoapp.data.source.local.TasksLocalDataSource.getInstance(context), com.edu.bit.nemare.todoapp.data.source.remote.TasksRemoteDataSource.getInstance());
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    android.util.Log.d(com.example.checkmeet.view.AddGuestsActivity.TAG, "BACK PRESS");
    super.onBackPressed();
    getIntent().putExtra("List_of_Names", guestList);
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    train1.setSpeed(progress);
    java.lang.String text = train1.GetSpeedTxt();
    setSpeed(progress, train1);
}

public void checkedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    switch (buttonView.getId()) {
        case R.id.imperialMetricSwitch :
            setUseImperial(isChecked);
            break;
        case R.id.aebSwitch :
            setAebPhotoMode(isChecked);
    }
    if (isChecked) {
    }else {
    }
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    super.onPageFinished(view, url);
    mProgress.setVisibility(View.GONE);
}

@java.lang.Override
public boolean onSingleTapUp(android.view.MotionEvent e) {
    android.widget.Toast.makeText(main.getApplicationContext(), "tap", Toast.LENGTH_SHORT).show();
    return false;
}

@java.lang.Override
public void onClick(android.view.View v) {
    list.remove(position);
    notifyDataSetChanged();
    tattoo.tags = list;
    com.tattood.tattood.Server.updateTattoo(context, token, tattoo);
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    updateList(this.searchString);
}

void onTrackSelected(int trackPos, android.view.View mediaListItemView);

public static void newOutMessage(android.content.Context ctx, org.spinsuite.sync.content.SyncMessage message) {
    org.spinsuite.bchat.model.SPS_BC_Message.newMessage(ctx, message, MQTTDefaultValues.TYPE_OUT);
}

private void attemptLogin() {
    if ((mAuthTask) != null) {
        return ;
    }else {
        dbAdapter.isUser();
        android.widget.Toast.makeText(this, "Login gia' effettuato", Toast.LENGTH_SHORT).show();
    }
    showProgress(true);
}

@java.lang.Override
protected void onPreExecute() {
    isUserInLD = false;
    android.view.View container = bhApp.mainActivity.findViewById(R.id.weeklyLdUserRL);
    container.setVisibility(View.GONE);
}

public static com.tudarmstadt.barrierefreiesrouting.datacollectionapp.ui.fragments.ObstacleDetailsFragment newInstance(bp.common.model.Obstacle obstacle) {
    com.tudarmstadt.barrierefreiesrouting.datacollectionapp.ui.fragments.ObstacleDetailsFragment fragment = new com.tudarmstadt.barrierefreiesrouting.datacollectionapp.ui.fragments.ObstacleDetailsFragment();
    android.os.Bundle args = new android.os.Bundle();
    fragment.obstacleToEdit = obstacle;
    fragment.setArguments(args);
    return fragment;
}

private void setResultAndFinish() {
    android.content.Intent resultValue = new android.content.Intent();
    resultValue.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, mAppWidgetId);
    setResult(Activity.RESULT_OK, resultValue);
    finish();
}

@android.support.annotation.UiThread
void showPdf(java.io.File pdfFile) {
    getSupportFragmentManager().beginTransaction().add(R.id.content, com.github.gfx.android.tinypdfreader.PdfViewerFragment.newInstance(pdfFile)).commit();
}

public void onDrawerOpened(android.view.View drawerView) {
    getSupportActionBar().setTitle(buildStyledString(mDrawerTitle));
    supportInvalidateOptionsMenu();
}

public void run() {
    android.support.v4.app.FragmentTransaction tr = Data.mainAct.getFragmentManager().beginTransaction();
    tr.replace(R.id.content_frame, map.minimap.mainActivityComponents.LobbyFragment.newInstance("a", "b"));
    tr.commit();
}

@java.lang.Override
protected void onRestart() {
    super.onRestart();
    if (!(isLoggedIn()))
        startActivity(new android.content.Intent(getApplicationContext(), com.becker.nolan.mileagelog.LoginActivity.class));
    
    finish();
}

@java.lang.Override
public boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker) {
    int rackId = ((int) (marker.getTag()));
    launchDetailActivity(rackId);
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    (cards)++;
    updateValues();
}

private static void updateTriggerIndicator(android.view.View trigger) {
    if ((com.ceco.lollipop.gravitybox.ModPieControls.mCenterTrigger) && (com.ceco.lollipop.gravitybox.ModPieControls.mTrigindEnabled)) {
        trigger.setVisibility(View.VISIBLE);
        trigger.setBackgroundColor(com.ceco.lollipop.gravitybox.ModPieControls.mTrigindColor);
    }else {
        trigger.setVisibility(View.GONE);
    }
}

public void setOnItemViewClickedListener(android.support.v17.leanback.widget.OnItemViewClickedListener listener) {
    mOnItemViewClickedListener = listener;
    if (mViewsCreated) {
        throw new java.lang.IllegalStateException("Item clicked listener must be set before views are created");
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.DialogFragment newFragment = new pl.dom133.dzwonek.TimePickerFragment(((android.widget.EditText) (deleteDialog.findViewById(R.id.od_time))), ts, "od");
    newFragment.show(getSupportFragmentManager(), "timePicker");
}

public void onClick(android.view.View v) {
    v.performHapticFeedback(HapticFeedbackConstants.CONTEXT_CLICK);
    dispatchTakePictureIntent();
}

@java.lang.Override
public void onReject() {
    android.content.Intent intent = new android.content.Intent(getApplicationContext(), fr.pchab.androidrtc.MainActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    startActivity(intent);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.menu, menu);
    menu.findItem(R.id.alerts).setVisible(false);
    return super.onCreateOptionsMenu(menu);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_about :
            openAbout();
        case android.R.id.home :
            android.support.v4.app.NavUtils.navigateUpFromSameTask(this);
            return true;
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void run() {
    enterBarcode.requestFocus();
    android.view.inputmethod.InputMethodManager inputMethodManager = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    inputMethodManager.showSoftInput(enterBarcode, InputMethodManager.SHOW_IMPLICIT);
}

public void setEmpty(int res) {
    android.view.View view = getView();
    if (view == null)
        return ;
    
    ((android.widget.TextView) (view.findViewById(R.id.empty))).setText(res);
}

public static boolean skipPage(android.content.Context context) {
    return ((com.cyanogenmod.account.setup.PersonalizationPage.hideWhisperPush(context)) && (com.cyanogenmod.account.setup.PersonalizationPage.hideThemeSwitch(context))) && (com.cyanogenmod.account.setup.PersonalizationPage.hideKeyDisabler());
}

@java.lang.Override
public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
    android.util.Log.i(com.kimkevin.android.MainActivity.TAG, ((("onPageScrolled : " + position) + " , ") + positionOffsetPixels));
    mFadeImageSwitcher.showImage(position, positionOffsetPixels);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
    intent.putExtra(MediaStore.EXTRA_OUTPUT, generateFileUri());
    startActivityForResult(intent, REQUEST_CODE_PHOTO);
}

