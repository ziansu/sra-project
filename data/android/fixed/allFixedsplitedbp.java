private void showFileChooser() {
    android.content.Intent intent = new android.content.Intent(this, com.nbsp.materialfilepicker.ui.FilePickerActivity.class);
    startActivityForResult(intent, 1);
}

@java.lang.Override
public void onClick(android.view.View v) {
    gameView_.reset();
    lostOverlay_.setVisibility(View.INVISIBLE);
}

@java.lang.Override
public void onNotFound(java.lang.String key) {
    onNotFound();
}

@java.lang.Override
public synchronized void onCreate() {
    android.util.Log.d(org.makeathon.telepresenceslave.SlaveService.TAG, "onCreate");
    org.makeathon.telepresenceslave.SlaveService.sInstance = this;
    mPubnub = new com.pubnub.api.Pubnub("pub-c-e0e0e558-9aa1-412e-a4ca-ce286e939e54", "sub-c-4b5e362c-27fd-11e6-84f2-02ee2ddab7fe");
}

@java.lang.Override
public void interrupt() {
    if (Logger.DEBUG) {
        android.util.Log.d(TAG, "[interrupt]");
    }
}

private void setAdapter(java.lang.String country) {
    mAdapter = new ru.belogurowdev.yourplaces.Adapter.PlaceTypesAdapter(this, country, mPlaceTypes);
}

@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
public void onSharedElementEnd(java.util.List<java.lang.String> sharedElementNames, java.util.List<android.view.View> sharedElements, java.util.List<android.view.View> sharedElementSnapshots) {
}

public void init(android.content.Context ctx) {
    android.view.LayoutInflater inflater = ((android.view.LayoutInflater) (ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE)));
    inflater.inflate(R.layout.view_my_layout, this, true);
}

@java.lang.SuppressWarnings(value = "deprecation")
private static long getSize(android.os.StatFs statFs) {
    int blockSize = statFs.getBlockSize();
    int availableBlocks = statFs.getAvailableBlocks();
    return (blockSize * availableBlocks) / (1024 * 1024);
}

@java.lang.Override
protected void onNewIntent(android.content.Intent intent) {
    super.onNewIntent(intent);
}

@java.lang.Override
public void onBackPressed() {
    if ((layoutPostmanMask.getVisibility()) == (android.view.View.VISIBLE)) {
        layoutPostmanMask.setVisibility(View.GONE);
    }else {
        super.onBackPressed();
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    ((com.skyweather.MainActivity) (getActivity())).jumpToPage(0);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((listener) != null) {
        listener.onItemClicked(getAdapterPosition(), ((getAdapterPosition()) + 1));
    }
}

@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    android.util.Log.d("xxxdebug", "in onKeyDown");
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        local.isi.wheelofluck.view.Arrow.removeRunnables = true;
    }
    return super.onKeyDown(keyCode, event);
}

@java.lang.Override
public void onBackPressed() {
    android.util.Log.d(org.rainjay.newfaceunlock.RecongizerActivity.TAG, "onBackPressed: recongition");
    super.onBackPressed();
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<java.util.ArrayList<com.anonyxhappie.dwarf.pms2.apis.MovieModel>> loader) {
}

public static void setText(android.app.Activity activity, android.widget.TextView textView, int resId) {
    activity.runOnUiThread(() -> textView.setText(resId));
}

@java.lang.Override
public void onDestroy() {
    android.util.Log.e(com.example.m.divis.FragmentData.TAG, ((com.example.m.divis.FragmentData.TAG) + "LifeCycle FragmentData onDestroy"));
    freeBitmapResource(imageCaptured);
    super.onDestroy();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    isScreenCreated = true;
}

@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
}

private int getTitleResId() {
    com.pajato.android.gamechat.common.model.Account account = AccountManager.instance.getCurrentAccount();
    if (account == null)
        return R.string.app_name;
    
    return R.string.GroupsToolbarTitle;
}

