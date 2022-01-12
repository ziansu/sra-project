@java.lang.Override
public void putBitmap(java.lang.String key, android.graphics.Bitmap bmp) {
    if ((null == key) || (null == bmp))
        return ;
    
    this.images.put(key, bmp);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mListener.onNewGameCreate(setOption, ((playerOption) + 1), rulesOption);
}

public static void _onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if ((com.inthecheesefactory.lib.fblike.widget.FBLikeView.callbackManager) != null)
        com.inthecheesefactory.lib.fblike.widget.FBLikeView.callbackManager.onActivityResult(requestCode, resultCode, data);
    
}

public void close() {
    if ((desDBHelper) != null) {
        isOpen = false;
        desDBHelper.close();
        android.util.Log.i(net.deschulz.desdatabase0.DesDBManager.DEBUG_TAG, "desDBbHelper closed");
    }
}

public void openGallery1(int req_code) {
    android.content.Intent intent = new android.content.Intent();
    intent.setType("image/*");
    intent.setAction(Intent.ACTION_GET_CONTENT);
    getActivity().startActivityForResult(android.content.Intent.createChooser(intent, "Select file to upload "), req_code);
}

@java.lang.Override
public void onMetadataChanged(android.support.v4.media.MediaMetadataCompat pMediaMetadata) {
    if (pMediaMetadata != null) {
        this.onMetadataChanged(pMediaMetadata);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(getActivity(), cube.table.CubeTableActivity.class);
    startActivity(intent);
}

private void setSwitchOnClickListener(final android.widget.Switch todoSwitch, final fabio.mytodolist.models.beans.Todo todo) {
    todoSwitch.setOnClickListener(new fabio.mytodolist.custom.listeners.TodoSwitchOnClickListener(todo));
}

public void test(android.view.View view) {
    com.hypodiabetic.happ.Objects.TempBasal example = new com.hypodiabetic.happ.Objects.TempBasal();
    example.rate = 5.0;
    example.duration = 30;
}

private boolean isInternetAvailable() {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (this.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
    return (activeNetwork != null) && (activeNetwork.isConnectedOrConnecting());
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    retrieveMessages();
}

public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    return super.onOptionsItemSelected(item);
}

@java.lang.Override
public void onCancelClickedListener() {
    imageButtonStatus.setSelected(false);
    timeWatchDialog.stop();
}

@java.lang.Override
protected void onStartLoading() {
    forceLoad();
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    android.view.MenuItem item;
    item = menu.findItem(R.id.menu_refresh);
    item.setVisible(false);
    return true;
}

@java.lang.Override
public void onDestroyView() {
    if (((getDialog()) != null) && (getRetainInstance()))
        getDialog().setDismissMessage(null);
    
    super.onDestroyView();
}

private void goToMenu() {
    game.setScreen(new com.androidgame.jingfu.turtlegame.MenuScreen(game, this));
}

public boolean externalWebm() {
    if ((Build.VERSION.SDK_INT) < 15)
        return true;
    
    return p.getBoolean(anabolicandroids.chanobol.ui.scaffolding.Prefs.EXTERNAL_WEBM, false);
}

public android.view.View getView() {
    return view;
}

@java.lang.Override
public void onCaptureCompleted(com.holenstudio.excamera2.CameraCaptureSession session, com.holenstudio.excamera2.CaptureRequest request, com.holenstudio.excamera2.TotalCaptureResult result) {
    android.widget.Toast.makeText(this, ("Saved: " + (mPictureFile.getName())), Toast.LENGTH_SHORT).show();
    unlockFocus();
}

@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable dr) {
    if (dr != null) {
        invalidate();
    }
}

@java.lang.Override
public void handleBrowserSwitchIntent(android.content.Intent intent) {
    fragment.startActivityForResult(new android.content.Intent(fragment.getActivity(), com.braintreepayments.api.BraintreeBrowserSwitchActivity.class).setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION).putExtra(BraintreeBrowserSwitchActivity.EXTRA_INTENT, intent), com.braintreepayments.api.PayPal.PAYPAL_AUTHORIZATION_REQUEST_CODE);
}

public static android.content.SharedPreferences.Editor getPreferencesEditor(android.content.Context context) {
    if ((ds.framework.v4.Settings.sPreferencesEditor) == null) {
        ds.framework.v4.Settings.sPreferencesEditor = ds.framework.v4.Settings.getPreferences(context).edit();
    }
    return ds.framework.v4.Settings.sPreferencesEditor;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mListener.onDialogNegativeClick(this, dialog);
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_save :
            saveWord();
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
    dataSource = new org.melayjaire.boimela.data.BookDataSource(activity);
    dataSource.open();
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    updateMyDatabase(db, 1, com.enm.hch.HCHDatabaseHelper.DB_VERSION);
}

