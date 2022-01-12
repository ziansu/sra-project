public final void remove(@android.support.annotation.NonNull
final T item) {
    mList.remove(item);
    notifyItemRemovedSafe(mList.indexOf(item));
}

public static boolean positionChanged(com.google.android.gms.maps.model.LatLng newPosition, com.google.android.gms.maps.model.LatLng oldPosition) {
    return (oldPosition == null) && ((com.barrybecker4.mapland.game.LocationUtil.distance(newPosition, oldPosition)) > (com.barrybecker4.mapland.game.LocationUtil.TOLERANCE));
}

@java.lang.Override
public void onClick(android.view.View v) {
    db.create(undo);
    a.dismiss();
    rv.setAdapter(new com.rpfsoftwares.rollapass.RVAdapter(db.read(), rv));
    db.closeDB();
}

@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((currentTime) == (song.getSongDuration())) {
        nextSong();
    }else {
        seekTo(currentTime);
    }
    updateSeekbar();
}

@java.lang.Override
public boolean onScaleBegin(android.view.ScaleGestureDetector detector) {
    swipeRefreshLayout.setEnabled(false);
    mediaAdapter.setOnClickListener(null);
    mediaAdapter.setOnLongClickListener(null);
    return super.onScaleBegin(detector);
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        workoutId = savedInstanceState.getLong("workoutId");
    }
    return inflater.inflate(R.layout.fragment_workout_detail, container, false);
}

@java.lang.Override
public void updateView(@android.support.annotation.NonNull
ahsan.io.farmleaddemo.model.Offer_ offer) {
    offer.getGrainDetailsJson();
    mGrainsView.updateView(offer.getGrainDetailsJson());
}

private void setTextString(android.widget.TextView textView, java.lang.String textString) {
    if (!(android.text.TextUtils.isEmpty(textString))) {
        textView.setText(textString);
        textView.setVisibility(com.allen.library.VISIBLE);
    }
}

@java.lang.Override
public void onResumeFragment() {
    if ((user) != null) {
        android.util.Log.d("Test", "UserRatingsFragment.onResumeFragment()");
        ratingService.loadUserRatings(this, user.getUserId());
    }
}

@java.lang.Override
protected void onPostExecute(org.jinstagram.auth.model.Token accessToken) {
    android.util.Log.v(com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.TAG, "igLogin's onPostExecute() called");
    com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.instagram = new org.jinstagram.Instagram(accessToken);
    android.util.Log.v(com.ngynstvn.android.blocparty.ui.fragment.LoginFragment.TAG, "WHAT ABOUT NOW??!!!");
    authoritative.onSuccess();
}

public static boolean isPackageInstalled(android.content.Context context, java.lang.String packageName) {
    try {
        context.getPackageManager().getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
        return true;
    } catch (android.content.pm.PackageManager e) {
        return false;
    }
}

@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    com.creativelighting.wificontrolfreak.Comms.WHEEL_COLOUR = colourWheel.getColourNoAmber();
    com.creativelighting.wificontrolfreak.Comms.AMBER_COLOUR = android.graphics.Color.red(colourWheel.getAmber());
    com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.setMotionEventActions(motionEvent, com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.RGB, view);
    return false;
}

@java.lang.Override
protected void onPostCreate(android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    drawerToggle.setHomeAsUpIndicator(R.drawable.ic_drawer);
    drawerToggle.syncState();
}

@java.lang.Override
public void onClick(android.view.View v) {
    startActivity(jzyu.github.photogallery.PhotoGalleryActivity.newIntent(this, jzyu.github.sample.gallery.MainActivity.sUrls));
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        android.util.Log.v("prachi", "onCheckedChanged FundDetails");
        DivasbleFundOption();
    }else {
        android.util.Log.v("prachi", "Else onCheckedChanged FundDetails");
        EnableFundOption();
    }
}

@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    if (savedInstanceState != null) {
        currentUser.setVolID(savedInstanceState.getLong(com.mattbozelka.cleanupstars.LoginFragment.USERID));
    }
    super.onActivityCreated(savedInstanceState);
}

