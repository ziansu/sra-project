@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String address) {
    geoCodeTypedAddress(address);
    mSearchSearchView.clearFocus();
    mLocationSearchView.clearFocus();
    return true;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    if ((this.language) != null) {
        outState.putInt("CURRENT_LANG", this.language.getId());
        super.onSaveInstanceState(outState);
    }
}

@java.lang.Override
public void logOut() {
    sessionStorageService.clear();
    userStorageService.clear();
}

@java.lang.Override
public void run() {
    android.util.Log.d(org.physical_web.physicalweb.NearbyBeaconsFragment.TAG, "running second scan timeout");
    emptyGroupIdQueue();
    mSecondScanComplete = true;
}

public android.database.Cursor getSuggestionById(java.lang.String suggestionId) {
    return getReadableDatabase().query(SuggestionsConstract.SuggestionEntry.TABLE_NAME, null, ((SuggestionsConstract.SuggestionEntry.ID) + " LIKE ?"), new java.lang.String[]{ suggestionId }, null, null, null);
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    mAuth.addAuthStateListener(this);
    return super.onStartCommand(intent, flags, startId);
}

@java.lang.Override
public void onClick(android.view.View v) {
    dismiss();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.i(DBG_TAG, "OnCreate()");
    savedInstance_ = this;
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(DropTable);
    onCreate(db);
}

private void insertExamples(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL("insert into user (username,password ) values (\"yo mismo\",\"upcuo\"),(\"usuario369\",\"misuperpass\")");
    db.execSQL("insert into expense (exp_name,exp_amount,exp_paid) values(\"luz\",50,1),(\"agua\",60,1),(\"internet\",100,1),(\"otros gastos\",50,1),(\"modelo 130\",10,1)");
    db.execSQL("insert into purchase (pur_name,pur_strike) values(\"agua mineral\",0),(\"amor\",1),(\"chocolate\",0),(\"vino\",1),(\"un dragon de komodo\",1)");
}

public static void showProfile(@android.support.annotation.NonNull
android.app.Fragment fragment, @android.support.annotation.Nullable
java.util.HashMap<java.lang.String, java.lang.String> extras) {
    if (fragment != null) {
        com.airmap.airmapsdk.networking.services.AirMap.showProfile(fragment, com.airmap.airmapsdk.networking.services.AirMap.getUserId(), extras);
    }
}

public void selectSatisfied(android.view.View view) {
    sentimentIndex = 3;
    updateSentiments();
}

public void handleMessage(android.os.Message msg) {
    musiclist.setAdapter(new com.salt.saltmusic.Home.MusicListAdapter());
}

@java.lang.Override
public void success(com.twitter.sdk.android.core.Result<com.twitter.sdk.android.core.TwitterSession> result) {
    handleSuccess(result.data);
}

@java.lang.Override
public void onBackPressed() {
    android.util.Log.i(TAG, "onBackPressed - start");
    setResult(com.modelingbrain.home.detailModel.RESULT_OK);
    super.onBackPressed();
    android.util.Log.i(TAG, "onBackPressed - finish");
}

public void bindType(nl.fhict.happynews.android.model.Post post) {
    this.post = post;
    itemView.setAlpha((nl.fhict.happynews.android.controller.ReadingHistoryController.getInstance().postIsRead(post) ? 0.3F : 1.0F));
}

public void setIsSelect(boolean selected) {
    if (selected)
        scaleAnimDrawable.expand(Gravity.START, ScaleAnimDrawable.AnimSide.BothSide);
    else
        scaleAnimDrawable.shrink(Gravity.START, ScaleAnimDrawable.AnimSide.BothSide);
    
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
    return super.onPrepareOptionsMenu(menu);
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    com.nexb.shopr4.FireBaseController.getI().setActiveShopListName(((android.widget.EditText) (v.findViewById(R.id.listNameEdit))).getText().toString());
    return true;
}

@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    showAdIfItVisible(mCustomAdapter);
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    currentlyEditing = null;
    editingPosition = -1;
    doUnHighlighted(holder, comment, baseNode, true);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> view, android.view.View arg1, int arg2, long arg3) {
    locName = view.getSelectedItem().toString().trim();
}

@java.lang.Override
public void onClick(android.view.View view) {
}