public static boolean isXLargeTablet(android.content.Context context) {
    return ((context.getResources().getConfiguration().screenLayout) & (android.content.res.Configuration.SCREENLAYOUT_SIZE_MASK)) >= (android.content.res.Configuration.SCREENLAYOUT_SIZE_XLARGE);
}

private void runTask() {
    serverhelper.execute(new com.android.tasks.MeasurementTask(context, new java.util.HashMap<java.lang.String, java.lang.String>(), null));
}

public abstract com.nrs.nsnik.notes.model.objects.CheckListObject build();

@java.lang.Override
public boolean onSetSurface(android.view.Surface surface) {
    if ((exoPlayer) == null)
        exoPlayer = new com.felkertech.channelsurfer.players.TvInputPlayer();
    
    android.util.Log.d(TAG, "Set to surface");
    mSurface = surface;
    exoPlayer.setSurface(mSurface);
    return true;
}

@java.lang.Override
public void onDetachedFromWindow(android.support.v7.widget.RecyclerView view, android.support.v7.widget.RecyclerView.Recycler recycler) {
    super.onDetachedFromWindow(view, recycler);
    updateFirstAdapterPosition();
}

protected abstract void onCameraResult(java.lang.String mCurrentPhotoPath);

public static boolean sniffUnfragmented(com.google.android.exoplayer.extractor.ExtractorInput input) throws java.io.IOException, java.lang.InterruptedException {
    return com.google.android.exoplayer.extractor.mp4.Sniffer.sniffInternal(input, false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    character_name.setText(getCharacter().getName());
    allowNameEdit(false);
    updateViews();
}

@java.lang.Override
public void onDeleteSyncedFolderPreference(com.owncloud.android.ui.dialog.parcel.SyncedFolderParcelable syncedFolder) {
    mSyncedFolderProvider.deleteSyncedFolder(syncedFolder.getId());
    mAdapter.removeItem(syncedFolder.getSection());
}

@java.lang.Override
public void onFailure(retrofit2.Call<com.example.rj.cryptodisplay.model.BidData> call, java.lang.Throwable t) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((mFragment) != null) {
        if (!(mFragment.createBill()))
            android.util.Log.d("ActivityNewBill", "DoneButton - creating bill returned false");
        else
            finish();
        
    }
}

public void stop() {
    if ((mp) != null) {
        android.media.MediaPlayer mpTemp = mp;
        mp = null;
        mpTemp.release();
    }
}

public static ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer someMillisBack(int millisBackToStartTheSessionFrom) {
    return new ee.ioc.phon.android.speechutils.ContinuousRawAudioRecorder.SessionStartPointer((-(java.lang.Math.abs(millisBackToStartTheSessionFrom))));
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((day) == 0)
        day = 1;
    
    mListener.setAlarm(day, hour, minute);
}

public void playGame(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(this, finalproject.tap.PlayActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
    PlayActivity.pausestatus = 0;
    startActivity(intent);
}

public boolean initSession(io.branch.referral.Branch.BranchUniversalReferralInitListener callback) {
    return initSession(callback, ((android.app.Activity) (null)));
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
        v.performHapticFeedback(feedbackType());
    }
    return false;
}

public com.ma.schiffeversenken.android.model.Field.ShipDescriptor newShipDescriptor(com.ma.schiffeversenken.android.model.Ship ship) {
    com.ma.schiffeversenken.android.model.Field.ShipDescriptor shipDesc = new com.ma.schiffeversenken.android.model.Field.ShipDescriptor();
    shipDesc.location = new com.ma.schiffeversenken.android.model.Field.LocationDescriptor().newLocationDescriptor(ship.location);
    return shipDesc;
}

@java.lang.Override
public void onClick(android.view.View view) {
    deletePromo(filename);
}

@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    if (task.isSuccessful()) {
    }
}

public void print(com.noveogroup.android.log.Logger.Level level, java.lang.Throwable throwable, java.lang.String message);

public static byte[] stringToByte(java.lang.String data, int flag) {
    return android.util.Base64.decode(data, flag);
}

@java.lang.Override
protected void onPostResume() {
    super.onPostResume();
}

