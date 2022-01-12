@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    com.android.debug.hv.ViewServer.get(this).removeWindow(this);
}

@java.lang.Override
public void onClick(android.view.View v) {
    dismiss();
    if ((onSaveListener) != null) {
        onSaveListener.onSave(mEditText.getText().toString(), task);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstance) {
    super.onCreate(savedInstance);
    com.duck.owlcctv.databinding.ActivityAuthLoginBinding binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_auth_login);
    binding.setViewModel(viewModel);
    android.util.Log.d(com.duck.owlcctv.activity.AuthLoginActivity.TAG, "onCreate finished");
}

private boolean tienePermiso(java.lang.String permissionName) {
    return (android.support.v4.content.ContextCompat.checkSelfPermission(this, permissionName)) != (android.content.pm.PackageManager.PERMISSION_GRANTED);
}

public android.graphics.Bitmap crop(android.graphics.Bitmap _bm) {
    return tungt.demo.camera.processimage.ImageProcess.squareCropv2(_bm);
}

@java.lang.Override
public void onCheckedChanged(android.widget.RadioGroup group, int checkedId) {
    element.setValue((checkedId == (R.id.yes) ? 1 : -1));
}

private void showWarning(int errorTitle, int errorMessage) {
    new android.support.v7.app.AlertDialog.Builder(getContext()).setTitle(errorTitle).setMessage(errorMessage).setPositiveButton(R.string.OK, null).create().show();
}

@java.lang.Override
public boolean onClusterItemClick(com.bridge.soom.Model.ProviderBasic providerBasic) {
    android.widget.Toast.makeText(this, "onClusterItemClick --down", Toast.LENGTH_LONG).show();
    return false;
}

@java.lang.Override
public void fragmentItemViewDismiss() {
    this.instantiableViewControllerRequestsDismissal(itemViewFragment.instance);
    if ((itemViewFragment) != null) {
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        fm.popBackStackImmediate();
    }
}

@java.lang.Override
public void onPositiveButtonClicked() {
    net.somethingdreadful.MAL.account.AccountService.clearData(true);
    startActivity(new android.content.Intent(this, net.somethingdreadful.MAL.FirstTimeInit.class));
    finish();
}

@java.lang.Override
public android.graphics.Bitmap getBitmap(java.lang.String key) {
    return this.images.get(key);
}

public java.lang.String getRoomDescription() {
    android.util.Log.i("teng DROOOfbdfbgr222", roomDescript);
    if ((roomDescript) == "") {
        return backUpRoomDescription;
    }
    return roomDescript;
}

public static void removeStock(android.content.Context context, java.lang.String symbol) {
    com.udacity.stockhawk.data.PrefUtils.editStockPref(context, symbol, false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, "Presionó botón Creditos", Toast.LENGTH_SHORT).show();
    olimpiadas.sena.com.olimpiadasmath.util.DialogHelper.showCopyRightDialog(v.getContext());
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    binder = new nya.miku.wishmaster.ui.posting.PostingService.PostingServiceBinder();
    notificationManager = ((android.app.NotificationManager) (getSystemService(nya.miku.wishmaster.ui.posting.NOTIFICATION_SERVICE)));
    nya.miku.wishmaster.common.Logger.d(nya.miku.wishmaster.ui.posting.PostingService.TAG, "created posting service");
}

protected void removeHandler(android.os.Handler handler) {
    handler.removeCallbacksAndMessages(null);
    io.realm.BaseRealm.handlers.remove(handler);
    this.handler = null;
}

public void initialData() {
    com.android.frankthirteen.timetracker.model.TrackerItem t1;
    com.android.frankthirteen.timetracker.model.TrackerItem t2;
    t1 = new com.android.frankthirteen.timetracker.model.TrackerItem(getActivity());
    t1.setmTitle("ta ");
    com.android.frankthirteen.timetracker.model.TrackerItemLab.getsTrackerItemLab(getContext()).addTrackItem(t1);
}