public static dalbers.com.noise.LoopMediaPlayer create(android.content.Context context) {
    dalbers.com.noise.LoopMediaPlayer looper = new dalbers.com.noise.LoopMediaPlayer(context);
    return looper;
}

@java.lang.Override
public void onClick(android.view.View v) {
    new com.keshavg.reddit.CommentsAdapter.FetchComments(viewHolder, commentsAdapter, moreRepliesId).execute((((url) + "/") + (moreRepliesId.get(0))));
}

@java.lang.Override
public void onClick(android.view.View view) {
    addFooterView(mLoadingView);
    mLoadMoreListener.onLoadMore(true);
}

private void connectionLost(android.bluetooth.BluetoothDevice device) {
    mHandler.obtainMessage(MainActivity.MESSAGE_DEVICE_DISCONNECTED, device).sendToTarget();
    this.start();
}

public void setSurvivalGuide(org.esn.mobilit.models.SurvivalGuide survivalGuide) {
    android.util.Log.d(org.esn.mobilit.fragments.MyFragmentPagerAdapter.class.getSimpleName(), ("SurvivalGuide categories count : " + (survivalGuide.getCategories().size())));
    this.survivalGuide = survivalGuide;
}

@java.lang.Override
public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    android.util.Log.d(edu.iiitd.dynamikpass.RegistrationPanel.TAG, "Surface is being destroyed");
    boolean retry = true;
    android.util.Log.d(edu.iiitd.dynamikpass.RegistrationPanel.TAG, "Thread was shut down cleanly");
}

@java.lang.Override
public void onFailure(retrofit2.Call<valet.intan.com.valetparking.domain.AuthResponse.MetaContainer> call, java.lang.Throwable t) {
    forceLogout(token);
    android.util.Log.d(valet.intan.com.valetparking.service.RefreshTokenService.TAG, ("onFailure: refresh token failure occured: " + (t.getMessage())));
    loggingUtils.logRefreshTokenError(t.getMessage());
}

public void decrement(android.view.View view) {
    quantity = (quantity) - 1;
    display(quantity);
    displayPrice(((quantity) * 5));
}

public static void reboot(final android.content.Context context, java.lang.String reason, boolean confirm) {
    com.android.server.power.ShutdownThread.mReboot = true;
    com.android.server.power.ShutdownThread.mRebootSafeMode = false;
    com.android.server.power.ShutdownThread.mRebootHasProgressBar = false;
    com.android.server.power.ShutdownThread.mReason = reason;
    mRebootUpdate = false;
    com.android.server.power.ShutdownThread.mRebootAdvMode = false;
    com.android.server.power.ShutdownThread.shutdownInner(context, confirm);
}

@java.lang.Override
public void onDestroyView() {
    android.util.Log.i(null, "MainFragment destroyed");
    super.onDestroyView();
    butterknife.ButterKnife.unbind(this);
}

@java.lang.Override
public void onPause() {
    super.onPause();
    android.util.Log.d(com.vpaliy.melophile.playback.PlaybackManager.TAG, "onPlay");
    handlePauseRequest();
}

private in.ac.iitb.cse.carts.safestreet.model.Acceleration getSmoothenedAcceleration(in.ac.iitb.cse.carts.safestreet.model.Acceleration reorientedAcc) {
    smoothDataQueue.add(reorientedAcc);
    in.ac.iitb.cse.carts.safestreet.model.Acceleration ret = smoothDataQueue.getMean();
    android.util.Log.i(TAG, ("getSmoothenedAcceleration: ret " + ret));
    return ret;
}

@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    android.util.Log.d(com.lapism.searchview.SearchAnimator.LOG_TAG, "fadeOpen() - onAnimationStart() callback invoked.");
    android.util.Log.d(com.lapism.searchview.SearchAnimator.LOG_TAG, java.lang.String.format("fadeOpen() - is OnOpenCloseListener set? %s", (listener != null)));
    if (listener != null) {
        listener.onOpen();
    }
}

private final org.bbqapp.android.auth.AuthCallback unsetCallback() {
    org.bbqapp.android.auth.AuthCallback cb = authCallback;
    authCallback = null;
    return cb;
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    rootView = inflater.inflate(R.layout.fragment_map, container);
    return rootView;
}