@java.lang.Override
public void onStart() {
    super.onStart();
    android.content.Intent intent = new android.content.Intent(this, dg.shenm233.mmaps.service.OfflineMapService.class);
    bindService(intent, mConnection, dg.shenm233.mmaps.ui.BIND_AUTO_CREATE);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initViews(savedInstanceState);
    android.util.Log.d(com.example.zhaomeng.readbookeveryday.activity.main.MainActivity.TAG, "onCreate");
}

public static com.facebook.buck.android.AndroidPlatformTarget getDefaultPlatformTarget(com.facebook.buck.android.AndroidDirectoryResolver androidDirectoryResolver, java.util.Optional<java.nio.file.Path> aaptOverride, java.util.Optional<java.nio.file.Path> aapt2Override) {
    return com.facebook.buck.android.AndroidPlatformTarget.getTargetForId(com.facebook.buck.android.AndroidPlatformTarget.DEFAULT_ANDROID_PLATFORM_TARGET, androidDirectoryResolver, aaptOverride, aapt2Override);
}

@java.lang.Override
public void onFinish() {
    android.content.Intent homeIntent = new android.content.Intent(this, com.google.zach.OnTargetFencing.HomeScreen.class);
    homeIntent.putExtra("finished", true);
    homeIntent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
    startActivityIfNeeded(homeIntent, 0);
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.e(net.nitroshare.android.transfer.TransferService.TAG, java.lang.String.format("transfer %d succeeded", transferId));
    showSuccessNotification(transferId, device);
}

private void proceedToHome() {
    android.content.Intent intent = new android.content.Intent(this, am.te.myapplication.Homepage.class);
    startActivity(intent);
}

@java.lang.Override
public boolean canChildScrollUp() {
    return android.support.v4.view.ViewCompat.canScrollVertically(mRecyclerView, (-1));
}

@java.lang.Override
public void onClick(android.view.View view) {
}

@java.lang.Override
public void onPageFinished(android.webkit.WebView view, java.lang.String url) {
    mTimeout = false;
}

@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (!(task.isSuccessful())) {
        android.widget.Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
public void onDialogButtonClick(android.content.DialogInterface dialog, android.text.Editable editable, boolean isSure) {
}

public void onClick2(android.view.View view) {
    if ((mScrollingCalendarDialog) == null) {
        mScrollingCalendarDialog = new com.jastzeonic.calendar.ScrollingCalendarDialog(this);
    }
    mScrollingCalendarDialog.callCalendarView(null, ((android.widget.TextView) (view)));
}

public static com.dehua.courseinformationsystem.utils.FragmentController getInstance(android.support.v4.app.FragmentActivity activity, int containerId) {
    com.dehua.courseinformationsystem.utils.FragmentController.controller = new com.dehua.courseinformationsystem.utils.FragmentController(activity, containerId);
    return com.dehua.courseinformationsystem.utils.FragmentController.controller;
}

@java.lang.Override
public void onClick(android.view.View view) {
    (like_count0)++;
    android.widget.Toast.makeText(getApplicationContext(), (("LIKED! (" + (like_count0)) + ")"), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    leftflag = isChecked;
}

@java.lang.Override
public void onInfoUpdated(ge.edu.freeuni.emis.emisapp.interfaces.UpdateMessage updateMessage) {
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<java.util.List<com.quartzodev.data.BookApi>> loader) {
    return ;
}

@java.lang.Override
public java.util.List<com.example.android.newsapp.Article> loadInBackground() {
    if ((url) == null) {
        return null;
    }
    return com.example.android.newsapp.QueryUtils.fetchData(url);
}

@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    android.util.Log.d(com.ccaroni.kreasport.activities.SignupActivity.LOG, "callback");
    if (user != null) {
        sendVerificationEmail(user);
    }
}

@java.lang.Override
public void start() {
    super.start();
    com.github.ybq.android.spinkit.animation.AnimationUtils.start(sprites);
}

@java.lang.Override
public void onClick(android.view.View view) {
    attemptLogin();
}

public static synchronized java.lang.String getLanguage(android.content.Context context) {
    return com.artemzin.android.wail.storage.WAILSettings.getSharedPreferences(context).getString(com.artemzin.android.wail.storage.WAILSettings.KEY_LOCALE, null);
}

public void setTextContent(java.lang.String mTextContent) {
    if ((mCustomView) != null) {
        this.mTextContent = mTextContent;
        mCustomView.invalidate();
    }
}

private void closeSocket() throws java.io.IOException {
    out.close();
    socket.close();
}

private int getIntegerHeader(java.lang.String h) {
    if (this.hasHeader(h)) {
        ch.boye.httpclientandroidlib.Header header = this.response.getFirstHeader(h);
        return java.lang.Integer.parseInt(header.getValue(), 10);
    }
    return -1;
}

@java.lang.Override
public void onLocationChanged(final android.location.Location location) {
    locationChanged(location);
}

public java.lang.String bestPath(final android.content.Context p) {
    return net.sourceforge.clonekeenplus.Settings.SdcardAppPath.get().bestPath(p);
}

public void draw(android.graphics.Canvas canvas) {
    drawBackground(canvas);
    if (this.isVisible) {
        canvas.drawBitmap(bitmap, this.x, this.y, null);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_accounts);
    if (savedInstanceState == null) {
        initializeAccountFragment();
    }
}

@java.lang.Override
public boolean onMenuItemClick(android.view.MenuItem item) {
    if ((item.getItemId()) == (R.id.action_close))
        dismiss();
    
    return true;
}

private void backToHome() {
    startActivity(new android.content.Intent(this, com.glm.labs.diary.ememories.MainActivity.class));
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((mListener) != null) {
        mListener.onListFragmentLongInteraction(holder.mItem);
    }
    return true;
}

@android.support.annotation.NonNull
@java.lang.Override
public java.util.List<jp.kshoji.javax.sound.midi.Receiver> getReceivers() {
    final java.util.List<jp.kshoji.javax.sound.midi.Receiver> receivers = new java.util.ArrayList<>();
    if ((receiver) != null) {
        receivers.add(receiver);
    }
    return java.util.Collections.unmodifiableList(receivers);
}

@java.lang.Override
public void onClick(android.view.View v) {
    dismiss();
}

public void whenBtnClicked(android.view.View view) {
    buttonClickSound();
    score();
    buttonSelect();
    decolor();
    buttonSelect();
}

public android.location.Location getLastLocation() {
    return (lastLocation) == null ? null : new android.location.Location(lastLocation);
}

public void setLoadNextPage(solutions.alterego.androidbound.android.adapters.PageDescriptor page) {
    if (page != null) {
        createItems(page);
    }
}

@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    dayOfMonth = newVal;
    onDateTimeChanged();
}