public void setAnimationDataSet(java.util.ArrayList<com.main.toledo.gymtrackr.ExerciseHistory> history, android.content.Context c, java.lang.String name) {
    mContext = c;
    mHistory = history;
    mName = name;
}

@java.lang.Override
public void onGlobalLayout() {
    initLayout();
}

public void onSwipeProgress(float progress) {
    if ((mProgressListener) != null)
        mProgressListener.onSwipeProgress(getCurrentPosition(), progress);
    
    animateStackOnProgress(progress, false, 0);
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
}

@java.lang.Override
public void unregisterReceiver(android.content.BroadcastReceiver receiver) {
    if (receivers.contains(receiver)) {
        super.unregisterReceiver(receiver);
        receivers.remove(receiver);
    }
}

public void setBrushSize(float newSize) {
    drawPaint.setStrokeWidth(newSize);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.os.Bundle mArgs = getArguments();
    title = mArgs.getString("dialog_title");
    uri = mArgs.getString("uri");
    name = mArgs.getString("name");
}

@java.lang.Override
public void onException(java.lang.Exception e) {
    initFailed(listener, e.getMessage());
}

private static java.net.URL createUrl(java.lang.String stringUrl) {
    java.net.URL url = null;
    try {
        url = new java.net.URL(stringUrl);
    } catch (java.net.MalformedURLException e) {
        android.util.Log.e(com.example.adrialwalters.booklistingapp.QueryUtils.LOG_TAG, "Problem building the URL");
    }
    return url;
}

@java.lang.Override
protected void onPostExecute(java.util.List<java.lang.String> results) {
    if (!(showToast))
        return ;
    
    for (java.lang.String result : results)
        android.widget.Toast.makeText(getApplication(), result, Toast.LENGTH_SHORT).show();
    
}

@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
}

@java.lang.Override
public lombok.ast.AstVisitor createJavaVisitor(com.android.tools.lint.detector.api.JavaContext context) {
    return new permissions.dispatcher.PermissionsDispatcherOnRequestPermissionsResultDetector.OnRequestPermissionsResultChecker(context);
}

@android.support.annotation.Nullable
public static java.lang.Float getFloat(@android.support.annotation.NonNull
java.lang.String key, @android.support.annotation.Nullable
java.lang.Float defaultValue) {
    return java.lang.Float.valueOf(com.pepperonas.aesprefs.AesPrefs.get(key, java.lang.String.valueOf(defaultValue)));
}

@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    for (com.google.firebase.database.DataSnapshot categorySnapshot : dataSnapshot.getChildren()) {
        categoriesByUser.add(categorySnapshot.getValue(com.hallak.billdozer.models.Category.class));
        android.util.Log.i(TAG, "Collected User Categories ");
    }
}

@java.lang.Override
public void onError(int errorCode, @android.support.annotation.Nullable
java.lang.String errorMessage) {
    java.lang.String displayedError = (errorMessage == null) ? "" : errorMessage;
    showError(displayedError);
    setCommunicatingProgress(false);
}

public abstract void removeInfoView(android.view.View view);

public void next(android.view.View view) {
    if ((currenSongNumber) < ((currentDirAllFiles.length) - 1)) {
        (currenSongNumber)++;
        startPlaying(currenSongNumber);
    }else {
        currenSongNumber = 0;
        startPlaying(currenSongNumber);
    }
}

@de.greenrobot.event.Subscribe
public void onGetProductDTOEvent(com.example.winify.cvsi.dto.ListDto<com.example.winify.cvsi.dto.templates.ProductTemplate> event) {
}

public void endLoadingProgress() {
    showUpdateUserSuccess();
    mLoadingDialog.cancel();
}

@java.lang.Override
public void onClick(@android.support.annotation.NonNull
com.afollestad.materialdialogs.MaterialDialog dialog, @android.support.annotation.NonNull
com.afollestad.materialdialogs.DialogAction which) {
    initializeAesthetic(primary, accent, true);
    dialog.dismiss();
}

