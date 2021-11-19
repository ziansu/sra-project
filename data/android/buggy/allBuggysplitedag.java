@java.lang.Override
public void putBitmap(java.lang.String key, android.graphics.Bitmap bmp) {
    this.images.put(key, bmp);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mListener.onNewGameCreate(setOption, playerOption, rulesOption);
}

public static void _onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    com.inthecheesefactory.lib.fblike.widget.FBLikeView.callbackManager.onActivityResult(requestCode, resultCode, data);
}

public void close() {
    if ((desDBHelper) != null) {
        isOpen = false;
        desDBHelper.close();
        android.util.Log.d(net.deschulz.desdatabase0.DesDBManager.DEBUG_TAG, "desDBbHelper closed");
    }
}

public void openGallery1(int req_code) {
    android.content.Intent intent = new android.content.Intent();
    intent.setType("image/*");
    intent.setAction(Intent.ACTION_GET_CONTENT);
    startActivityForResult(android.content.Intent.createChooser(intent, "Select file to upload "), req_code);
}

@java.lang.Override
public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat pMediaMetadata) {
    if (pMediaMetadata == null) {
        return ;
    }
    this.onMetadataChanged(pMediaMetadata);
}

@java.lang.Override
public void onClick(android.view.View v) {
    DisplayToast("CubeTable Practice...");
    android.content.Intent intent = new android.content.Intent(getActivity(), cube.table.CubeTableActivity.class);
    startActivity(intent);
}

private void setSwitchOnClickListener(final android.widget.Switch todoSwitch, final fabio.mytodolist.models.beans.Todo todo) {
    todoSwitch.setOnClickListener(new fabio.mytodolist.custom.listeners.TodoSwitchOnClickListener(todo.getId()));
}

public void test(android.view.View view) {
    com.hypodiabetic.happ.Objects.TempBasal example = new com.hypodiabetic.happ.Objects.TempBasal();
    example.rate = 5.0;
    example.duration = 30;
    pumpAction.newTempBasal(example, view.getContext());
}

private boolean isInternetAvailable() {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
    return activeNetwork.isConnectedOrConnecting();
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    android.util.Log.d(com.teamtreehouse.ribbit.ui.InboxFragment.TAG, "onViewCreated");
    retrieveMessages();
}

public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.action_barcode :
            new com.google.zxing.integration.android.IntentIntegrator(this).initiateScan();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onCancelClickedListener() {
    imageButtonStatus.setSelected(false);
    long spendTime = timeWatchDialog.stop();
    android.util.Log.d("TTT", ("onCancelClickedListener: " + spendTime));
}

@java.lang.Override
protected void onStartLoading() {
    android.util.Log.i("ON Start", "LOG ");
    forceLoad();
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    android.view.MenuItem item;
    item = menu.findItem(R.id.menu_refresh);
    item.setVisible(false);
    menu.findItem(R.id.menu_contact_form).setVisible(false);
    return true;
}

@java.lang.Override
public void onDestroyView() {
    android.util.Log.d(ray.cyberpup.com.touchframework.InterceptsDialog.LOG_TAG, "destroy view");
    if (((getDialog()) != null) && (getRetainInstance()))
        getDialog().setDismissMessage(null);
    
    super.onDestroyView();
}

private void goToMenu() {
    game.setScreen(new com.androidgame.jingfu.turtlegame.MenuScreen(game));
}

public boolean externalWebm() {
    return (p.getBoolean(anabolicandroids.chanobol.ui.scaffolding.Prefs.EXTERNAL_WEBM, false)) && ((Build.VERSION.SDK_INT) >= 15);
}

protected android.view.View getView() {
    return view;
}

@java.lang.Override
public void onCaptureCompleted(com.holenstudio.excamera2.CameraCaptureSession session, com.holenstudio.excamera2.CaptureRequest request, com.holenstudio.excamera2.TotalCaptureResult result) {
    android.widget.Toast.makeText(this, ("Saved: " + (mPictureFile)), Toast.LENGTH_SHORT).show();
    unlockFocus();
}

@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable dr) {
    if (dr != null) {
        initMask(dr);
        swapBitmapMask(makeBitmapMask(dr));
        invalidate();
    }
}

