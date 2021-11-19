public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    ((android.preference.EditTextPreference) (preference)).setSummary(newValue.toString());
    return true;
}

@java.lang.Override
public boolean onPreferenceClick(android.preference.Preference preference) {
    android.content.Intent intent = new android.content.Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
    intent.addCategory(Intent.CATEGORY_DEFAULT);
    startActivityForResult(intent, sk.henrichg.phoneprofilesplus.PhoneProfilesPreferencesNestedFragment.RESULT_LOCATION_SYSTEM_SETTINGS);
    return false;
}

@java.lang.Override
public void onClick(android.view.View v) {
    rename(file);
    dismissQuickActions(actionMenu);
}

public android.net.Uri getImageUriFromPosition(int position) {
    return photoData[position].getImageUri();
}

public void enableSpinButton() {
    android.widget.ImageView spinButton = ((android.widget.ImageView) (getActivity().findViewById(R.id.logo_icono)));
    spinButton.setEnabled(true);
    dialer.setEnabled(false);
}

public android.net.wifi.WifiConfiguration getWifiApConfiguration() {
    try {
        wifiApConfigurationMethod.setAccessible(true);
        return ((android.net.wifi.WifiConfiguration) (wifiApConfigurationMethod.invoke(mWifiManager, null)));
    } catch (java.lang.Exception e) {
        return null;
    }
}

public void stopMainService(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, www.app.remindme.com.remindme.MainServices.class);
    stopService(intent);
}

public static java.lang.String getAllContent(java.lang.String content) {
    java.lang.String result = android.jiang.com.library.utils.HttpUtils.getXSSContent(content);
    return android.jiang.com.library.utils.HttpUtils.getContent(result);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putLong(com.tahutelorcommunity.bakingapp.ui.ExoPlayerFragment.POSITION_BUNDLE_KEY, mExoplayer.getCurrentPosition());
}

public static void insertChild(java.lang.String name, java.lang.String photo) {
    com.raizlabs.android.dbflow.sql.language.SQLite.insert(com.example.a1.projecttest.Entities.ChildEntity.class).columns("name", "photo", "selected").values(name, photo, View.GONE).execute();
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<java.util.ArrayList<com.example.oluwatimilehin.moviebuff.Movies>> loader) {
    movies.clear();
    loader.forceLoad();
}

@java.lang.Override
public void onHourSelected(int mHour) {
    hourSelected = mHour;
    hour.add(hourSelected);
    for (int hours : hour) {
        android.util.Log.i("Hours: ", java.lang.String.valueOf(hour));
    }
}

@java.lang.Override
public void showData(java.util.List<com.pratilipi.mobile.android.datafiles.Pratilipi> pratilipiList) {
    mRecentReadsAdapter.addItems(pratilipiList);
    hideProgressIndicator();
}

@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.select_picture :
            openGallery();
            return true;
        default :
            return super.onOptionsItemSelected(item);
    }
}

@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    initView(mView);
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    if (location != null) {
        updateLocation(location);
    }else {
        mListener.onLocationFailed();
    }
    LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
}

public void onRegistrationSuccess() {
    com.taibah.busservice.utils.Helpers.closeKeyboard(getActivity(), etDriverContactNumber.getWindowToken());
    android.widget.Toast.makeText(getActivity(), "Registration successful", Toast.LENGTH_SHORT).show();
    getActivity().onBackPressed();
}

public void setEpisodesWatched(int episodes_watched_value) {
    if ((episodes_watched) == null)
        episodes_watched = ((android.widget.TextView) (findViewById(R.id.episodes_watched)));
    
    episodes_watched.setText(episodes_watched_value);
}

public void onClick(android.content.DialogInterface dialog, int which) {
    dialog.dismiss();
    android.content.Intent i = new android.content.Intent(this, demo.kolorob.kolorobdemoversion.activity.PlaceChoiceActivity.class);
    startActivity(i);
    dialog.dismiss();
    finish();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_maintabs);
    super.onCreate(savedInstanceState);
    fragmentManager = getFragmentManager();
    setTabSelection(0);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    setContentView(R.layout.knapp_test);
}