public void onLogoutClicked(android.view.View view) {
    onBackPressed();
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    com.legitdevs.legitnotes.EditDialog.getInstance(notes.get(position), position).show(((com.legitdevs.legitnotes.HomeActivity) (ctx)).getSupportFragmentManager(), "dialog");
    return true;
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    mMosaicView.setStrokeMultiples((1 + ((float) (progress / 100.0))));
}

private void showAnimalInfo(int currentIndex) {
    views.setMyAnimal(myAnimals.get(currentIndex));
    views.imageBlock.setImageURI(android.net.Uri.parse(myAnimals.get(currentIndex).getImageUri()));
}

static final android.content.Context getApplicationContextIfAvailable(android.content.Context context) {
    return android.app.ActivityThread.currentApplication().getApplicationContext();
}

private void initRecyclerView() {
    mAdapter = new mvp.sample.biocram.samplemvp.countries.CountriesAdapter(getContext());
    mRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getActivity()));
    mRecyclerView.setAdapter(mAdapter);
}

@java.lang.Override
public void onDrawOver(android.graphics.Canvas c, android.support.v7.widget.RecyclerView parent, android.support.v7.widget.RecyclerView.State state) {
    super.onDrawOver(c, parent, state);
}

private void drawRipple(android.graphics.Canvas canvas) {
    ripplePaint.setAlpha(rippleAlpha);
    canvas.drawCircle(xPos, yPos, rippleRadius, ripplePaint);
}

@java.lang.Override
public void run() {
    mSwipeRefreshLayout.setRefreshing(false);
    addFeedItem(new java.lang.Thread("External User", "This message was downloaded from the Internet", 1));
}

@java.lang.Override
public Loader<List<? extends org.oucho.mpdclient.mpd.item.Item>> onCreateLoader(int id, android.os.Bundle args) {
    return new <org.oucho.mpdclient.fragments.mApp>org.oucho.mpdclient.fragments.loader.AlbumSongLoader(mAlbum);
}

@java.lang.Override
public void onAuthenticationSucceeded(android.support.v4.hardware.fingerprint.FingerprintManagerCompat.AuthenticationResult result) {
    super.onAuthenticationSucceeded(result);
    if ((promise) == null) {
        return ;
    }
    promise.resolve(null);
    promise = null;
}

@android.databinding.BindingAdapter(value = { "bind:imageUrl" })
public static void loadImage(android.widget.ImageView view, java.lang.String imageUrl) {
    com.squareup.picasso.Picasso.with(view.getContext()).load(imageUrl).into(view);
}

@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    android.content.Intent intent = new android.content.Intent(context, com.andela.motustracker.model.ActivityRecognitionDetector.class);
    callbackIntent = android.app.PendingIntent.getService(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    ActivityRecognition.ActivityRecognitionApi.requestActivityUpdates(com.andela.motustracker.model.ActivityRecognitionScan.googleApiClient, 0, callbackIntent);
}

@java.lang.Override
public void onActionClicked(int i) {
    switch (i) {
        case 2 :
            playlist.likeSong();
            break;
    }
}

private void insertRecord(java.lang.String tableName, android.content.ContentValues contentValues) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.insertOrThrow(tableName, null, contentValues);
    db.close();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    handleConnectivityNotification(context);
}

@java.lang.Override
public void onItemClick(android.view.View v, int position) {
}

public void changeColorChest(android.view.View view) {
    view.setBackgroundColor(android.graphics.Color.parseColor("#547b7b"));
}

@java.lang.Override
public void onClick(android.view.View pView) {
    if ((mCallNumber) != null) {
        android.content.Intent callContact = new android.content.Intent(android.content.Intent.ACTION_DIAL);
        callContact.setData(mCallNumber);
        startActivity(callContact);
    }
}

