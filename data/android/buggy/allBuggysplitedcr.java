@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String address) {
    android.util.Log.d("Search", "query text submit");
    geoCodeTypedAddress(address);
    mSearchSearchView.clearFocus();
    mLocationSearchView.clearFocus();
    return true;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putInt("CURRENT_LANG", this.language.getId());
    super.onSaveInstanceState(outState);
}

@java.lang.Override
public com.sasd13.proadmin.android.service.ServiceResult<java.lang.Void> logOut() {
    sessionStorageService.clear();
    userStorageService.clear();
    return new com.sasd13.proadmin.android.service.ServiceResult(true, 200);
}

@java.lang.Override
public void run() {
    android.util.Log.d(org.physical_web.physicalweb.NearbyBeaconsFragment.TAG, "running second scan timeout");
    emptyGroupIdQueue();
    showListView();
    mSecondScanComplete = true;
}

public android.database.Cursor getSuggestionById(java.lang.String suggestionId) {
    android.database.Cursor c = getReadableDatabase().query(SuggestionsConstract.SuggestionEntry.TABLE_NAME, null, ((SuggestionsConstract.SuggestionEntry.ID) + " LIKE ?"), new java.lang.String[]{ suggestionId }, null, null, null);
    return c;
}

@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    android.util.Log.d(com.concavenp.artistrymuse.services.UserAuthenticationService.TAG, "onStartCommand");
    mAuth.addAuthStateListener(this);
    return super.onStartCommand(intent, flags, startId);
}

@java.lang.Override
public void onClick(android.view.View v) {
    communicator.onDialogMessage("false");
    dismiss();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.util.Log.i(DBG_TAG, "OnCreate()");
    savedInstance_ = this;
    requestRuntimePermission();
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(DropTable);
    android.widget.Toast.makeText(context, "DB to Update", Toast.LENGTH_LONG).show();
    onCreate(db);
}

private void insertExamples(android.database.sqlite.SQLiteDatabase db) {
    db.beginTransaction();
    db.execSQL("insert into user (username,password ) values (\"yo mismo\",\"upcuo\"),(\"usuario369\",\"misuperpass\")");
    db.execSQL("insert into expense (exp_name,exp_amount,exp_paid) values(\"luz\",50,1),(\"agua\",60,1),(\"internet\",100,1),(\"otros gastos\",50,1),(\"modelo 130\",10,1)");
    db.execSQL("insert into purchase (pur_name,pur_strike) values(\"agua mineral\",0),(\"amor\",1),(\"chocolate\",0),(\"vino\",1),(\"un dragon de komodo\",1)");
    db.setTransactionSuccessful();
    db.endTransaction();
}

public static void showProfile(android.app.Fragment fragment, @android.support.annotation.Nullable
java.util.HashMap<java.lang.String, java.lang.String> extras) {
    com.airmap.airmapsdk.networking.services.AirMap.showProfile(fragment, com.airmap.airmapsdk.networking.services.AirMap.getUserId(), extras);
}

protected void selectSatisfied(android.view.View view) {
    sentimentIndex = 3;
    updateSentiments();
}

public void handleMessage(android.os.Message msg) {
    musiclist.setAdapter(((android.widget.ListAdapter) (new com.salt.saltmusic.Home.MusicListAdapter())));
}

@java.lang.Override
public void success(com.twitter.sdk.android.core.Result<com.twitter.sdk.android.core.TwitterSession> result) {
    handleSuccess(result);
}

@java.lang.Override
public void onBackPressed() {
    android.util.Log.i(TAG, "onBackPressed - start");
    savingModelInDb();
    setResult(com.modelingbrain.home.detailModel.RESULT_OK);
    super.onBackPressed();
    android.util.Log.i(TAG, "onBackPressed - finish");
}

public void bindType(nl.fhict.happynews.android.model.Post post) {
    this.post = post;
    if (nl.fhict.happynews.android.controller.ReadingHistoryController.getInstance().postIsRead(post)) {
        itemView.setAlpha(0.3F);
    }else {
        itemView.setAlpha(1.0F);
    }
}

public void setIsSelect(boolean selected) {
    android.util.Log.e("SELECTION", (selected + ""));
    if (selected)
        scaleAnimDrawable.expand(Gravity.START, ScaleAnimDrawable.AnimSide.BothSide);
    else
        scaleAnimDrawable.shrink(Gravity.START, ScaleAnimDrawable.AnimSide.BothSide);
    
}