public static boolean isBrowseable(@android.support.annotation.NonNull
java.lang.String mediaID) {
    return (mediaID.indexOf(com.kabouzeid.gramophone.auto.MediaIDHelper.LEAF_SEPARATOR)) < 0;
}

public void createNewRunningProtocol(java.lang.String userId, java.lang.String farmId, java.lang.String protocolId, java.util.ArrayList<com.vetoquinol.vetosynch.AnimalEntry> animals, java.util.Date dateToStart, android.content.Context context) {
    new com.vetoquinol.vetosynch.RunningProtocolModel.CreateRunningProtocolThread(userId, farmId, protocolId, animals, dateToStart, context).start();
}

public void onClick(android.content.DialogInterface dialog, int pPosition) {
    mDisplayMainList.add(passedPosition, input.getText().toString());
    ((android.widget.BaseAdapter) (mListView.getAdapter())).notifyDataSetChanged();
}

@java.lang.Override
protected void onPause() {
    android.util.Log.i(com.hydraproductions.cicada.PhoneStatus.TAG, "ON PAUSE");
    telephonyManager.listen(phoneStateListener, PhoneStateListener.LISTEN_NONE);
}

public void accessError() {
    android.widget.Toast.makeText(getApplicationContext(), getResources().getString(R.string.accessErorr), Toast.LENGTH_LONG).show();
}

@android.support.annotation.Nullable
public static iris_view.com.msgqueue.LooperTest myLooper() {
    iris_view.com.msgqueue.LooperTest.chechkLooper();
    return iris_view.com.msgqueue.LooperTest.looperTest;
}

@java.lang.Override
public void onClick(android.view.View v) {
    spp.sppMessage("SCN DOWN\r");
    setFrequency("___._");
    setRDS("");
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d("PROCESS!!", "updateButton.setOnClickListener");
    com.onettm.directions.DirectionsApplication.getInstance().getLocationsManager().invalidate();
}

@java.lang.Override
public void onViewCreated(@android.support.annotation.Nullable
android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    this.bankTransactionSupplier.addDataListeningObject(this);
    this.bankTransactionSupplier.onResume();
    updateCalendar();
}

@java.lang.Override
public void save() {
    executeTransaction(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.Builder<>(new com.raizlabs.android.dbflow.structure.database.transaction.ProcessModelTransaction.ProcessModel<com.raizlabs.android.dbflow.structure.TModel>() {
        @java.lang.Override
        public void processModel(com.raizlabs.android.dbflow.structure.TModel model) {
            model.save();
        }
    }).build());
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    if (!(com.android.internal.util.cm.ScreenType.isTablet(this))) {
        getListView().setPadding(0, 0, 0, 0);
    }
}

abstract void run(android.content.Intent intent);

@java.lang.Override
public void onClick(android.view.View v) {
    mCamera = mPreview.changeCamera();
    flashMode = mCamera.getParameters().getFlashMode();
    if ((flashMode) == null) {
        flashEnabled = false;
        flashButton.setSelected(flashEnabled);
    }
}

public void onClick(android.content.DialogInterface dialog, int id) {
    isSaved = true;
    recordedFilename = saveFile(finalFrom, finalToTemp, suggestedFilename);
    filenameView.setText(suggestedFilename);
    finalTo.delete();
    finalToTemp.renameTo(finalTo);
}

public static int i(java.lang.String tag, java.lang.String msg) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_INFO) {
        return android.util.Log.i(tag, msg);
    }
    return 0;
}

public static void storeAppInstalled(android.content.Context context, java.lang.String appInstalled) {
    android.content.SharedPreferences sharedPreferences = com.silverpop.engage.config.EngageConfig.getConfigSharedPrefs(context);
    sharedPreferences.edit().putString(com.silverpop.engage.config.EngageConfig.SharedProperties.APP_INSTALLED.toString(), appInstalled).commit();
}