private void loadMainViewPagerFragment() {
    android.support.v4.app.Fragment frag = getSupportFragmentManager().findFragmentById(R.id.fragment_main_container);
    if (frag == null) {
        loadFragment(com.quartzodev.fragments.ViewPagerFragment.newInstance(ViewPagerFragment.MAIN_VIEW_PAGER, mFolderId, null, null), null);
    }
}

@java.lang.Override
public void onDataLoaded(com.dominika.florczykowska.placesfinder.classes.pojo.placesearch.PlaceSearch response) {
    android.util.Log.d(com.dominika.florczykowska.placesfinder.fragments.MapListFragment.TAG, "data loaded");
    getRetrofitResponse(response);
}

@java.lang.Override
public void onTrackSelected(int trackPos) {
    if ((audioPlayerFragment) != null) {
        audioPlayerFragment.setTrack(trackPos);
    }
}

public void activateListItem(android.widget.LinearLayout linearLayout) {
    linearLayout.setSelected(true);
}

public abstract java.lang.String getTitle(android.content.Context context);

@java.lang.Override
protected void onDeleteSuccess(com.heaven7.android.dragflowlayout.DragFlowLayout dfl, android.view.View child, java.lang.Object data) {
}

@java.lang.Override
public void onBitmapCropped(@android.support.annotation.NonNull
android.net.Uri resultUri, int offsetX, int offsetY, int imageWidth, int imageHeight) {
    setupImagePositionOnHidePositive(resultUri, offsetX, offsetY, imageWidth, imageHeight);
    finish();
}

@java.lang.Override
public void onClick(android.view.View v) {
    registerFirstName.setHint("Society Name");
    registerLastName.setHint("Faculty");
}

@java.lang.Override
protected android.graphics.Bitmap doInBackground(java.lang.String... paths) {
    android.graphics.Point screenSize = getDisplaySize(this);
    return decodeSampledBitmapResource(paths[0], screenSize.x, screenSize.y);
}