@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
    menu.findItem(R.id.action_details).setVisible((!drawerOpen));
    return super.onPrepareOptionsMenu(menu);
}

@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    com.nexb.shopr4.FireBaseController.getI().setActiveShopListName(((android.widget.EditText) (v.findViewById(R.id.listNameEdit))).getText().toString());
    return false;
}

@java.lang.Override
public void onScroll(android.widget.AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
    if ((mVideoAd) != null) {
        mVideoAd.showAdIfItVisible(mCustomAdapter, mListView);
    }
}

@java.lang.Override
public void onNothingSelected(android.widget.AdapterView<?> parent) {
    if ((chosenManufacturer) == 0) {
        android.support.design.widget.Snackbar.make(spinnerManufacturer.getRootView(), "Please choose your camera Manufacturer", Snackbar.LENGTH_LONG).show();
    }
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    currentlyEditing = null;
    editingPosition = -1;
    doUnHighlighted(holder, comment, baseNode);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> view, android.view.View arg1, int arg2, long arg3) {
    locName = view.getSelectedItem().toString();
}

@java.lang.Override
public void onClick(android.view.View view) {
    io.intercom.android.sdk.Intercom.client().displayConversationsList();
}

@java.lang.Override
public void refreshData() {
    com.jwang.android.gymmate.task.media_task.RequestMediaByLocationId requestMediaByLocationId = new com.jwang.android.gymmate.task.media_task.RequestMediaByLocationId(getActivity());
    requestMediaByLocationId.execute(mLocationId, "");
}

public void update(com.google.android.gms.maps.Projection projection, com.google.android.gms.maps.model.CameraPosition cameraPosition) {
    scale = mapScaleModel.setProjection(projection, cameraPosition);
    invalidate();
}

public void setDrawable(android.graphics.drawable.Drawable drawable, io.doist.material.drawable.WrapperDrawable owner) {
    if ((mDrawable) != null) {
        mDrawable.setCallback(null);
    }
    mDrawable = drawable;
    mDrawable.setCallback(owner);
    mChildChangingConfigurations = mDrawable.getChangingConfigurations();
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    if (data.moveToFirst())
        mQuestionsAdapter.swapCursor(data);
    
}

public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
    return true;
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(android.content.ContentValues.TAG, drugClass);
    drugClassSearch(drugClass);
}

@java.lang.Override
public void onLocationChanged(android.location.Location loc) {
    if (null != loc) {
        setUserCurrentLocation(loc);
        plotRoute();
    }
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((clickListener) != null)
        clickListener.onClick(view, getAdapterPosition());
    
}

private void loadIcon(@android.support.annotation.NonNull
com.facebook.ads.NativeAd nativeAd) {
    if ((mIcon) == null)
        return ;
    
    com.mapswithme.util.UiUtils.show(mIcon);
    com.facebook.ads.NativeAd.Image icon = nativeAd.getAdIcon();
    com.facebook.ads.NativeAd.downloadAndDisplayImage(icon, mIcon);
}

public void showFragment(android.support.v4.app.Fragment fragment) {
    if (null != fragment) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.show(fragment);
    }
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.beginTransaction();
    com.czbix.v2ex.dao.NodeDAO.createTable(db);
    db.endTransaction();
}

@java.lang.Override
protected void onPause() {
    super.onPause();
    android.util.Log.i("Map - pause", "Map activity paused, location updates stopped");
    if (isSetup)
        stopLocationUpdates();
    
}

@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<com.example.kandoe.Model.Organisation>> call, java.lang.Throwable t) {
    java.lang.System.out.println(t.toString());
    android.widget.Toast.makeText(getActivity(), "FAIL ORGGGGGGGGG", Toast.LENGTH_LONG).show();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    initFab();
    initRecyclerView();
    inAlphabeticalOrder = android.preference.PreferenceManager.getDefaultSharedPreferences(this).getBoolean("alphabetic", true);
}

public void onClick(android.view.View buttonView) {
    android.content.Intent myIntent = new android.content.Intent(buttonView.getContext(), activity.ctec.jbur0473.selfintroduction.SchoolScreen.class);
    startActivityForResult(myIntent, 0);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    chatRoomID = getArguments().getString(umd.cmsc436.cmsc436finalproject.UsersChatRoomFragment.ARG_CHATROOM_ID);
    chatRoomNAME = getArguments().getString(umd.cmsc436.cmsc436finalproject.UsersChatRoomFragment.ARG_CHATROOM_NAME);
}

public android.os.Handler getDecryptingThreadHandler() {
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
    storageController.getStoredUser();
    getProfile();
}