@java.lang.Override
public void onbindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    com.stickheaderlayout.simple.RecyclerViewSimpleActivity.RecyclerAdapter.RecyclerItemViewHolder viewHolder = ((com.stickheaderlayout.simple.RecyclerViewSimpleActivity.RecyclerAdapter.RecyclerItemViewHolder) (holder));
    viewHolder.tvTitle.setText(mItemList.get((position - 1)));
}

@java.lang.Override
protected void onStop() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        mLocationManager.removeUpdates(this);
    }
    super.onStop();
}

private void showSystemControls() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
        getActivityView().setSystemUiVisibility((((android.view.View.SYSTEM_UI_FLAG_LAYOUT_STABLE) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)) | (android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)));
    }
}

private void closeConnection() {
    for (android.os.AsyncTask current : threadList) {
        if (current.isCancelled())
            current.cancel(true);
        
    }
    s.close();
    multicastLock.release();
}

public void setActivityContext(android.content.Context ctx) {
    mActivityContext = ctx;
    if ((mButler) == null) {
        mButler = new me.makeachoice.movies.controller.butler.MovieButler(mActivityContext, this);
    }
}

public com.danimahardhika.cafebar.CafeBar.Builder customView(@android.support.annotation.LayoutRes
int res) {
    mCustomView = android.view.View.inflate(mContext, res, null);
    return this;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    ((cunycodes.parkmatch.MapsActivity) (getActivity())).startPlacePickerActivity();
}

public void initToolbar() {
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    assert (getSupportActionBar()) != null;
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    task = new com.commonsware.android.constants.ConstantsBrowser.LoadCursorTask();
    task.execute();
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mPage = getArguments().getInt(com.nathanromike.yes_you_can.ui.GuideListFragment.ARG_PAGE);
    getGuides(Constants.ELECTRONIC);
}

@java.lang.Override
public void onNetworkDisconnected() {
    android.util.Log.e("Network", "Network DISSSSSS");
    android.widget.Toast.makeText(this, "Disconnected", Toast.LENGTH_SHORT).show();
}

private void bindViews() {
    mLayoutRoot = ((android.widget.RelativeLayout) (findViewById(R.id.gv_root)));
    mFragment = ((net.gini.android.vision.camera.CameraFragmentCompat) (getSupportFragmentManager().findFragmentById(R.id.gv_fragment_camera)));
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
}

public void run() {
    buttonStop.setEnabled(false);
    buttonUpload.setEnabled(false);
    buttonDownload.setEnabled(false);
    buttonRun.setEnabled(false);
    android.widget.Toast.makeText(this, "Begin Download", Toast.LENGTH_LONG).show();
}

public com.random.anim.RandomTextHelper.RandomSavedState createFromParcel(final android.os.Parcel in) {
    return new com.random.anim.RandomTextHelper.RandomSavedState(in);
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((mOnItemClickListener) != null) {
        int position = holder.getAdapterPosition();
        return mOnItemLongClickListener.onItemOnLongClick(v, mDataList.get(position), position);
    }
    return false;
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    io.fabric.sdk.android.Fabric.with(this, new com.crashlytics.android.Crashlytics());
    com.google.firebase.database.FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    com.example.gek.pizza.data.AllDishes.getInstance();
}

public void onDestroy() {
    request = null;
    super.onDestroy();
    android.util.Log.d("BugWithService:ServiceDestroy", "ServiceDestroy");
}

@java.lang.Override
public void onAlways(org.jdeferred.Promise.State state, org.json.JSONArray resolved, com.androidquery.callback.AjaxStatus rejected) {
    restore();
}

@java.lang.Override
public void onLoaderReset(android.support.v4.content.Loader<android.database.Cursor> loader) {
    android.util.Log.d("Ziolle", "onLoaderReset");
    mForecastAdapter.swapCursor(null);
}

@java.lang.Override
public byte[] getBody() throws com.android.volley.AuthFailureError {
    return bodyContent.getBytes();
}

@java.lang.Override
public void onClick(android.view.View view) {
    changeNavigationHeader(((android.widget.TextView) (findViewById(R.id.tvNavHeader))).getText().toString());
    popBackStack();
    if (shouldShowLogo()) {
        setUpInitStateOfMenu();
    }
}

@java.lang.Override
public int getItemCount() {
    return com.ngynstvn.android.blocspot.BlocspotApplication.getSharedDataSource().getCategoryList().size();
}