@java.lang.Override
public void didDisplayAd(com.rfm.sdk.RFMAdView arg0) {
    if (com.rfm.util.RFMLog.canLogVerbose()) {
        android.util.Log.v(com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.LOG_TAG, " Into didDisplayAd ");
    }
    com.rfm.extras.adapters.RFMAdmobInterstitialAdapter.rfmAdView.displayAd();
}

public void onLoaderReset(android.content.Loader<android.database.Cursor> arg0) {
    householdDialog.dismiss();
    householdDialog = null;
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main1);
    if (savedInstanceState == null)
        com.example.slava.lenta2.MainPresenter.createPresenter(getFragmentManager(), this);
    
    init();
}

public java.lang.String getPassengerString(android.content.Context context) {
    android.content.res.Resources res = context.getResources();
    java.lang.String passengers = res.getQuantityString(R.plurals.numberOfPassengers, this.getPassengerNumber(), this.getPassengerNumber());
    return passengers;
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (!(wizardPropertiesExpDateEditText.getText().toString().equals("None"))) {
        wizardPropertiesExpDateEditText.setText("");
        wizardPropertiesEraseDateButton.setVisibility(View.GONE);
    }
}

boolean setStatusBarColor(int color) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.KITKAT))
        return false;
    
    android.view.Window w = getWindow();
    w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
    w.setStatusBarColor(color);
    return true;
}

public static java.lang.Object readObject(android.content.Context context, java.lang.String key) throws java.io.IOException, java.lang.ClassNotFoundException {
    java.io.FileInputStream fis = context.openFileInput(key);
    java.io.ObjectInputStream ois = new java.io.ObjectInputStream(fis);
    java.lang.Object object = ois.readObject();
    return object;
}

void stopMultiAdvertising(com.android.bluetooth.gatt.AdvertiseClient client) {
    enforceAdminPermission();
    mAdvertiseManager.stopAdvertising(client);
}

@java.lang.Override
public int getWaypointsIndex() {
    last_heartbeat.set(java.lang.System.currentTimeMillis());
    android.util.Log.i(com.platypus.android.server.VehicleServerImpl.TAG, java.lang.String.format("Current waypoint index = %d", current_waypoint_index));
    return current_waypoint_index.get();
}

public void saveCounter() {
    android.preference.PreferenceManager.getDefaultSharedPreferences(getContext()).edit().putInt("counter", tracker.getCount()).apply();
    android.util.Log.d("Sharedpref", "Saved to sharedpref");
}

public static boolean hideAds(android.content.Context context) {
    return !(android.preference.PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(R.string.pref_ads), false));
}

public static boolean isSelf(final org.justcards.android.models.User user, final android.content.Context context) {
    return user == (org.justcards.android.models.User.getCurrentUser(context));
}

public void addActionToQueue(@android.support.annotation.NonNull
ua.jenshensoft.cardslayout.views.updater.callback.ViewUpdaterQueueAction params) {
    addActionToQueue(params, true);
    addActionToQueue(params, true);
}

void setAlarmForNextNamaz(android.content.Context context) {
    java.lang.System.out.println("I am getting called, again and again");
    final int ONE_SECOND = 1000;
    final int ONE_MINUTE = ONE_SECOND * 60;
    final int TEN_MINUTES = ONE_MINUTE * 10;
    mHelpers = new com.byteshaft.namaztime.Helpers(context);
    settingAlarm(context, TEN_MINUTES);
}

private void selectPos(int pos) {
    if ((checkMode) == (com.nononsenseapps.notepad.NotesListFragment.CHECK_SINGLE_FUTURE)) {
        setSingleCheck(pos);
    }
    android.util.Log.d(com.nononsenseapps.notepad.NotesListFragment.TAG, ("selectPos: " + pos));
    getListView().setItemChecked(pos, true);
}

@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    callbackManager.onActivityResult(requestCode, resultCode, data);
}

public void setPaths(java.util.List<java.lang.String> paths) {
    this.paths = paths;
    views = new android.util.SparseArray(paths.size());
}