@java.lang.Override
public void refreshData() {
    com.jwang.android.gymmate.task.media_task.RequestMediaByLocationId requestMediaByLocationId = new com.jwang.android.gymmate.task.media_task.RequestMediaByLocationId(getActivity());
    requestMediaByLocationId.execute(mLocationId);
}

@java.lang.Deprecated
public void update(com.google.android.gms.maps.Projection projection, com.google.android.gms.maps.model.CameraPosition cameraPosition) {
    update(cameraPosition);
}

public void setDrawable(android.graphics.drawable.Drawable drawable, io.doist.material.drawable.WrapperDrawable owner) {
    mDrawable = drawable;
    mDrawable.setCallback(owner);
    mChildChangingConfigurations = mDrawable.getChangingConfigurations();
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    mQuestionsAdapter.swapCursor(data);
}

public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
    return super.onInterceptTouchEvent(event);
}

@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(android.content.ContentValues.TAG, drugClass);
    drugClassSearch(drugClass);
}

@java.lang.Override
public void onLocationChanged(android.location.Location loc) {
    if (null != loc) {
        plotRoute();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
}

private void loadIcon(@android.support.annotation.NonNull
com.facebook.ads.NativeAd nativeAd) {
    com.mapswithme.util.UiUtils.show(mIcon);
    com.facebook.ads.NativeAd.Image icon = nativeAd.getAdIcon();
    com.facebook.ads.NativeAd.downloadAndDisplayImage(icon, mIcon);
}

public void showFragment(android.support.v4.app.Fragment fragment) {
    if (null != fragment) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.show(fragment);
        fragmentTransaction.commit();
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    com.czbix.v2ex.dao.NodeDAO.createTable(db);
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    if (isSetup)
        stopLocationUpdates();
    
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.example.kandoe.Model.Organisation>> call, java.lang.Throwable t) {
    java.lang.System.out.println(t.toString());
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    inAlphabeticalOrder = android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("alphabetic", true);
    initFab();
    initRecyclerView();
}

public void onClick(android.view.View buttonView) {
    android.content.Intent myIntent = new android.content.Intent(buttonView.getContext(), activity.ctec.jbur0473.selfintroduction.SchoolScreen.class);
    startActivityForResult(myIntent, 1);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    chatRoomID = getArguments().getString(umd.cmsc436.cmsc436finalproject.UsersChatRoomFragment.ARG_CHATROOM_ID);
    chatRoomNAME = getArguments().getString(umd.cmsc436.cmsc436finalproject.UsersChatRoomFragment.ARG_CHATROOM_NAME);
}

private android.os.Handler getDecryptingThreadHandler() {
    if (null == (mDecryptingHandler)) {
        mDecryptingHandler = new android.os.Handler(mDecryptingHandlerThread.getLooper());
    }
    if (null == (mDecryptingHandler)) {
        return mUIHandler;
    }
    return mDecryptingHandler;
}

@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.i(com.codecool.android.neightbrotaxi.view.MainActivity.TAG, "ACTIVITY RESUMED!");
}

public void attachPreDrawListener() {
    getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {
        @java.lang.Override
        public boolean onPreDraw() {
            getViewTreeObserver().removeOnPreDrawListener(this);
            setVisibility(View.GONE);
            setupAnimator();
            return true;
        }
    });
}

@java.lang.Override
public java.util.List<com.example.android.booklisting.Book> loadInBackground() {
    if ((mUrl) == null) {
        return null;
    }
    return com.example.android.booklisting.QueryUtils.fetchBookData(mUrl);
}

public void onLoadResource(android.webkit.WebView view, java.lang.String url) {
}

@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(com.suta.MainApplication.mCallbackManager), new com.imagepicker.ImagePickerPackage());
}

@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new io.jchat.android.JMessageReactPackage(com.sample.application.MainApplication.SHUTDOWN_TOAST), new com.honaf.dialog.MyDialogPackage(), new com.horcrux.svg.SvgPackage());
}

public void onClick(android.view.View view) {
    if ((portions) > 0) {
        (portions)--;
    }
    portionQuantity.setText(java.lang.String.valueOf(portions));
}