@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if (me.ccrama.redditslide.SettingValues.swap) {
        doOnClick(holder, comment, baseNode);
    }else {
        doLongClick(holder, comment, baseNode, finalPos, finalPos1);
    }
    return true;
}

@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    showProgress(false);
    android.widget.Toast.makeText(context, error.getMessage(), Toast.LENGTH_LONG).show();
    assignButton.setEnabled(true);
}

@java.lang.Override
public void onClick(android.view.View view) {
    nextopic.com.nextopic.UI.DatePickerFragment datePicker = new nextopic.com.nextopic.UI.DatePickerFragment();
    datePicker.show(getSupportFragmentManager(), ((TAG) + "2"));
}

private static android.content.Intent cloneIntent(android.content.Intent src) {
    return uk.co.ashtonbrsc.intentexplode.Explode.cloneIntent(uk.co.ashtonbrsc.intentexplode.Explode.getUri(src));
}

public void insertArtistCV(android.content.ContentValues values) {
    insertArtistCV(helper.getWritableDatabase(), values);
}

@java.lang.Override
public void run() {
    android.widget.Toast.makeText(C.getApplicationContext(), e.toString(), Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    if ((mListener) != null) {
        mProgressDialog.cancel();
        org.wordpress.android.analytics.AnalyticsTracker.track(AnalyticsTracker.Stat.LOGIN_MAGIC_LINK_REQUESTED);
        mListener.onMagicLinkSent();
    }
}

void uploadAttach(android.net.Uri uri) {
    int size = com.xfrocks.api.androiddemo.App.getFeatureAttachmentResize();
    if (size > 0) {
        attemptResize(uri, size);
    }else {
        uploadAttach(uri, uri.getPath(), null);
    }
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    android.util.Log.d(com.zhan.budget.Fragment.AccountFragment.TAG, "onCreate");
}

@java.lang.Override
public int getCount() {
    android.util.Log.d(Constant.TAG, ("mList.size:" + (mList.size())));
    return mList.size();
}

@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    android.widget.Toast.makeText(getBaseContext(), "Press once again to exit!", Toast.LENGTH_SHORT).show();
}

public static android.graphics.Bitmap getBitmapFromBlob(byte[] blob) {
    return android.graphics.BitmapFactory.decodeByteArray(blob, 0, blob.length);
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.d("MainActivity", "onresume called");
    new com.edsapps.weather.MainActivity.HttpAsyncTask(this, "Fetching forecast").execute();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent arg1) {
    if (com.tropicgame.data.HelperFactory.getObjectsHelper().getProfileOfShowHelper().getProfileOfShow().isBoxReboot())
        com.tropicgame.common.Utils.AutoStartShow(context);
    
}

public void onClick(android.view.View V) {
    hY.setTextSize((size -= 5));
}

@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.button :
            break;
        case R.id.send :
            byte[] message = "this is a test".getBytes();
            mChatService.write(message);
            break;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    zenTimer.cancel();
    viewFlipper.showNext();
    timePicker.setCurrentHour(0);
    timePicker.setCurrentMinute(0);
}

public byte[] getBody() {
    return android.util.Base64.decode(body, Base64.NO_WRAP);
}

@java.lang.Override
void setFont(final com.codename1.impl.android.CodenameOneTextPaint font) {
    super.setFont(font);
}

public void deleteIngredientMeasures(long id) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    db.delete(com.example.caitlin.cookhelper.database.DatabaseHandler.TABLE_INGREDIENT_MEASURES, ((com.example.caitlin.cookhelper.database.DatabaseHandler.KEY_INGREDIENT_MEASURE_RECIPE) + " =?"), new java.lang.String[]{ java.lang.String.valueOf(id) });
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ((com.standapp.common.BaseActionBarActivity) (getActivity())).inject(this);
}

@java.lang.Override
public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
    float progress = ((float) (valueAnimator.getAnimatedValue()));
    android.util.Log.e("angcyo", ("progress-->" + progress));
    updateClipPath(((clipStartRadius) + progress));
}

@android.support.annotation.Nullable
public java.lang.String getGender() {
    return (gender) == null ? "" : gender;
}

@java.lang.Override
public void onResume() {
    super.onResume();
    android.util.Log.e(getClass().toString(), "OnResume");
}