@java.lang.Override
public void handleBrowserSwitchIntent(android.content.Intent intent) {
    fragment.getActivity().startActivityForResult(new android.content.Intent(fragment.getActivity(), com.braintreepayments.api.BraintreeBrowserSwitchActivity.class).setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION).putExtra(BraintreeBrowserSwitchActivity.EXTRA_INTENT, intent), com.braintreepayments.api.PayPal.PAYPAL_AUTHORIZATION_REQUEST_CODE);
}

public static android.content.SharedPreferences.Editor getPreferencesEditor(android.content.Context context) {
    if ((ds.framework.v4.Settings.sPreferencesEditor) != null) {
        return ds.framework.v4.Settings.sPreferencesEditor;
    }
    return ds.framework.v4.Settings.getPreferences(context).edit();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mListener.onDialogNegativeClick(this);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_save :
            saveWord();
            finish();
            return true;
        case R.id.action_delete :
            return true;
        case android.R.id.home :
    }
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    dataSource = org.melayjaire.boimela.data.BookDataSource.getInstance(getActivity());
    dataSource.open();
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    updateMyDatabase(db, 0, com.enm.hch.HCHDatabaseHelper.DB_VERSION);
}

private boolean isXLargeTablet() {
    return ((context.getResources().getConfiguration().screenLayout) & (android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK)) >= (android.content.res.Configuration.SCREENLAYOUT_SIZE_XLARGE);
}

private void runTask() {
    serverhelper.execute(new com.android.tasks.MeasurementTask(context, new java.util.HashMap<java.lang.String, java.lang.String>(), new com.android.services.PerformanceService.MeasurementListener()));
}

@android.support.annotation.NonNull
public com.nrs.nsnik.notes.model.objects.CheckListObject build() {
    return new com.nrs.nsnik.notes.model.objects.CheckListObject(this);
}

@java.lang.Override
public boolean onSetSurface(android.view.Surface surface) {
    if ((exoPlayer) == null)
        exoPlayer = new com.felkertech.channelsurfer.players.TvInputPlayer();
    
    android.util.Log.d(TAG, "Set to surface");
    exoPlayer.setSurface(surface);
    mSurface = surface;
    return true;
}

@java.lang.Override
public void onDetachedFromWindow(android.support.v7.widget.RecyclerView view, android.support.v7.widget.RecyclerView.Recycler recycler) {
    super.onDetachedFromWindow(view, recycler);
    updateFirstAdapterPosition();
    adapter = null;
}

protected abstract void onCameraResult(java.lang.String mCurrentPhotoPath, android.graphics.Bitmap bitmap);

public static boolean sniffUnfragmented(com.google.android.exoplayer.extractor.ExtractorInput input) throws java.io.IOException, java.lang.InterruptedException {
    return com.google.android.exoplayer.extractor.mp4.Sniffer.sniffInternal(input, 128, false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    getCharacter().setName(character_name.getText().toString());
    allowNameEdit(false);
    updateViews();
    ((com.oakonell.dndcharacter.AbstractBaseActivity) (getActivity())).populateRecentCharacters();
}

@java.lang.Override
public void onDeleteSyncedFolderPreference(com.owncloud.android.ui.dialog.parcel.SyncedFolderParcelable syncedFolder) {
    mSyncedFolderProvider.deleteSyncedFolder(syncedFolder.getId());
    mAdapter.removeItem(syncedFolder.getSection());
    mAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.example.rj.cryptodisplay.model.BidData> call, java.lang.Throwable t) {
    android.widget.Toast.makeText(this, "Error :(", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mFragment) != null) {
        if (!(mFragment.createBill()))
            android.util.Log.d("ActivityNewBill", "DoneButton - creating bill returned false");
        
        finish();
    }
}

public void stop() {
    if ((mp) != null) {
        android.media.MediaPlayer mpTemp = mp;
        mp = null;
        mpTemp.stop();
        mpTemp.release();
    }
}

public static ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer someMillisBack(int millisBackToStartTheSessionFrom) {
    return new ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer(millisBackToStartTheSessionFrom);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((day) == 0)
        day = 7;
    
    mListener.setAlarm(day, hour, minute);
}

public void playGame(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, finalproject.tap.PlayActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
    PlayActivity.pausestatus = 0;
    finish();
    startActivity(intent);
}