public void replaceFragment(int fragmentContainerResId, android.support.v4.app.Fragment fragment) {
    replaceFragment(fragmentContainerResId, fragment, null);
}

public static AlertDialog.Builder generateDialog(android.content.Context context, java.lang.String title, java.lang.String message) {
    return new android.support.v7.app.AlertDialog.Builder(context).setTitle(title).setMessage(message);
}

@java.lang.Override
public void onClick(android.view.View v) {
    checkAnswer(true);
}

public void onRmsChanged(float rmsdB) {
}

@java.lang.Override
public void onClick(android.view.View v) {
    getActivity().startActivityForResult(new android.content.Intent(getActivity(), com.historicar.app.activity.InsertOrEditDriverActivity.class), Constants.REQUEST_FOR_CREATE_DRIVER);
}

@java.lang.Override
protected void onActivityResult(int aRequestCode, int aResultCode, android.content.Intent data) {
    if (data != null) {
        am.te.myapplication.Model.Listing newListing = am.te.myapplication.Model.Listing.getListingFromIntent(data);
        products.add(newListing);
        arrayAdapter.notifyDataSetChanged();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    android.util.Log.i(LOG_TAG, "on handle intent");
    startForeground(28373, buildForegroundNotification("Lankasri FM"));
    handleIntent(intent);
}

public void restoreOriginalImage() {
    this.img = bitmapOriginalImage.copy(Bitmap.Config.ARGB_8888, true);
    isChanged = false;
}

public io.reactivex.Completable loadAsCompletable(final android.net.Uri sourceUri) {
    return loadAsCompletable(sourceUri, false, null);
}

@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    thumbnail.setColorFilter(android.graphics.Color.argb(0, 0, 0, 0));
}

public void btnAdd(android.view.View v) {
    this.holdDataOne = java.lang.Double.parseDouble(display.getText().toString());
    display.setText("");
    this.sign = "+";
    this.counter = 0;
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    return true;
}

@java.lang.Override
public void onTick(long millisUntilFinished) {
    volume = (volume) - (step);
    soundPool.setVolume(stream, volume, volume);
}

public void stopButtonAnimation() {
    clearAnimation();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
}

private void done() {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("imageArray", mImageArray);
    setResult(com.fonsecakarsten.audiobooky.RESULT_OK, intent);
    finish();
}

public static void ifmt(java.lang.String tag, java.lang.String fmt, java.lang.Object... args) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_INFO) {
        java.lang.String msg = java.lang.String.format(java.util.Locale.US, fmt, args);
        android.util.Log.i(tag, msg);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.idonans.acommon.util.SystemUtil.hideStatusBar(v);
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent newProfile = new android.content.Intent(v.getContext(), com.github.joey.mansbestfriend.Profile.class);
    startActivityForResult(newProfile, 3);
}

public void setTokenFromMain(java.lang.String token) {
    this.token = token;
    android.util.Log.d(starace.learn.com.musicfilter.Song.SongListFragment.TAG_SONG_FRAG, ("THE TOKEN IS SET FROM MAIN IN THE FRAGMENT " + token));
}

private void init() {
    getData();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    super.onSaveInstanceState(bundle);
    icepick.Icepick.saveInstanceState(this, bundle);
}

@java.lang.Override
public io.geeteshk.hyper.adapter.ProjectAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    java.util.Collections.sort(mObjects);
    android.view.View itemView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
    return new io.geeteshk.hyper.adapter.ProjectAdapter.MyViewHolder(itemView);
}

public com.android.volley.RequestQueue getRequestQueue() {
    if ((requestQueue) == null) {
        requestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.example.moreapp.App.context);
    }
    return requestQueue;
}

private void showSystemUI() {
    mDecorView.setSystemUiVisibility((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)));
}

public static android.content.Intent getIntent(android.content.Context context) {
    return new android.content.Intent(context, com.singh.harsukh.redder.AccessActivity.class);
}

public void bleServiceDiscovered(java.lang.String address) {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_SERVICE_DISCOVERED);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_ADDR, address);
    sendBroadcast(intent);
    requestProcessed(address, RequestType.DISCOVER_SERVICE, true);
}