public static com.example.miljanrakita.shoppingapplication.Fragments.DialogFragments.AddProductDialogFragment getStartIntent(java.lang.String parentId) {
    com.example.miljanrakita.shoppingapplication.Fragments.DialogFragments.AddProductDialogFragment intent = new com.example.miljanrakita.shoppingapplication.Fragments.DialogFragments.AddProductDialogFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.example.miljanrakita.shoppingapplication.Util.Constants.ADD_PRODUCT_PARENT_ID_KEY, parentId);
    intent.setArguments(args);
    return intent;
}

@java.lang.Override
protected void onPrepareDialog(int id, android.app.Dialog dialog) {
    for (net.osmand.plus.activities.DialogProvider dp : dialogProviders) {
        dp.onPrepareDialog(id, dialog);
    }
}

@java.lang.Override
public void onLoadMore(int page, final int totalItemsCount, android.support.v7.widget.RecyclerView view) {
    mNetManager.downloadArticles(page, false, com.android.casopisinterfon.interfon.model.Category.getCategory(mFragPosition));
}

public void onTimeSet(android.widget.TimePicker view, int shour, int smin) {
    chosenHour = shour;
    chosenMinute = smin;
    chooseTime();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    org.bcss.collect.android.bcss_utilities.ToastUtils.showLongSafe("Site deletion is disabled");
    deleteSelectedSites();
    disableActionMode();
}

public void deleteItem(com.codepath.simpletodo.Item item) {
    com.codepath.simpletodo.Item deletedItem = com.raizlabs.android.dbflow.sql.language.SQLite.select().from(com.codepath.simpletodo.Item.class).where(Item_Table.id.eq(item.id)).querySingle();
    deletedItem.delete();
}

public void onClick(android.view.View v) {
    android.content.Intent intent = getIntent();
    intent.putExtra("page", v.getId());
    setResult(Activity.RESULT_OK, intent);
    finish();
}

private void saveRecord() {
    android.util.Log.d(com.han.will.pushup.view.PushUpFragment.TAG, ("saveRecord: mTimes = " + (mTimes)));
    mPushUpPresenter.saveRecord(mUid, mName, mTimes);
}

public void finishActivity(android.app.Activity activity) {
    if (activity != null) {
        de.mpg.mpdl.labcam.code.common.AppManager.activityStack.remove(activity);
        activity.finish();
        activity = null;
    }
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    switch (position) {
        case 0 :
            timeSig = 3;
            break;
        case 1 :
            timeSig = 4;
            break;
    }
}

public void start_voicecall(java.lang.Boolean SS) {
    android.content.Intent intent = new android.content.Intent(this, com.rm.flashinglight.Text_to_speech.class);
    if (SS) {
        this.startService(intent);
    }else {
        this.stopService(intent);
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.verizon.mvyas.verizonproject.TagListActivity.LoadDataTask().execute(context);
    adapter.resetSelectedTags();
}

@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v7.app.AlertDialog.Builder number_of_tries_help_dialog_builder = new android.support.v7.app.AlertDialog.Builder(getActivity());
    number_of_tries_help_dialog_builder.setMessage(R.string.circular_floating_action_menu_mit_license).create().show();
}

@java.lang.Override
protected void onRestart() {
    android.app.Fragment frag = getFragmentManager().findFragmentByTag("services");
    if (frag != null) {
        getFragmentManager().beginTransaction().remove(frag).commit();
    }
}

public final void destroy() {
    animViewList.clear();
    animDisposable.dispose();
    animDisposable = null;
    animObservableList.clear();
    prevScrollEvent = tech.thdev.androidrecyclerview.view.scroll.anim.OnRecyclerScrollListener.SCROLL_NONE;
}

@java.lang.Override
public void protocolDidReceivePinMode(int pin, int mode) {
    android.util.Log.e(TAG, ((("protocolDidReceivePinMode - pin: " + pin) + "\tmode: ") + mode));
}

@java.lang.Override
public void onLocationChanged(android.location.Location location) {
    mMap.clear();
    showLocation(location);
}

@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int i, boolean b) {
    if (((mediaPlayer) != null) && b) {
        mediaPlayer.seekTo(i);
        pauseLength = mediaPlayer.getCurrentPosition();
    }
}