public void setTypeface(android.widget.TextView view, int fontFamilyResId, int style) {
    setTypeface(view, view.getContext().getString(fontFamilyResId), style);
}

public boolean getHideTags() {
    android.os.Bundle arguments = getArguments();
    if ((cbHideCompleted) == null) {
        return arguments.getBoolean(ActiveFilter.INTENT_HIDE_TAGS_FILTER, false);
    }else {
        return !(cbHideTags.isChecked());
    }
}

public void onLocationChanged() {
    if (BuildConfig.DEBUG) {
        android.util.Log.d(LOG_TAG, "onLocationChanged");
    }
    updateWeather();
}

protected final android.app.PendingIntent createPendingIntent(short notificationId, java.lang.String action, android.os.Bundle data) {
    return createPendingIntent(notificationId, action, data, 0);
}

private void setColor(java.lang.String colorName) {
    mLabel.setText(colorName);
    mColor.setCircleColor(android.graphics.Color.parseColor(colorName));
}

@java.lang.Override
public void onClick(android.view.View view) {
    currentLocationButton.setEnabled(false);
    android.widget.Toast.makeText(getActivity(), getResources().getString(R.string.fetching_data), Toast.LENGTH_SHORT).show();
    new com.sanchez.geoopposite.MainFragment.LaunchMapTask().execute();
}

@java.lang.Override
public void onClick(android.view.View view) {
    transactionHistory(TransactionHistoryFragment.RefreshState.EMPTY_REFRESH);
}

@java.lang.Override
public void onCreate(android.os.Bundle icicle) {
    super.onCreate(icicle);
    finish();
}

@java.lang.Override
public void onResponse(com.squareup.okhttp.Response response) throws java.io.IOException {
    if (!(response.isSuccessful())) {
        this.apiError();
        return ;
    }
    this.performFinish(tejaswi_yerukalapudi.com.helloandroid.PersonActivity.RECORD_UPDATED);
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    handleStart(intent);
    return START_NOT_STICKY;
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    com.imperium.power.nfcmango.NFCScreen.setupForegroundDispatch(this, mNfcAdapter);
}

@java.lang.Override
public void onClick(android.view.View view) {
    validate();
    dialog.dismiss();
}