public boolean initSession(io.branch.referral.Branch.BranchUniversalReferralInitListener callback) {
    initSession(callback, ((android.app.Activity) (null)));
    return false;
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
        v.performHapticFeedback(feedbackType());
    }
    return true;
}

public com.ma.schiffeversenken.android.model.Field.ShipDescriptor newShipDescriptor(com.ma.schiffeversenken.android.model.Ship ship) {
    com.ma.schiffeversenken.android.model.Field.ShipDescriptor shipDesc = new com.ma.schiffeversenken.android.model.Field.ShipDescriptor();
    shipDesc.size = ship.size;
    shipDesc.name = ship.name;
    shipDesc.location = new com.ma.schiffeversenken.android.model.Field.LocationDescriptor().newLocationDescriptor(ship.location);
    return shipDesc;
}

@java.lang.Override
public void onClick(android.view.View view) {
    deletePromo(edu.temple.markopromo.DisplayMessageActivity.filename);
}

@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    if (task.isSuccessful()) {
        android.widget.Toast.makeText(this, user.getDisplayName(), Toast.LENGTH_SHORT).show();
    }
}

public void print(com.noveogroup.android.log.Logger.Level level, java.lang.String message, java.lang.Throwable throwable);

public static byte[] stringToByte(java.lang.String data, int flag) {
    return android.util.Base64.decode(data, ((android.util.Base64.NO_PADDING) | (android.util.Base64.NO_WRAP)));
}

@java.lang.Override
protected void onPostResume() {
    super.onPostResume();
    android.content.Intent surveysIntent = new android.content.Intent(this, org.eyeseetea.malariacare.services.SurveyService.class);
    surveysIntent.putExtra(SurveyService.SERVICE_METHOD, SurveyService.RELOAD_DASHBOARD_ACTION);
    this.startService(surveysIntent);
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.content.Intent intent = new android.content.Intent(this, dg.shenm233.mmaps.service.OfflineMapService.class);
    isServiceBound = bindService(intent, mConnection, dg.shenm233.mmaps.ui.BIND_AUTO_CREATE);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initViews();
    android.util.Log.d(com.example.zhaomeng.readbookeveryday.activity.main.MainActivity.TAG, "onCreate");
}

public static com.facebook.buck.android.AndroidPlatformTarget getDefaultPlatformTarget(com.facebook.buck.android.AndroidDirectoryResolver androidDirectoryResolver, java.util.Optional<java.nio.file.Path> aaptOverride, java.util.Optional<java.nio.file.Path> aapt2Override) {
    return com.facebook.buck.android.AndroidPlatformTarget.getTargetForId(com.facebook.buck.android.AndroidPlatformTarget.DEFAULT_ANDROID_PLATFORM_TARGET, androidDirectoryResolver, aaptOverride, aapt2Override).get();
}

@java.lang.Override
public void onFinish() {
    android.content.Intent homeIntent = new android.content.Intent(this, com.google.zach.OnTargetFencing.HomeScreen.class);
    homeIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    homeIntent.putExtra("finished", true);
    homeIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    startActivityIfNeeded(homeIntent, 0);
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.e(net.nitroshare.android.transfer.TransferService.TAG, java.lang.String.format("transfer %d succeeded", transferId));
    showSuccessNotification(device);
}

private void proceedToHome(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, am.te.myapplication.Homepage.class);
    startActivity(intent);
}

@java.lang.Override
public boolean canChildScrollUp() {
    if ((android.os.Build.VERSION.SDK_INT) < 14) {
        return (mRecyclerView.getScrollY()) > 0;
    }else {
        return android.support.v4.view.ViewCompat.canScrollVertically(mRecyclerView, (-1));
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this.ctx, com.example.ofir.bopofinal.Administrator.ManageCategoriesActivity.class);
    this.ctx.startActivity(intent);
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    mTimeout = false;
    if (mProgressBar.isShown()) {
        mProgressBar.setVisibility(View.INVISIBLE);
        mWebView.setVisibility(View.VISIBLE);
    }
}