public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mListener) != null) {
        assignAllValuesToCalendar();
        mListener.onPositiveButtonClick(dateTimeCalendar.getTime());
    }
}

public void drawBackground(android.graphics.Canvas canvas) {
    if ((mAmbient) && ((!(mLowBitAmbient)) || (mBurnInProtection))) {
        canvas.drawColor(Color.BLACK);
    }else {
        canvas.drawColor(mCenterCircleColor);
    }
}

private void gotoMainScreen() {
    progressDialog.hide();
    getActivity().startActivity(new android.content.Intent(getContext(), com.sven.ou.module.lol.activities.MainViewActivity.class));
    getActivity().finish();
}

@java.lang.Override
public void onLoadFinished(android.support.v4.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    mBeerListAdapter.swapCursor(data);
    if ((mPosition) != (android.widget.ListView.INVALID_POSITION)) {
        mBeerListView.smoothScrollToPosition(mPosition);
    }
    loadingMore = false;
    mBeers = "Check out all these awesome beers that I found on this cool new app, BREWSKI.";
}

@java.lang.Override
public void onClick(android.view.View v) {
    pickNewSong();
    Globals.playlistArray.add(new angelhack.seattle.soundhop.SongItem(angelhack.seattle.soundhop.MainActivityFragment.generateID(), angelhack.seattle.soundhop.MainActivityFragment.generateID(), 500));
    angelhack.seattle.soundhop.MainActivityFragment.playlistAdapter.notifyDataSetChanged();
}

public int getVersionCode() {
    int versionCode = 0;
    android.content.pm.PackageInfo info = getPackageInfo();
    if (info != null) {
        versionCode = info.versionCode;
    }
    return versionCode;
}

public com.sbxcloud.android.sbxcloudsdk.query.SbxQueryBuilder filterWhereIsEqual(java.lang.String field, java.lang.Object value) throws java.lang.Exception {
    this.find.setReferenceJoin(com.sbxcloud.android.sbxcloudsdk.query.SbxQueryBuilder.OP.EQ, this.field, this.referenceField, this.referenceModel, value);
    return this.find;
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(edu.gatech.cs2340.willcode4money.shoppingwithfriends.databases.DatabaseStrings.ReportStrings.CREATE_TABLE);
}

@java.lang.Override
public void onLocationStoppedSeeking() {
    android.widget.Toast.makeText(mActivity, "Tracking stopped", Toast.LENGTH_SHORT).show();
    android.util.Log.d("LOCATION", "Tracking stopped");
    com.unity3d.player.UnityPlayer.UnitySendMessage("LOCATIONCHECKER", "OnLocationStoppedSeeking", "");
}

@java.lang.Override
public java.lang.Boolean call(com.google.gson.JsonObject jsonObject) {
    android.util.Log.d("sfparks parksModule", "about to filter 1");
    return !((jsonObject == null) || ((jsonObject.get(com.sfparks.model.ParksModule.LOCATION_1)) == null));
}

@java.lang.Override
public void onClickItem(android.view.View v, int position) {
    android.content.Intent intent = new android.content.Intent(this, com.abyx.loyalty.activities.CardActivity.class);
    intent.putExtra(Constants.INTENT_CARD_ID_ARG, originalData.get(position).getID());
    startActivity(intent);
}

@java.lang.Override
public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener newOnDoubleTapListener) {
    if (newOnDoubleTapListener != null)
        this.mGestureDetector.setOnDoubleTapListener(newOnDoubleTapListener);
    else
        this.mGestureDetector.setOnDoubleTapListener(new io.togoto.imagezoomcrop.photoview.DefaultOnDoubleTapListener(this));
    
}

public static com.tomeokin.lspush.common.SMSCaptchaUtils init(android.content.Context context, java.lang.String smsId, java.lang.String smsKey) {
    if ((com.tomeokin.lspush.common.SMSCaptchaUtils.sInstance) == null) {
        com.tomeokin.lspush.common.SMSCaptchaUtils.sInstance = new com.tomeokin.lspush.common.SMSCaptchaUtils(context, smsId, smsKey);
    }
    return com.tomeokin.lspush.common.SMSCaptchaUtils.sInstance;
}