private void attachPreDrawListener() {
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
    java.util.List<com.example.android.booklisting.Book> books = com.example.android.booklisting.QueryUtils.fetchBookData(mUrl);
    return books;
}

public void onLoadResource(android.webkit.WebView view, java.lang.String url) {
    log(("load resource - " + url));
}

@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new com.facebook.reactnative.androidsdk.FBSDKPackage(com.suta.MainApplication.mCallbackManager), new com.imagepicker.ImagePickerPackage());
}

@java.lang.Override
protected java.util.List<com.facebook.react.ReactPackage> getPackages() {
    return java.util.Arrays.<com.facebook.react.ReactPackage>asList(new com.facebook.react.shell.MainReactPackage(), new io.jchat.android.JMessageReactPackage(com.sample.application.MainApplication.SHUTDOWN_TOAST), new com.honaf.dialog.MyDialogPackage(), new com.horcrux.svg.SvgPackage(), new com.sample.application.ReactIMUIPackage());
}

public void onClick(android.view.View view) {
    (portions)--;
    portionQuantity.setText(java.lang.String.valueOf(portions));
}

public void replaceFragment(int fragmentContainerResId, android.support.v4.app.Fragment fragment) {
    ((android.support.v4.app.FragmentActivity) (activity)).getSupportFragmentManager().beginTransaction().replace(fragmentContainerResId, fragment).commit();
}

public static AlertDialog.Builder generateDialog(android.content.Context context, java.lang.String title, java.lang.String message) {
    return new android.support.v7.app.AlertDialog.Builder(context, R.style.DialogTheme).setTitle(title).setMessage(message);
}

@java.lang.Override
public void onClick(android.view.View v) {
    checkAnswer(true, getCurrentQuestion());
}

public void onRmsChanged(float rmsdB) {
    android.util.Log.d(uk.co.tstableford.p_brain.MainActivity.TAG, "onRmsChanged");
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivityForResult(new android.content.Intent(getActivity(), com.historicar.app.activity.InsertOrEditDriverActivity.class), Constants.REQUEST_FOR_CREATE_DRIVER);
}

@java.lang.Override
protected void onActivityResult(int aRequestCode, int aResultCode, android.content.Intent data) {
    am.te.myapplication.Model.Listing newListing = am.te.myapplication.Model.Listing.getListingFromIntent(data);
    products.add(newListing);
    arrayAdapter.notifyDataSetChanged();
}

@java.lang.Override
public void onClick(android.view.View view) {
    org.catrobat.catroid.ui.dialogs.NewVariableDialog dialog = new org.catrobat.catroid.ui.dialogs.NewVariableDialog();
    dialog.show(fragmentActivity.getSupportFragmentManager(), NewDataDialog.DIALOG_FRAGMENT_TAG);
}

@java.lang.Override
protected void onHandleIntent(android.content.Intent intent) {
    android.util.Log.i(LOG_TAG, "on handle intent");
    handleIntent(intent);
    startForeground(28373, buildForegroundNotification("Lankasri FM"));
}

public void restoreOriginalImage() {
    android.util.Log.d("PuzzleAdapter", ("Restoring image " + (this.imgId)));
    this.img = bitmapOriginalImage.copy(Bitmap.Config.ARGB_8888, true);
    isChanged = false;
}

public io.reactivex.Completable loadAsCompletable(final android.net.Uri sourceUri) {
    return loadAsCompletable(sourceUri, false);
}

@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    android.widget.Toast.makeText(mContext, "this", Toast.LENGTH_SHORT).show();
    thumbnail.setColorFilter(android.graphics.Color.argb(0, 0, 0, 0));
}

public void btnAdd(android.view.View v) {
    this.holdDataOne = java.lang.Double.parseDouble(display.getText().toString());
    display.setText("");
    this.sign = "+";
}

@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    pDialog = new android.app.ProgressDialog(getContext());
    pDialog.setMessage("Loading recent articles...");
    pDialog.setIndeterminate(false);
    pDialog.setCancelable(false);
    pDialog.show();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    int id = item.getItemId();
    switch (id) {
        case R.id.CaptureRawwithoutJpeg :
            com.yorku.mstew.camera2videoimage.SettingsActivity.CaptureRawwithJPEGBoolean = true;
            com.yorku.mstew.camera2videoimage.SettingsActivity.CaptureRawwithoutJPEGBoolean = false;
            break;
    }
    return true;
}