@java.lang.Override
public void onClick(android.view.View v) {
    org.unpidf.univmobile.ui.activities.HomeActivity a = ((org.unpidf.univmobile.ui.activities.HomeActivity) (getActivity()));
    a.showFragment(new org.unpidf.univmobile.ui.fragments.UniversityNewsFragment(), org.unpidf.univmobile.ui.fragments.UniversityNewsFragment.class.getName(), true);
}

@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    android.widget.Toast.makeText(view.getContext(), ("Long clicked position: " + i), Toast.LENGTH_SHORT).show();
    return true;
}

@java.lang.Override
public void onError(int status, java.lang.String error) {
    super.onError(status, error);
    android.util.Log.d(com.ningso.silence.PluginDexManager.TAG, "plugin download error");
    sendBroadcastToAnalytics(com.ningso.silence.PluginDexManager.DOWNLOAD_ERROR, adBean.getPkgName(), 1, error);
}

@java.lang.Override
protected android.os.Parcelable onSaveInstanceState() {
    com.rd.PositionSavedState positionSavedState = new com.rd.PositionSavedState(super.onSaveInstanceState());
    positionSavedState.setSelectedPosition(selectedPosition);
    positionSavedState.setSelectingPosition(selectingPosition);
    positionSavedState.setLastSelectedPosition(lastSelectedPosition);
    return positionSavedState;
}

@java.lang.Override
public void onRestoreInstanceState(final android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    gameState.onRestoreInstanceState(savedInstanceState);
}

@java.lang.Override
public void close() {
    try {
        conn.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
    org.dbtools.android.domain.database.DatabaseWrapperUtil.closeStatements(insertStatementMap);
    org.dbtools.android.domain.database.DatabaseWrapperUtil.closeStatements(updateStatementMap);
}

@java.lang.Override
public boolean onPreferenceChange(android.preference.Preference preference, java.lang.Object newValue) {
    int position = (java.lang.Integer.parseInt(newValue.toString())) - 1;
    preference.setSummary(arrayValues[position]);
    return false;
}

@java.lang.Override
public void run() {
    android.content.Intent i = new android.content.Intent(this, com.example.zakiya.greenr.MainActivity.class);
    startActivity(i);
    finish();
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    switch (which) {
        case android.content.DialogInterface.BUTTON_POSITIVE :
            removeOverlayFromMap(overlay);
            break;
        case android.content.DialogInterface.BUTTON_NEGATIVE :
            break;
    }
}

@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.util.Log.d(getClass().toString(), "Failed to fetch reviews");
    reviewTextView.setText(getResources().getString(R.string.no_reviews));
}

private synchronized void addInsert(android.content.ContentValues insert) {
    mDataInsertList.add(insert);
    if ((mDataInsertList.size()) > (org.tvbrowser.tvbrowser.TvDataUpdateService.TABLE_OPERATION_MIN_SIZE)) {
        insert(mDataInsertList);
    }
}

@java.lang.Override
public void onConfigured(android.hardware.camera2.CameraCaptureSession session) {
    if ((mSurface) != null) {
        mSession = session;
        postUpdateFlashlight();
    }
}

private void deleteUrlUserPasswdUnwrapped() throws android.database.sqlite.SQLiteException {
    java.lang.String sql = "DELETE FROM connect";
    com.khallware.apis.Datastore.logger.debug(("sql: " + sql));
    handle().execSQL(sql);
    setTagUnwrapped(1);
}

@java.lang.Override
protected void onStop() {
    super.onStop();
    android.view.Menu mMenu = mNavigationView.getMenu();
    android.view.MenuItem home = mMenu.findItem(R.id.nav_home);
    if (home.isChecked()) {
        it.uniba.di.ivu.sms16.gruppo3.fasterfood.HomeActivity.STARTED = false;
    }
}

@java.lang.Override
public void onClick(android.view.View v) {
    mAdapterCallback.onItemClick(getAdapterPosition());
    android.util.Log.d("Viewholder ", "clicked");
}

@java.lang.Override
public void sendStickyBroadcast(final android.content.Intent intent) {
    mCondom.proceedBroadcast(intent, new com.oasisfeng.condom.CondomCore.WrappedProcedure() {
        @java.lang.Override
        public void run(final android.content.Intent intent) {
            com.oasisfeng.condom.CondomContext.super.sendStickyBroadcast(intent);
        }
    });
}