@java.lang.Override
public void onCompletion(android.media.MediaPlayer mp) {
    if ((player.getCurrentPosition()) > 0) {
        player.reset();
        playNext();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.lang.String[] compliments = getResources().getStringArray(R.array.compliments_arr);
    com.example.helloworld.ComplimentService.initialize(this, compliments);
    setContentView(R.layout.activity_main);
}

@java.lang.Override
public boolean onLoadMore(int page, int totalItemsCount) {
    com.loopj.android.http.RequestParams params = new com.loopj.android.http.RequestParams();
    params.put("count", 25);
    params.put("max_id", com.walmartlabs.classwork.tweets.activities.TimelineActivity.maxId);
    fetchAndPopulateTimeline(params);
    return true;
}

@java.lang.Override
public void onActivityResumed(android.app.Activity activity) {
    com.gigigo.ggglogger.GGGLogImpl.log("CloudRecognitionActivityLifeCycleCallBack.onActivityResumed");
    if (com.gigigo.vuforiacore.sdkimagerecognition.icloudrecognition.CloudRecognitionActivityLifeCycleCallBack.mActivity.equals(activity))
        this.mCloudReco.on_Resume();
    
}

@java.lang.Override
public void onClick(android.view.View view) {
    switch (composerType) {
        case net.kyouko.cloudier.ui.activity.ComposerActivity.TYPE_NEW :
        default :
            sendTweet();
        case net.kyouko.cloudier.ui.activity.ComposerActivity.TYPE_COMMENT :
            comment();
        case net.kyouko.cloudier.ui.activity.ComposerActivity.TYPE_RETWEET :
            retweet();
    }
}

@java.lang.Override
public void onCancel() {
    android.util.Log.d(com.example.gek.firebaseauth.MyFaceBookActivity.TAG, "facebook:onCancel");
    updateUI(null);
}

@android.support.annotation.WorkerThread
@java.lang.Override
public void run() {
    com.github.miao1007.animewallpaper.support.GlobalContext.startThirdFrameWork();
    repo = com.github.miao1007.animewallpaper.utils.SquareUtils.getRetrofit(DanbooruAPI.KONACHAN).create(com.github.miao1007.animewallpaper.support.api.konachan.DanbooruAPI.class);
    runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            onRefresh();
        }
    });
}