@java.lang.Override
public void onTick(long millisUntilFinished) {
    soundPool.setVolume(stream, volume, volume);
    volume = (volume) - (step);
    android.util.Log.d("1", ("volume = " + (volume)));
}

public void stopButtonAnimation() {
    android.view.animation.Animation anim = getAnimation();
    if (anim != null)
        clearAnimation();
    
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.util.Log.d("log works", "main");
}

public void done() {
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra("imageArray", mImageArray);
    setResult(com.fonsecakarsten.audiobooky.RESULT_OK, intent);
    finish();
}

public static int ifmt(java.lang.String tag, java.lang.String fmt, java.lang.Object... args) {
    if (tv.danmaku.ijk.media.player.pragma.DebugLog.ENABLE_INFO) {
        java.lang.String msg = java.lang.String.format(java.util.Locale.US, fmt, args);
        return android.util.Log.i(tag, msg);
    }
    return 0;
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.idonans.acommon.util.SystemUtil.hideStatusBar(getActivity().getWindow());
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent newProfile = new android.content.Intent(v.getContext(), com.github.joey.mansbestfriend.Profile.class);
    startActivityForResult(newProfile, 3);
    finish();
}

public void setTokenFromMain(java.lang.String token) {
    android.util.Log.d(starace.learn.com.musicfilter.Song.SongListFragment.TAG_SONG_FRAG, ("THE TOKEN IS SET FROM MAIN " + token));
    this.token = token;
    android.util.Log.d(starace.learn.com.musicfilter.Song.SongListFragment.TAG_SONG_FRAG, ("THE TOKEN IS SET FROM MAIN IN THE FRAGMENT " + token));
}

@java.lang.Override
public void run() {
    android.view.inputmethod.InputMethodManager inputManager = ((android.view.inputmethod.InputMethodManager) (this.getSystemService(Context.INPUT_METHOD_SERVICE)));
    inputManager.showSoftInput(mActivityPlanDetailBinding.etPlanTitle, 0);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle bundle) {
    icepick.Icepick.saveInstanceState(this, bundle);
}

@java.lang.Override
public io.geeteshk.hyper.adapter.ProjectAdapter.MyViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    java.util.Arrays.sort(mObjects);
    android.view.View itemView = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.item_project, parent, false);
    return new io.geeteshk.hyper.adapter.ProjectAdapter.MyViewHolder(itemView);
}

public com.android.volley.RequestQueue getRequestQueue() {
    if ((requestQueue) == null) {
        requestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.example.moreapp.App.getContext());
    }
    return requestQueue;
}

private void showSystemUI() {
    android.util.Log.d("BackEnd", "On method showSystemUI ");
    mDecorView.setSystemUiVisibility((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)));
}

public static android.content.Intent getIntent(android.content.Context context) {
    android.content.Intent intent = new android.content.Intent(context, com.singh.harsukh.redder.AccessActivity.class);
    return intent;
}

protected void bleServiceDiscovered(java.lang.String address) {
    android.content.Intent intent = new android.content.Intent(com.hypercryptic.bleware.BLEService.BLE_SERVICE_DISCOVERED);
    intent.putExtra(com.hypercryptic.bleware.BLEService.EXTRA_ADDR, address);
    sendBroadcast(intent);
    requestProcessed(address, RequestType.DISCOVER_SERVICE, true);
}

@java.lang.Override
public void onFailure(okhttp3.Call call, java.io.IOException e) {
    android.widget.Toast.makeText(getContext(), R.string.failed_performing_request, Toast.LENGTH_SHORT).show();
    ((com.watchtime.base.WatchTimeApplication) (getContext())).getDataChangeHandler().igniteListeners(OnDataChangeHandler.ALL);
}

@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d(com.lkworm.miniservice.MainActivity.TAG, "onPause");
    com.lkworm.miniservice.GPSTrackService.LogError(((com.lkworm.miniservice.MainActivity.TAG) + "onPause"));
}

private void setGrid() {
    layoutManager = new android.support.v7.widget.GridLayoutManager(activity, 2);
    recyclerView.setLayoutManager(layoutManager);
    com.rakesh.flickerproject.FlickerImageActivity.MyGridAdapter photoAdapter;
    photoAdapter = new com.rakesh.flickerproject.FlickerImageActivity.MyGridAdapter();
    recyclerView.setAdapter(photoAdapter);
}

@java.lang.Override
public void onClick(android.view.View v) {
    com.mobile.paolo.listaspesa.utility.GlobalValuesManager.getInstance(getContext()).saveIsUserCreatingShoppingList(true);
    showListCreationFragment();
}