public void getLocation() {
    android.widget.Toast.makeText(this, ("got the tracking id" + (trackingId)), Toast.LENGTH_LONG).show();
}

@com.taobao.weex.ui.component.WXComponentProp(name = Constants.Value.TEXT)
public void setTextValue(java.lang.String text) {
    ((android.widget.TextView) (mHost)).setText(text);
}

@java.lang.Override
public void onOffsetChanged(android.support.design.widget.AppBarLayout appBarLayout, int verticalOffset) {
    floatingSearchView.setTranslationY(verticalOffset);
    mMediaRouteButton.setTranslationY(verticalOffset);
}

protected void bringToFront() {
    android.view.ViewParent parent = _layout.getParent();
    parent.bringChildToFront(_layout);
    parent.requestLayout();
}

@java.lang.Override
protected java.util.Iterator<T> reverseIterator() {
    return new br.com.zbra.androidlinq.ArrayStream.ArrayIterator<>(source, ((source.length) - 1), (-1), (-1));
}

@java.lang.Override
public void onActivityPaused(android.app.Activity activity) {
    if (activity != (mActivity)) {
        return ;
    }
    com.rust.webvr.OVRService.nativeOnPause(mPtr);
}

@java.lang.Override
public void onClick(android.view.View view) {
    if ((count) == 0) {
        sendMessage("off");
        count = 1;
    }else {
        count = 1;
        sendMessage("on");
    }
}

@java.lang.Override
public self.edu.blueaproncodechallenge.ForecastAdaptor.ForecastViewHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.view_forecast_cell, null);
    self.edu.blueaproncodechallenge.ForecastAdaptor.ForecastViewHolder holder = new self.edu.blueaproncodechallenge.ForecastAdaptor.ForecastViewHolder(view);
    return holder;
}

@java.lang.Override
public void onActivityResult(int reqCode, int resCode, android.content.Intent intent) {
    command.success();
}

@rxbus.ecaray.com.rxbuslib.rxbus.RxBusReact(clazz = { java.lang.String.class , java.lang.Integer.class })
public void showContent4(java.lang.String content, int i) {
    android.util.Log.d("tagutil", ("收到的参数: " + content));
}

@java.lang.Override
public android.os.Parcelable onSaveInstanceState() {
    android.os.Parcelable superState = super.onSaveInstanceState();
    at.searles.fractview.ui.ScaleableImageView.ViewState vs = new at.searles.fractview.ui.ScaleableImageView.ViewState(superState);
    vs.showGrid = this.showGrid;
    vs.rotationLock = rotationLock;
    return vs;
}

@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    pageNumber = getArguments().getInt(ru.spbau.mit.antonpp.deepshot.fragment.HelpPageFragment.PageFragment.ARGUMENT_PAGE_NUMBER);
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    recoverChildView();
    this.setVisibility(com.brucetoo.pinterestview.GONE);
}

@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long l) {
    if ((asyncGetTaskes) == null) {
        asyncGetTaskes = new com.example.doctorsbuilding.nav.DialogAddTurn.asyncCallGetTaskes();
        asyncGetTaskes.execute();
    }
}

@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    android.util.Log.e("ListView", "OnTouch");
    return false;
}

public static android.content.Context getContext() {
    if ((de.weightlifting.app.WeightliftingApp.mContext) == null)
        de.weightlifting.app.WeightliftingApp.mContext = de.weightlifting.app.WeightliftingApp.getContext();
    
    return de.weightlifting.app.WeightliftingApp.mContext;
}

public void restartService() {
    android.content.Intent intent = new android.content.Intent(getApplication(), pl.dom133.dzwonek.Notification_Service.class);
    intent.setAction("ACTION_STOP");
    startService(intent);
    startService(new android.content.Intent(getApplication(), pl.dom133.dzwonek.Notification_Service.class));
}

public void removeAsync(final java.lang.String url) {
    new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
        @java.lang.Override
        protected java.lang.Void doInBackground(java.lang.Void... voids) {
            org.gdg.frisbee.android.cache.ModelCache.this.remove(url);
            return null;
        }
    }.execute();
}