public void setItemList(@android.support.annotation.NonNull
java.util.ArrayList<T> itemList) {
    this.itemList = itemList;
    org.bbt.kiakoa.tools.ListItemClickRecyclerAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void onPlay() {
    super.onPlay();
    android.util.Log.d(com.vpaliy.melophile.playback.PlaybackManager.TAG, "onPlay");
    handlePlayRequest(queueManager.current());
}

public static void recordAlert(int resid) {
    org.json.JSONObject jmessage = new org.json.JSONObject();
    de.xavaro.android.common.Json.put(jmessage, "message", de.xavaro.android.common.Simple.getTrans(resid));
    de.xavaro.android.common.ActivityManager.recordAlert(jmessage);
}

@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onShowCustomView(android.view.View view, int requestedOrientation, acr.browser.lightning.view.CustomViewCallback callback) {
    mUIController.onShowCustomView(view, callback);
    super.onShowCustomView(view, requestedOrientation, callback);
}

public static boolean isPlaying() {
    return com.hustunique.parsingplayer.player.media.ParsingMediaManager.getInstance(android.support.test.InstrumentationRegistry.getTargetContext()).isPlaying();
}

public void restoreActionBar() {
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    if (actionBar != null) {
        actionBar.setDisplayShowTitleEnabled(true);
        setTitle(mTitle);
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    setContentView(R.layout.activity_main);
    this.fetchContactsWrapper();
    this.fetchSMSWrapper();
}

public static android.location.Location locFromLatLng(com.google.android.gms.maps.model.LatLng input) {
    android.location.Location res = new android.location.Location("", (result = new android.location.Location("")));
    result.setLatitude(input.latitude);
    result.setLongitude(input.longitude);
    return result;
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    valueEmail = authEmail.getText().toString();
    valuePassword = authPassword.getText().toString();
    dialog.dismiss();
    return ;
}

@java.lang.Override
public void onClick(android.view.View v) {
    clickSpace(boardImages.get(j));
}

@java.lang.Override
public void run() {
    if (!(mScanning))
        return ;
    
    mScanning = false;
    android.util.Log.e(com.nordicid.nurapi.NurDeviceScanner.TAG, "Scanning STOP BLE");
    mBluetoothAdapter.stopLeScan(mLeScanCallback);
    mListener.onScanFinished();
}

public com.azzarcher.colormanager.ColorManager setStatusBarColor(android.view.Window window, int statusBarColor) {
    window.setStatusBarColor(mStatusBarColor);
    mWindow = window;
    mStatusBarColor = statusBarColor;
    return this;
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((mListener) != null) {
        mListener.onSearchItemClick(view, getLayoutPosition());
    }
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    android.util.Log.i(Constants.APP_NAME, "onActivityCreated: to initLoader");
    getLoaderManager().initLoader(com.franktan.popularmovies.MoviesGridFragment.MOVIE_LOADER_ID, null, this);
    super.onActivityCreated(savedInstanceState);
}

@retrofit2.http.Multipart
@retrofit2.http.POST(value = "upload/")
retrofit2.Call<com.androidbuts.api.response.Result> uploadFile(@retrofit2.http.Part
okhttp3.MultipartBody.Part file, @retrofit2.http.Part(value = "description")
okhttp3.RequestBody name);

public void rescheduleAlarms(android.content.Context context) {
    loadAlarmList(context);
    for (int i = 0; i < (alarmList.size()); i++) {
        createNewAlarm(context, alarmList.get(i));
    }
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.content.Intent sendIntent = new android.content.Intent(context, com.example.android.popularmovies.service.MovieService.class);
    sendIntent.putExtra(com.example.android.popularmovies.service.MovieService.MOIVE_QUERY_CRITERIA, intent.getStringExtra(com.example.android.popularmovies.service.MovieService.MOIVE_QUERY_CRITERIA));
    context.startService(intent);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_PICK);
    intent.setType("image/*");
    getActivity().startActivityForResult(intent, com.example.nobell.project3.ui.FriendAddFragment.EditButtonListener.SELECT_PHOTO);
}

@java.lang.Override
public void onClick(android.view.View view) {
    super.onClick(view);
    if (!(getSelectMode())) {
        final com.gelakinetic.mtgfam.helpers.DecklistHelpers.CompressedDecklistInfo item = mItems.get(getAdapterPosition());
        showDialog(DecklistDialogFragment.DIALOG_UPDATE_CARD, item.mCard.mName, item.mIsSideboard);
    }
}

private void createShortToast(java.lang.String message) {
    android.widget.Toast.makeText(super.getActivity(), message, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((listener) != null)
        listener.onClick(v, datas.get(position));
    
}

public boolean shouldOverrideUrlLoading(android.webkit.WebView view, java.lang.String url) {
    mEdittext.setText(url);
    return _handleRedirect(url);
}

public static void stop(android.content.Context context) {
    tranquvis.simplesmsremote.Services.SmsReceiver.SMSReceiverService.setStatus(context, ReceiverStatus.Stopped);
    context.stopService(new android.content.Intent(context, tranquvis.simplesmsremote.Services.SmsReceiver.SMSReceiverService.class));
}

@butterknife.OnClick(value = R.id.button_sign_in)
void signIn() {
    android.content.Intent signIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);
    startActivityForResult(signIntent, com.learnera.app.LoginActivity.RC_SIGN_IN);
}

public void logMetricsAndFinishDelayed(int delayMs) {
    android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
    handler.postDelayed(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            logMetricsAndFinish();
        }
    }, 3000);
}

public void insere(br.com.marco.agenda.model.Aluno aluno) {
    android.database.sqlite.SQLiteDatabase database = getWritableDatabase();
    android.content.ContentValues dados = getDados(aluno);
    long idAluno = database.insert("Alunos", null, dados);
    aluno.setId(idAluno);
}