public static void i(java.lang.String tag, java.lang.String msg) {
    if (android.text.TextUtils.isEmpty(msg)) {
        return ;
    }
    if (com.vinci.imageloader.core.util.MLog.DEBUG) {
        android.util.Log.i(tag, msg);
    }
}

private static java.lang.String getStringByFirstWord(java.lang.String firstWord) {
    java.lang.String ret = com.nanosic.stringup.DBController.getInstance(com.nanosic.stringup.StringGenerator.context).find(firstWord);
    android.util.Log.d(com.nanosic.stringup.StringGenerator.TAG, ("getStringByFirstWord: ret=" + ret));
    return ret;
}

public void attachToActivity(android.app.Activity activity, int slideStyle) {
    attachToActivity(activity, slideStyle, false);
}

@java.lang.Override
public void onClick(android.view.View v) {
    mFScreenEventCallback.setHolder(holder);
    mXibaListPlayUtil.startFullScreen(url, position, holder.container, eventCallback, mFScreenEventCallback);
    eventCallback.bindHolder(holder, position);
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (v.equals(register)) {
        startRegistration();
    }else
        if (v.equals(login)) {
        }
    
    startMenu();
}

@java.lang.Override
public void onUpdate(com.daimajia.swipe.SwipeLayout arg0, int arg1, int arg2) {
    android.util.Log.d("TimeFleeting", "onUpdate");
}

@java.lang.Override
protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
    v.getLayoutParams().height = (interpolatedTime == 1) ? LinearLayout.LayoutParams.WRAP_CONTENT : ((int) (targetHeight * interpolatedTime));
    v.requestLayout();
}

@java.lang.Override
public void adReceived(com.applovin.sdk.AppLovinAd ad) {
    lastAd = ad;
    notifySuccess(((android.app.Activity) (context)), mListener);
}

public static java.lang.String getStringFromSharedPreferences(java.lang.String basic, java.lang.String key) {
    android.content.SharedPreferences sharedPreferences = com.byteshaft.waterassist.Helpers.getPreferenceManager();
    return sharedPreferences.getString(key, "");
}

@java.lang.Override
protected void initToolBar(android.view.View root) {
    super.initToolBar(root);
    toolbar.setTitle(R.string.local_title);
}

@java.lang.Override
public void notifyDataSetChanged() {
    if (!((mBaseAdapter) instanceof android.widget.ArrayAdapter<?>))
        mBaseAdapter.notifyDataSetChanged();
    
}

public void onClick(android.content.DialogInterface dialog, int id) {
    finish();
    java.lang.System.exit(0);
}

@java.lang.Override
public void playDefaultNotificationSound() {
    com.jdndeveloper.lifereminders.phone.Phone.notification = android.media.RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
    com.jdndeveloper.lifereminders.phone.Phone.r = android.media.RingtoneManager.getRingtone(com.jdndeveloper.lifereminders.phone.Phone.context, com.jdndeveloper.lifereminders.phone.Phone.notification);
    com.jdndeveloper.lifereminders.phone.Phone.r.play();
    com.jdndeveloper.lifereminders.phone.Phone.r.stop();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.support.v4.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.ab_refresh :
            this.refresh(null);
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
    mAdapter = new me.li2.android.fiserv.smartmoney.ui.BankingOperationFragment.BankingOperationAdapter(getActivity(), createItems());
}

protected java.lang.CharSequence getStepDescription() {
    final android.widget.EditText editText = ((android.widget.EditText) (getView().findViewById(R.id.inputStepDescriptionView)));
    return editText.getText();
}

@java.lang.Override
public void onScrollingFinished(com.terrydr.pickerview.wheelview.WheelView wheel) {
    result = java.lang.String.valueOf(arrayWheelAdapter.getItemText(wheel.getCurrentItem()));
    android.util.Log.e(com.terrydr.pickerview.PickerView_Plugin_intent.TAG, ("scrollListenerResult:" + (result)));
}

@java.lang.Override
protected void setResource(android.graphics.Bitmap resource) {
    android.support.v4.graphics.drawable.RoundedBitmapDrawable drawable = android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory.create(context.getResources(), resource);
    drawable.setCircular(true);
    holder.sponsorimage.setImageDrawable(drawable);
}

public int getPlayBufferSize() {
    int minBufferSize = android.media.AudioTrack.getMinBufferSize(44100, AudioFormat.CHANNEL_OUT_MONO, AudioFormat.ENCODING_PCM_16BIT);
    return minBufferSize / 4;
}