@java.lang.Override
public void onFailure(okhttp3.Call call, java.io.IOException e) {
    android.widget.Toast.makeText(getContext(), R.string.failed_performing_request, Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d(com.lkworm.miniservice.MainActivity.TAG, "onPause");
}

private void setGrid() {
    layoutManager = new android.support.v7.widget.GridLayoutManager(activity, 2);
    recyclerView.setLayoutManager(layoutManager);
    recyclerView.setAdapter(photoAdapter);
}

@java.lang.Override
public void onClick(android.view.View v) {
    showListCreationFragment();
}

public static void i(java.lang.String tag, java.lang.String msg) {
    if ((com.vinci.imageloader.core.util.MLog.DEBUG) || (android.text.TextUtils.isEmpty(msg))) {
        return ;
    }
    android.util.Log.i(tag, msg);
}

private static java.lang.String getStringByFirstWord(java.lang.String firstWord) {
    java.lang.String ret = com.nanosic.stringup.DBController.getInstance(com.nanosic.stringup.StringGenerator.context).find(firstWord, false);
    android.util.Log.d(com.nanosic.stringup.StringGenerator.TAG, ("getStringByFirstWord: ret=" + ret));
    return ret;
}

public void attachToActivity(android.app.Activity activity, int slideStyle) {
    attachToActivity(activity, slideStyle, true);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mFScreenEventCallback.setHolder(holder);
    eventCallback.bindHolder(holder, position);
    mXibaListPlayUtil.startFullScreen(url, position, holder.container, eventCallback, mFScreenEventCallback);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (v.equals(register)) {
        startRegistration();
    }else
        if (v.equals(login)) {
            startMenu();
        }
    
}

@java.lang.Override
public void onUpdate(com.daimajia.swipe.SwipeLayout arg0, int arg1, int arg2) {
}

@java.lang.Override
protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
    v.getLayoutParams().height = (interpolatedTime == 1) ? targetHeight : ((int) (targetHeight * interpolatedTime));
    v.requestLayout();
}

@java.lang.Override
public void adReceived(com.applovin.sdk.AppLovinAd ad) {
    lastAd = ad;
    notifySuccess();
}

public static java.lang.String getStringFromSharedPreferences(java.lang.String key) {
    android.content.SharedPreferences sharedPreferences = com.byteshaft.waterassist.Helpers.getPreferenceManager();
    return sharedPreferences.getString(key, "");
}

@java.lang.Override
protected void initToolBar(android.view.View root) {
    super.initToolBar(root);
}

@java.lang.Override
public void notifyDataSetChanged() {
    mBaseAdapter.notifyDataSetChanged();
}

public void onClick(android.content.DialogInterface dialog, int id) {
    finish();
    java.lang.System.exit(1);
}

@java.lang.Override
public void playDefaultNotificationSound() {
    com.jdndeveloper.lifereminders.phone.Phone.notification = android.media.RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
    com.jdndeveloper.lifereminders.phone.Phone.r = android.media.RingtoneManager.getRingtone(com.jdndeveloper.lifereminders.phone.Phone.context, com.jdndeveloper.lifereminders.phone.Phone.notification);
    com.jdndeveloper.lifereminders.phone.Phone.r.play();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.support.v4.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.ab_refresh :
            this.refresh();
            return true;
        case R.id.ab_search :
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
}

protected java.lang.CharSequence getStepDescription() {
    final android.widget.EditText editText = ((android.widget.EditText) (getActivity().findViewById(R.id.inputStepDescriptionView)));
    return editText.getText();
}

@java.lang.Override
public void onScrollingFinished(com.terrydr.pickerview.wheelview.WheelView wheel) {
    result = java.lang.String.valueOf(arrayWheelAdapter.getItemText(wheel.getCurrentItem()));
    android.util.Log.i(com.terrydr.pickerview.PickerView_Plugin_intent.TAG, ("scrollListenerResult:" + (result)));
}

@java.lang.Override
protected void setResource(android.graphics.Bitmap resource) {
    android.support.v4.graphics.drawable.RoundedBitmapDrawable drawable = android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory.create(context.getResources(), resource);
    drawable.setCircular(false);
    holder.sponsorimage.setImageDrawable(drawable);
}

public int getPlayBufferSize() {
    int minBufferSize = android.media.AudioTrack.getMinBufferSize(44100, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
    return minBufferSize;
}