private void setupFeed() {
    android.support.v7.widget.LinearLayoutManager linearLayoutManager = new android.support.v7.widget.LinearLayoutManager(getActivity()) {
        @java.lang.Override
        protected int getExtraLayoutSpace(android.support.v7.widget.RecyclerView.State state) {
            return 300;
        }
    };
    rvFeed.setLayoutManager(linearLayoutManager);
    updateRecyclerView();
}

@java.lang.Override
public void onAdFailedToLoad(int errorCode) {
    super.onAdFailedToLoad(errorCode);
    com.crashlytics.android.Crashlytics.log(("Banner Failed To Load: " + errorCode));
}

public void onClick(android.view.View v) {
    if (buttonName.equals("Restart")) {
        dialog.dismiss();
        activity.finish();
    }else {
        dialog.dismiss();
    }
}

public boolean getHideCompleted() {
    android.os.Bundle arguments = getArguments();
    if ((cbHideCompleted) == null) {
        return !(arguments.getBoolean(ActiveFilter.INTENT_HIDE_COMPLETED_FILTER, false));
    }else {
        return !(cbHideCompleted.isChecked());
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    com.parse.Parse.enableLocalDatastore(this);
    com.parse.Parse.initialize(this, "FHwTc8y140hzykJ9bRRf5rcQAx9fIWENsF5Og9Xh", "98T1AS8768nb2UAMiaaGL1SuecHaYooPZo4w8IH5");
    parse = new com.parse.ParseObject("ParseObj");
}

private void makeFullScreen() {
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    actionBar.hide();
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    mIsTracking = false;
    mMediaController.getTransportControls().seekTo(getProgress());
}

@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            return new cn.ucai.fulicenter.fragments.NewGoodsFragment();
        case 1 :
            return new cn.ucai.fulicenter.fragments.BoutiqueFragment();
        case 2 :
            return new cn.ucai.fulicenter.fragments.CategoryFragment();
    }
    return new cn.ucai.fulicenter.fragments.NewGoodsFragment();
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.example.maxspahn.studentbnb.TimePickerFragment newFragment = new com.example.maxspahn.studentbnb.TimePickerFragment();
    newFragment.show(getFragmentManager(), "timePicker");
    newFragment.setActivity(initdateButton, true);
}

@java.lang.Override
public void onClick(android.view.View view) {
    lb.startLoading();
    sucBtn.setEnabled(true);
    failedBtn.setEnabled(true);
}

@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.widget.Toast.makeText(this, (("Service is stopped " + (timeInMilliseconds)) + " miliseconds"), Toast.LENGTH_LONG).show();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setupLocationClient();
    mPointQuadTree = new com.google.maps.android.quadtree.PointQuadTree<com.fabiendem.defib68.models.defibrillator.DefibrillatorClusterItem>(com.fabiendem.defib68.utils.HautRhinUtils.LEFT_BOUND, com.fabiendem.defib68.utils.HautRhinUtils.RIGHT_BOUND, com.fabiendem.defib68.utils.HautRhinUtils.BOTTOM_BOUND, com.fabiendem.defib68.utils.HautRhinUtils.TOP_BOUND);
    mMapDefibrillators = new java.util.HashMap<java.lang.String, com.fabiendem.defib68.models.defibrillator.DefibrillatorModel>();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    android.widget.Toast.makeText(getBaseContext(), "Canceled", Toast.LENGTH_LONG).show();
    filter.setSelection(com.youber.cmput301f16t15.youber.gui.DriverSearchListActivity.adapter.getCount());
}

@java.lang.Override
public void onClick(android.view.View v) {
    if ((tracker) != null)
        tracker.resetTree();
    
    importMindMap();
}

@java.lang.Override
public void onItemDeleteClick(android.view.View view, int position) {
    deleteItem((position - 1));
}

public void onEndOfSpeech() {
    android.util.Log.i(uk.co.tstableford.p_brain.MainActivity.TAG, "end of speech");
}