@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... urls) {
    try {
        return aman.darkgoals.UrlFetcher.downloadTextFile(urls[0]);
    } catch (java.io.IOException e) {
        return "Unable to retrieve web page. URL may be invalid.";
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.kii.cloud.storage.KiiUser.logOut();
}

public void ReturnClaim(android.view.MenuItem menu) {
    android.widget.Toast.makeText(this, "Returning to claimlist", Toast.LENGTH_SHORT).show();
    android.content.Intent intent = new android.content.Intent(this, com.cmput301w15t15.travelclaimsapp.activitys.AddClaimActivity.class);
    startActivity(intent);
}

public void reveal(@android.support.annotation.Size(value = 2)
@android.support.annotation.NonNull
final int[] from) {
    if (changeState(de.wackernagel.android.sidekick.widgets.CircularRevealView.STATE_REVEAL_STARTED)) {
        animationState = de.wackernagel.android.sidekick.widgets.CircularRevealView.ANIMATION_STARTING;
        circleX = from[0];
        circleY = from[1];
        android.support.v4.view.ViewCompat.postInvalidateOnAnimation(this);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    nu.yona.app.YonaApplication.getEventChangeManager().registerListener(this);
    loadPasscodeView();
    initializeAnimation();
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    this.finish();
}

private void initGameFragment() {
    init();
    stan.bulls.cows.db.SQliteApi.clearGameTemp();
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mNote.setTaskDone(buttonView.isChecked(), true);
    updateData();
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    com.jstakun.gms.android.config.ConfigurationManager.getInstance().setLocation(location);
    mLocationHandler.sendEmptyMessage(com.jstakun.gms.android.location.GmsLocationServicesManager.UPDATE_LOCATION);
}

@java.lang.Override
public void onSuccess(java.io.InputStream inputStream, android.os.Bundle params) {
    android.util.Log.i(com.sdk.snippets.modules.SnippetsCustomObjects.TAG, "file downloaded");
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    return false;
}

public static void setViewerVisibility(boolean visible) {
    if ((com.atinternet.tracker.Debugger.bubbleImage) != null) {
        com.atinternet.tracker.Debugger.bubbleVisibility = (visible) ? android.view.View.VISIBLE : android.view.View.GONE;
        com.atinternet.tracker.Debugger.bubbleImage.get().setVisibility(com.atinternet.tracker.Debugger.bubbleVisibility);
    }
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    closeDrawer();
    setCurrentTag(id, true);
}

@java.lang.Override
public int compareTo(@android.support.annotation.NonNull
edu.byu.support.feature.Feature another) {
    return getName().toLowerCase().compareTo(another.getName().toLowerCase());
}

public static void unBindService() {
    if ((com.bytereal.byterealblesdk.broadcast.receiver.BluetoothBroadcastReceiver.context) != null) {
        android.content.Intent stopIntent = new android.content.Intent(com.bytereal.byterealblesdk.broadcast.receiver.BluetoothBroadcastReceiver.context, com.bytereal.byterealblesdk.service.IBeaconScanService.class);
        com.bytereal.byterealblesdk.broadcast.receiver.BluetoothBroadcastReceiver.context.stopService(stopIntent);
    }
}

@java.lang.Override
public void onButtonClick(android.app.AlertDialog _dialog, int actionId) {
    if ((com.panzyma.nm.auxiliar.AppDialog.OK_BUTTOM) == actionId) {
        Load_Data(com.panzyma.nm.view.LOAD_DATA_FROM_LOCALHOST);
        _dialog.dismiss();
    }
}

public static final java.lang.String deprecatedPath(final android.content.Context p) {
    return ((android.os.Environment.getExternalStorageDirectory().getAbsolutePath()) + "/app-data/") + (p.getPackageName());
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder holder, int format, int width, int height) {
    stopPaint();
    startPaint(width, height);
}

public boolean onOptionsItemSelected(android.view.MenuItem item) {
    finish();
    return true;
}

@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle instanceState) {
    super.onSaveInstanceState(instanceState);
    stopQuizTimerCount();
    saveViewData(instanceState);
}

@java.lang.Override
public void onStartFailure(int errorCode) {
    super.onStartFailure(errorCode);
    android.util.Log.e("BLE", ("Advertising onStartFailure: " + errorCode));
}

@java.lang.Override
public void run() {
    mHandler.postDelayed(this, 1000);
    recv();
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    return new selinabing.cranberrymelon.AvailabilityFragment();
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Button button = ((android.widget.Button) (v));
    _currentText.setText("0");
    _haveDot = false;
    _gotResult = false;
    _haveError = false;
}

public android.graphics.Bitmap GrayscaleColor(android.graphics.Bitmap original) {
    android.graphics.ColorMatrix colorMatrix = new android.graphics.ColorMatrix();
    colorMatrix.setSaturation(0);
    return this.process(original, colorMatrix);
}

@java.lang.Override
public void onClick(android.view.View view) {
    button5.setText(((mark) + ""));
    placeMarkOnBoard(1, 1);
    button5.setEnabled(false);
    checkForWinOrDraw();
}

@java.lang.Override
public net.validcat.fishing.adapters.ThingsAdapter.ViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    return new net.validcat.fishing.adapters.ThingsAdapter.ViewHolder(android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.things_list_item, parent, false));
}

private void init(android.view.View view) {
    currentStartPosition = 0;
    initView(view);
    getFunnyPics(0);
}

public void loadSetup(int position) {
    com.androidandyuk.kitchentimer.MainActivity.itemList.clear();
    com.androidandyuk.kitchentimer.timerSetup thisSetup = com.androidandyuk.kitchentimer.MainActivity.savedSetups.get(position);
    for (com.androidandyuk.kitchentimer.timerItem thisItem : thisSetup.itemsSetup) {
        com.androidandyuk.kitchentimer.MainActivity.itemList.add(thisItem);
    }
}