@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
    }else {
        android.widget.Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onDialogButtonClick(android.content.DialogInterface dialog, android.text.Editable editable, boolean isSure) {
    dialog.dismiss();
    if (isSure)
        showToast(editable.toString());
    
}

public void onClick2(android.view.View view) {
    mScrollingCalendarDialog = new com.jastzeonic.calendar.ScrollingCalendarDialog(this);
    mScrollingCalendarDialog.callCalendarView(null, ((android.widget.TextView) (view)));
}

public static com.dehua.courseinformationsystem.utils.FragmentController getInstance(android.support.v4.app.FragmentActivity activity, int containerId) {
    if ((com.dehua.courseinformationsystem.utils.FragmentController.controller) == null) {
        com.dehua.courseinformationsystem.utils.FragmentController.controller = new com.dehua.courseinformationsystem.utils.FragmentController(activity, containerId);
    }
    return com.dehua.courseinformationsystem.utils.FragmentController.controller;
}

@java.lang.Override
public void onClick(android.view.View view) {
    (like_count0)++;
    android.widget.Toast.makeText(getApplicationContext(), (("LIKED! (" + (java.lang.String.valueOf(like0))) + ")"), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        leftflag = true;
    }else {
        leftflag = false;
    }
}

@java.lang.Override
public void onInfoUpdated(ge.edu.freeuni.emis.emisapp.interfaces.UpdateMessage updateMessage) {
    android.util.Log.i("TAG", updateMessage.toString());
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<java.util.List<com.quartzodev.data.BookApi>> loader) {
}

@java.lang.Override
public java.util.List<com.example.android.newsapp.Article> loadInBackground() {
    if ((url) == null) {
        return null;
    }
    android.util.Log.v(com.example.android.newsapp.ArticleLoader.LOG_TAG, ("Loading URL: " + (url)));
    return com.example.android.newsapp.QueryUtils.fetchData(url);
}

@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    android.util.Log.d(com.ccaroni.kreasport.activities.SignupActivity.LOG, "callback");
    if (user != null) {
        sendVerificationEmail();
    }else {
    }
}

@java.lang.Override
public void start() {
    super.start();
    com.github.ybq.android.spinkit.animation.AnimationUtils.start(sprites);
    com.github.ybq.android.spinkit.animation.AnimationUtils.start(getAnimation());
}

@java.lang.Override
public void onClick(android.view.View view) {
    loadToast.setText("LOADING");
    loadToast.show();
    attemptLogin();
}

public static synchronized java.lang.String getLanguage(android.content.Context context) {
    return com.artemzin.android.wail.storage.WAILSettings.getSharedPreferences(context).getString(com.artemzin.android.wail.storage.WAILSettings.KEY_LOCALE, java.util.Locale.getDefault().getLanguage());
}

public void setTextContent(java.lang.String mTextContent) {
    if ((mCustomView) != null) {
        this.mTextContent = mTextContent;
        mCustomView.invalidate();
    }
    android.util.Log.d("test", "setTextContent: ");
}

private void closeSocket() throws java.io.IOException {
    out.close();
    socket.close();
    android.util.Log.d("closeSocket", "closeSocket");
}

private int getIntegerHeader(java.lang.String h) {
    if (this.hasHeader(h)) {
        ch.boye.httpclientandroidlib.Header header = this.response.getFirstHeader("retry-after");
        return java.lang.Integer.parseInt(header.getValue(), 10);
    }
    return -1;
}

@java.lang.Override
public void onLocationChanged(final android.location.Location location) {
    android.util.Log.d("google_api", ((("Location changed to " + (location.getLatitude())) + " ") + (location.getLongitude())));
    locationChanged(location);
}

public static java.lang.String getBestPath(final android.content.Context p) {
    try {
        return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.get().bestPath(p);
    } catch (java.lang.Exception e) {
    }
    return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.Dummy.Holder.sInstance.path(p);
}

public void draw(android.graphics.Canvas canvas) {
    drawBackground(canvas);
    if (this.isVisible) {
        canvas.drawBitmap(bitmap, this.x, this.y, null);
    }
    drawValue(canvas);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_accounts);
    if (savedInstanceState == null) {
        createCustomToolbar();
        initializeAccountFragment();
    }
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_close)) {
        dismiss();
        return true;
    }else
        return false;
    
}

private void backToHome() {
    android.content.Intent newIntent = new android.content.Intent();
    newIntent.setClass(this, com.glm.labs.diary.ememories.MainActivity.class);
    this.startActivity(newIntent);
    this.finish();
    java.lang.System.gc();
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    mListener.onListFragmentLongInteraction(holder.mItem);
    return true;
}