private void loadListViewFragment(java.lang.String title) {
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    android.support.v4.app.Fragment fragment = valdes.cindyslist.ListViewFragment.newInstance(title);
    fragmentManager.beginTransaction().add(R.id.list_view_activity_fragment_container, fragment).commit();
}

protected void createLocationRequest() {
    mLocationRequest = new com.google.android.gms.location.LocationRequest();
    mLocationRequest.setInterval(treadsetters.bikesmart.LocationService.UPDATE_INTERVAL_IN_MILLISECONDS);
    mLocationRequest.setFastestInterval(treadsetters.bikesmart.LocationService.FASTEST_UPDATE_INTERVAL_IN_MILLISECONDS);
    mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    mLocationRequest.setSmallestDisplacement(2);
}

public void aboutAuthor(android.view.View view) {
    go2Activity(com.ice1000.alpd.AboutMeActivity.class, true);
}

private void toast(int text) {
    android.widget.Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    butterknife.ButterKnife.bind(this);
    setContentView(R.layout.activity_main);
    setSupportActionBar(toolbar);
}

public static android.support.v4.app.Fragment newInstance(java.lang.String shippingName) {
    com.kosbrother.mongmongwoo.fragments.PurchaseFragment4 fragment = new com.kosbrother.mongmongwoo.fragments.PurchaseFragment4();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.kosbrother.mongmongwoo.fragments.PurchaseFragment4.ARG_SHIPPING_NAME, shippingName);
    fragment.setArguments(args);
    return fragment;
}

@java.lang.Override
public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String mode) throws java.io.FileNotFoundException {
    android.util.Log.i("Hier", "open");
    return super.openFile(uri, mode);
}

@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.util.Log.d(org.buildmlearn.toolkit.activity.TemplateEditor.TAG, "onCreateOptionsMenu");
    return true;
}

boolean pixelWithinArea(com.example.m.divis.Shape s, android.graphics.Point px) {
    return pixelWithinArea(s.center, s.radius, px);
}

public static int getCacheKey() {
    int weekOfYear = de.atomfrede.android.mensa.ubi.util.Util.getWeekOfYear();
    int year = de.atomfrede.android.mensa.ubi.util.Util.getYear();
    int cacheKey = year + weekOfYear;
    return cacheKey;
}

@java.lang.Override
public boolean dispatchTouchEvent(android.view.MotionEvent event) {
    java.lang.System.out.println("-------dispatchTouchEvent");
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
    }
    return super.dispatchTouchEvent(event);
}

private boolean isNetworkAvailable() {
    android.net.ConnectivityManager connectivityManager = ((android.net.ConnectivityManager) (mContext.getSystemService(Context.CONNECTIVITY_SERVICE)));
    android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
    return (activeNetworkInfo != null) && (activeNetworkInfo.isConnected());
}

@java.lang.Override
public void onViewRecycled(android.support.v7.widget.RecyclerView.ViewHolder holder) {
    super.onViewRecycled(holder);
    lifecycleSubject.onNext(null);
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    if ((bfv.enemyThread) != null) {
        bfv.enemyThread.paused = true;
    }
    android.util.Log.i("Stop--", "OnStop");
}

private void gPlusSignOut() {
    revokeAccess();
    Auth.GoogleSignInApi.signOut(mGoogleApiClient).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status>() {
        @java.lang.Override
        public void onResult(com.google.android.gms.common.api.Status status) {
        }
    });
}

private boolean hasViewReorderEnabled(android.view.View v) {
    return (v != null) && (true != (v.getTag(org.askerov.dynamicgrid.DynamicGridView.TAG_REORDER_DISABLED)));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    gamercompanion.src.activities.controlling.ActivityController.set_activeContext(this);
    gamercompanion.src.activities.controlling.ActivityController.set_activeActivity(this);
}

@java.lang.Override
public void run() {
    final android.content.Intent mainIntent = new android.content.Intent(this, com.sierisimo.idareyoutobeawesome.MainActivity.class);
    startActivity(mainIntent);
    finish();
}