public com.danimahardhika.cafebar.CafeBar.Builder content(@android.support.annotation.StringRes
int res) {
    mContent = mContext.getResources().getString(res);
    return this;
}

private void setFieldEnabled(android.view.View view, boolean b, int betdetails_name) {
    android.widget.TextView name = ((android.widget.TextView) (view.findViewById(R.id.betdetails_name)));
    name.setEnabled(b);
}

@java.lang.Override
public void onClick(android.view.View view) {
    registerForContextMenu(view);
    getActivity().openContextMenu(view);
}

public void open() throws android.database.SQLException {
    if (((database) == null) || (!(database.isOpen()))) {
        database = db_helper.getWritableDatabase();
    }
}

public android.database.Cursor getAllPeople() {
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = db.query(Person.TABLE_NAME, null, null, null, null, null, ((Person.COL_NAME) + " ASC"));
    return cursor;
}

@java.lang.Override
protected void onPreExecute() {
    userClassControl = fga.mds.gpp.trezentos.Controller.UserClassControl.getInstance(com.facebook.FacebookSdk.getApplicationContext());
    android.content.SharedPreferences session = android.preference.PreferenceManager.getDefaultSharedPreferences(classFragment.getActivity());
    email = session.getString("userEmail", "");
}

@java.lang.Override
public boolean visitBinaryExpressionWithType(com.android.tools.klint.checks.UBinaryExpressionWithType node) {
    if (org.jetbrains.uast.util.UastExpressionUtils.isTypeCast(node)) {
        visitTypeCastExpression(node);
    }
    return super.visitBinaryExpressionWithType(node);
}

@java.lang.Override
public void onResponse(retrofit.Response<com.fatel.mamtv1.Model.StatusDescription> response, retrofit.Retrofit retrofit) {
    android.widget.Toast.makeText(getApplicationContext(), "อัปเดตข้อมูลไปยังเซิร์ฟเวอร์สำเร็จ", Toast.LENGTH_SHORT).show();
}

private void restartLoader() {
    android.util.Log.v(LOG_TAG, "restarting loader");
    getSupportLoaderManager().restartLoader(LOCATION_LOADER_ID, null, this);
}

private void setPhotoFromLibrary() {
    android.content.Intent intent = new android.content.Intent(android.content.Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    intent.setType("image/*");
    startActivityForResult(android.content.Intent.createChooser(intent, "Select File"), SELECT_FILE);
}

@java.lang.Override
public void onStartTrackingTouch(android.widget.SeekBar seekBar) {
    mediaPlayerPosition = seekBar.getThumbOffset();
    manageMediaPlayer(com.podraza.android.spotifystreamer.NowPlayingActivityFragment.ACTION_SEEK);
}

protected void clearStepDescriptionField() {
    final android.widget.EditText editText = ((android.widget.EditText) (getView().findViewById(R.id.inputStepDescriptionView)));
    editText.getText().clear();
}

@java.lang.Override
public void onSuccess() {
    android.util.Log.d("LoyalUtil", "picasso on success");
    callback.run();
}

@java.lang.Override
protected void handleLongClick() {
    if (!(mAdvancedMode)) {
        mHost.startSettingsActivity(com.android.systemui.qs.tiles.RotationLockTile.DISPLAY_SETTINGS);
    }else {
        mHost.startSettingsActivity(com.android.systemui.qs.tiles.RotationLockTile.DISPLAY_ROTATION_SETTINGS);
    }
}

public android.location.Location goToNextWaypoint() {
    previous = current;
    current = pointQueue.remove();
    return current;
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    flashlight.turnOff();
    destroyCamera();
    finish();
}

@org.androidannotations.annotations.AfterViews
void init() {
    if (com.orion.alixk.contacts.frontend.ContactListActivity.contacts.isEmpty()) {
        contactServiceRequest.establishConnection();
    }else {
        populateContactsList(com.orion.alixk.contacts.frontend.ContactListActivity.contacts);
    }
}

private java.lang.String getTitleString() {
    return ((android.widget.TextView) (findViewById(R.id.titleText))).toString();
}