@android.support.annotation.NonNull
@java.lang.Override
public java.util.List<jp.kshoji.javax.sound.midi.Receiver> getReceivers() {
    java.util.ArrayList<jp.kshoji.javax.sound.midi.Receiver> receivers = new java.util.ArrayList<>();
    if ((receiver) != null) {
        receivers.add(receiver);
    }
    return java.util.Collections.unmodifiableList(receivers);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (dialog.isShowing()) {
        dialog.dismiss();
    }
}

public void whenBtnClicked(android.view.View view) {
    buttonClickSound();
    score();
    buttonSelect();
    decolor();
}

public android.location.Location getLastLocation() {
    if ((lastLocation) == null)
        android.util.Log.d(com.example.singi_000.prototype1.GPSHandler.TAG, "GETLASTLOC IS NULL");
    
    return (lastLocation) == null ? null : new android.location.Location(lastLocation);
}

public void setLoadNextPage(solutions.alterego.androidbound.android.adapters.PageDescriptor page) {
    if (page != null) {
        createItems(page.getCurrentPage());
    }
}

@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    dayOfMonth = mDaySpinner.getValue();
    mCurrentDate.set(java.util.Calendar.DAY_OF_MONTH, dayOfMonth);
    onDateTimeChanged();
}

public void setTypeface(android.widget.TextView view, int fontFamilyResId, int style) {
    setTypeface(view, fontFamilyResId, style);
}

public boolean getHideTags() {
    android.os.Bundle arguments = getArguments();
    if ((cbHideCompleted) == null) {
        return !(arguments.getBoolean(ActiveFilter.INTENT_HIDE_TAGS_FILTER, false));
    }else {
        return !(cbHideTags.isChecked());
    }
}

public void onLocationChanged() {
    if (BuildConfig.DEBUG) {
        android.util.Log.d(LOG_TAG, "onLocationChanged");
    }
    updateWeather();
    getLoaderManager().restartLoader(com.dev.tonylyu.sunshine.ForecastFragment.WEATHER_LOADER_ID, null, this);
}

protected final android.app.PendingIntent createPendingIntent(int notificationId, java.lang.String action, android.os.Bundle data) {
    return createPendingIntent(notificationId, action, data, 0);
}

private void setColor(java.lang.String colorName) {
    mLabel.setText(colorName);
    if (colorName.equals("primary")) {
        mColor.setCircleColor(R.color.primary);
    }else {
        mColor.setCircleColor(android.graphics.Color.parseColor(colorName));
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(getActivity(), getResources().getString(R.string.fetching_data), Toast.LENGTH_SHORT).show();
    new com.sanchez.geoopposite.MainFragment.LaunchMapTask().execute();
    currentLocationButton.setEnabled(false);
}

@java.lang.Override
public void onClick(android.view.View view) {
    transactionHistory(null, TransactionHistoryFragment.RefreshState.EMPTY_REFRESH);
}

@java.lang.Override
public void onCreate(android.os.Bundle icicle) {
    super.onCreate(icicle);
    final android.content.Intent intent = new android.content.Intent(android.provider.DocumentsContract.ACTION_MANAGE_ROOT);
    intent.setData(android.provider.DocumentsContract.buildRootUri(Constants.STORAGE_AUTHORITY, Constants.STORAGE_ROOT_ID));
    startActivity(intent);
    finish();
}

@java.lang.Override
public void onResponse(com.squareup.okhttp.Response response) throws java.io.IOException {
    if (!(response.isSuccessful())) {
        this.apiError();
    }
    this.performFinish(tejaswi_yerukalapudi.com.helloandroid.PersonActivity.RECORD_UPDATED);
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    handleStart(intent, startId);
    return START_NOT_STICKY;
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    registerReceiver(br, new android.content.IntentFilter(BroadcastService.COUNTDOWN_BR));
    com.imperium.power.nfcmango.NFCScreen.setupForegroundDispatch(this, mNfcAdapter);
}

@java.lang.Override
public void onClick(android.view.View view) {
    validate(0, nameDialog.getText().toString(), mAuth.getCurrentUser().getUid(), hintDialog.getText().toString());
    dialog.dismiss();
}

