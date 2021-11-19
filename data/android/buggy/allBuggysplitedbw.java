@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    if (isTablet) {
        loadDetailFragmentWith("");
    }
}

public void log(java.lang.String message) {
    android.util.Log.d(digicrafts.extensions.AdvertisingContext.TAG, message);
    dispatchStatusEventAsync("LOGGING", message);
}

@java.lang.Override
public boolean onTouchEvent(android.view.MotionEvent event) {
    show(com.wb.nextgen.widget.CustomMediaController.sDefaultTimeout);
    return true;
}

@java.lang.Override
public void onStop() {
    super.onStop();
    android.util.Log.w("STATE 4", "ONSTOP");
    com.example.yunita.reflexsimulator.ReactionTimer.isDismiss = false;
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putParcelableArrayList(abhi.com.popularmovies.ui.fragment.MovieListFragment.MOVIESTATE, new java.util.ArrayList<android.os.Parcelable>(moviesGridAdapter.getItems()));
    super.onSaveInstanceState(outState);
}

public void onSend() {
    android.content.Intent dmIntent = new android.content.Intent(YYCommand.ANSWER_MACHINE_GDMS);
    dmIntent.putExtra("data", "2");
    main_activity.sendBroadcast(dmIntent);
    android.util.Log.v("cconn", "requestOutgoingIsUseDefaultMessage send");
}

@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    com.unit5app.Settings.setArticleSettingsBoolean(0, isChecked);
    com.unit5app.Settings.save(getApplicationContext());
    android.os.Process.killProcess(android.os.Process.myPid());
    java.lang.System.exit(1);
}

@java.lang.Override
public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    android.util.Log.d("minko", "DummyCameraPreview.surfaceChanged");
    if (isActive())
        _callback.run(surfaceHolder);
    
}

@java.lang.Override
public void onCreate() {
    super.onCreate();
    ning.xyw.androidmanager.App.mContext = this;
    ning.xyw.androidmanager.service.FloatViewService.startService();
}

@java.lang.Override
public void onActivityDestroyed(android.app.Activity activity) {
    android.util.Log.d(acr.browser.lightning.app.BrowserApp.TAG, "Cleaning up after the Android framework");
    acr.browser.lightning.utils.MemoryLeakUtils.clearNextServedView(this);
}

public void onPause(@android.support.annotation.NonNull
V v) {
    VP presenter = getPresenter(v);
    if (presenter != null)
        presenter.onPause(v);
    
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    kobeissidev.autobirthday.Settings.loadContacts(getApplicationContext(), dbHandler, granted);
    finish();
    startActivity(getIntent());
}

@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    post(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            restoreToInitial();
        }
    });
}

public void setProductListener(final de.handler.mobile.android.fairmondo.data.interfaces.OnSearchResultListener productListener) {
    this.productListener = productListener;
    errorHandler.setListener(productListener);
}

@java.lang.Override
public void onSuccess(java.lang.String roomId) {
    if (null != roomId) {
        org.matrix.matrixandroidsdk.activity.CommonActivityUtils.goToRoomPage(roomId, this, null);
    }
}

@android.annotation.TargetApi(value = 21)
public static void createCaptureSession(java.util.List<android.view.Surface> sfl) {
    com.almalence.opencam.cameracontroller.HALv3.createCaptureSession(sfl);
}

@java.lang.Override
public void onItem(@android.support.annotation.Nullable
java.lang.Boolean item) {
    if (java.lang.Boolean.TRUE.equals(item)) {
        addBookmark(title, url);
    }else {
        deleteBookmark(title, url);
    }
}

@java.lang.Override
public void onServiceDisconnected(android.content.ComponentName componentName) {
    android.util.Log.e(edu.nthu.nmsl.itri_app.FragmentActivity.TAG, "onServiceDisconnected");
    mBluetoothLeService = null;
    mBound = false;
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    localCalendar.remove(event);
    android.content.Intent mainActivityIntent = new android.content.Intent(getApplicationContext(), com.clairvoyance.crystal.MainActivity.class);
    startActivity(mainActivityIntent);
    localCalendar.save(this);
}

public void dropAllTables() {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    for (java.lang.String string : com.rudie.severin.textadventure.InformationHolders.PH.all_tables) {
        db.execSQL(("DROP TABLE IF EXISTS " + string));
    }
}

@java.lang.Override
public void onNext(com.jyutwaa.zhaoziliang.glimpse.Model.Bilibili.TopListType topListType) {
    android.widget.Toast.makeText(mContext, "onNext()!", Toast.LENGTH_SHORT).show();
    mIBlibiliFragment.hideProgressbar();
    mIBlibiliFragment.updateList(topListType);
}

public void onLoginFailed() {
    android.widget.Toast.makeText(getBaseContext(), "Login failed", Toast.LENGTH_LONG).show();
    _loginButton.setEnabled(true);
}

@java.lang.Override
public void onStreamReceived(com.opentok.android.Session session, com.opentok.android.Stream stream) {
    for (demo.tokbox.com.multiparty.MultipartyActivity.SubscriberContainer subscriber : _subsrciberLst) {
        if (null == (subscriber.getStream())) {
            _subscribeStream(subscriber, stream);
        }
    }
}

@java.lang.Override
public boolean isContactUsEnabled(int brandId) {
    return com.desk.android.sdk.helper.PropertyHelper.getBooleanWithArgs(buildBrandKey(com.desk.android.sdk.config.ContactUsPropertyConfig.KEY_CONTACT_US_ENABLED), isCallUsEnabled(), properties, brandId);
}

public void getColor(android.view.View v) {
    new mobiledev.charlottegodley.gemmaphoneapp.ColorPicker(activity, this, "", android.graphics.Color.BLACK, android.graphics.Color.WHITE).show();
}

@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_assignments_recycler, container, true);
    butterknife.ButterKnife.bind(this, view);
    return view;
}

private void setUpMessage() {
    android.util.Log.d(jaydahstudios.com.chatstories.MainActivity.TAG, "setUpMessage: Exec");
    lstChat = mDBHelper.getListChat();
}

private void onEditClick(android.view.View view) {
    android.content.Intent newIntent = new android.content.Intent(this, com.example.aaron.welcomeActivity.editBudgetActivity.class);
    com.example.aaron.welcomeActivity.Budget transferBudget = currentBudget;
    newIntent.putExtra("Budget", transferBudget);
    startActivity(newIntent);
}

public static void addBitmapToMemoryCache(java.lang.String key, android.graphics.Bitmap bitmap) {
    if ((com.keepingatimeline.kat.BitmapCache.getBitmapFromMemCache(key)) == null) {
        com.keepingatimeline.kat.BitmapCache.getInstance().mMemoryCache.put(key, bitmap);
    }
}

@java.lang.Override
public void onActivityResult(android.content.Intent data) {
    wipraktikum.informationwallandroidapp.BusinessObject.BlackBoard.BlackBoardAttachment blackBoardAttachment = wipraktikum.informationwallandroidapp.BusinessObject.BlackBoard.BlackBoardAttachment.createNewAttachmentByFilePath(getFilePathFromResult(data));
    addAttachmentViewToAttachmentContainer(blackBoardAttachment);
    blackBoardAttachments.add(blackBoardAttachment);
    otherFragmentIsVisible = false;
    saveBlackBoardAttachmentsToSharedPrefs();
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    android.util.Log.v(com.enhueco.view.FriendListFragment.LOG, EnHueco.EHSystemNotification.SYSTEM_DID_RECEIVE_FRIEND_AND_SCHEDULE_UPDATES);
    refresh();
}

public static int getTextColor(android.content.Context context) {
    switch (fr.ybo.transportsrennes.application.TransportsRennesApplication.getTheme(context)) {
        case 1 :
            return android.graphics.Color.LTGRAY;
        default :
            return android.graphics.Color.BLACK;
    }
}

void newList(java.lang.String name) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(DatabaseHelper.LIST_NAME, name);
    database.insert(DatabaseHelper.TABLE_NAME_MASTER, null, contentValues);
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putInt(filtermusic.net.ui.favorites.FavoritesFragment.LAST_OPENED_VIEW, mViewFlipper.getDisplayedChild());
}

@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL(SqlContacts.STATEMENT_CREATE_TABLE_USERS);
    sqLiteDatabase.execSQL(SqlContacts.STATEMENT_CREATE_TABLE_INSULIN_DOSE);
    android.util.Log.i("DATABASE", "tables  is crated! ");
}

@java.lang.Override
public void onDismiss(android.content.DialogInterface dialog) {
    mActiveStreamType = -1;
    mAudioManager.forceVolumeControlStream(mActiveStreamType);
    setZenPanelVisible(false);
    mDemoIcon = 0;
    mSecondaryIconTransition.cancel();
}

public void changeCursor(android.database.Cursor c) {
    if ((cursor) != null)
        c.close();
    
    cursor = c;
    notifyDataSetChanged();
}

@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail_msg);
    butterknife.ButterKnife.bind(this);
    init();
    loadData();
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((passwordList) != null)
        outState.putStringArray(org.exobel.routerkeygen.ui.NetworkFragment.PASSWORD_LIST, passwordList.toArray(new java.lang.String[0]));
    
}

@java.lang.Override
public void onReceive(final android.content.Context context, android.content.Intent intent) {
    if (intent.getAction().equals(com.infiniteshield.main.NotificationReceiver.ACTION_STOP)) {
        com.infiniteshield.main.Shield.toggle(context);
        context.sendBroadcast(new android.content.Intent(MainActivity.UPDATE_UI_ACTION));
    }
}

public void editPatientProf(android.view.View v) {
    setFieldsEnability((!(mEditTextCustomerFName.isEnabled())));
    com.extenprise.mapp.medico.util.Utility.collapse(mContLay, false);
    com.extenprise.mapp.medico.util.Utility.collapse(mAddrLayout, true);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    showSnack();
    deleteMessage(finalOpponentId);
}

public void onClick(android.content.DialogInterface dialog, int id) {
    displayRecyclerView(1);
    dialog.dismiss();
}

@java.lang.Override
public void d(java.lang.String text, java.lang.Object... args) {
    if (isDebugEnabled())
        android.util.Log.d(TAG, java.lang.String.format(text, args));
    
}

public void carregaImagem(java.lang.String localArquivoFoto) {
    android.graphics.Bitmap imagemFoto = android.graphics.BitmapFactory.decodeFile(localArquivoFoto);
    usuario.setPathFoto(localArquivoFoto);
}

public com.danimahardhika.cafebar.CafeBar.Builder icon(@android.support.annotation.DrawableRes
int res) {
    mIcon = com.danimahardhika.cafebar.CafeBarUtil.getDrawable(mContext, res);
    return this;
}

private void bindService() {
    android.content.Intent mIntent = new android.content.Intent(this, org.deviceconnect.android.deviceplugin.host.HostDeviceService.class);
    mIntent.setAction("camera");
    bindService(mIntent, mServiceConnection, Context.BIND_AUTO_CREATE);
}

@java.lang.Override
public void removeView(android.view.View view) {
    super.removeView(view);
    android.util.Log.i(psn.oldmilk.swipecard.SwipeDeck.TAG, "removeView");
}

public void showSelectProgramFragment() {
    setTitle("Event Capture");
    switchFragment(new org.hisp.dhis2.android.eventcapture.fragments.selectprogram.SelectProgramFragment(), SelectProgramFragment.TAG);
}

public boolean isMarkForMobileField() {
    return android.text.TextUtils.equals(this.name, "marked_for_mobile") ? true : false;
}

@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    android.widget.Toast.makeText(this, ("error" + filePath), Toast.LENGTH_LONG).show();
}

static java.lang.String getString(@android.support.annotation.NonNull
android.widget.EditText edit, java.lang.String defaultValue) {
    final java.lang.String text = edit.getText().toString();
    if (text.isEmpty()) {
        return defaultValue;
    }
    return text;
}

public static void unregisterActivityReceiver(android.content.BroadcastReceiver receiver) {
    if (com.adsamcik.signalcollector.Play.PlayController.apiActivity) {
        (com.adsamcik.signalcollector.Play.PlayController.registeredCount)--;
        com.adsamcik.signalcollector.Play.PlayController.c.unregisterReceiver(receiver);
    }
}

@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.media.MediaPlayer mp = com.cviac.nheart.nheartapp.fragments.MusicFragment.mp;
    if (mp != null) {
        mp.release();
    }
    doUnbindService();
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.profile_page);
    android.widget.Toast.makeText(getApplicationContext(), "Successfully Signed In", Toast.LENGTH_LONG);
}

@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if (savedInstanceState != null) {
        checkBoxSetTime.setChecked(savedInstanceState.getBoolean("IsCheckedBox"));
    }
}

private void menuLoadContacts(java.lang.String toastText) {
    kobeissidev.autobirthday.Settings.loadContacts(getApplicationContext(), dbHandler, granted);
    android.widget.Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    finish();
    startActivity(getIntent());
}

public void onClick(android.view.View v) {
    com.cards.flash.testez.EditCardFragment.cateObject = com.cards.flash.testez.NavigationDrawerFragment.getCurrCateObject();
    android.content.Intent intent = new android.content.Intent(getContext(), com.cards.flash.testez.ShareActivity.class);
    startActivity(intent);
}

public static void startHookFragment(android.app.Activity activity, android.content.Intent rawIntent, com.jude.ferryman.internal.router.result.OnActivityResultListener listener) {
    com.jude.ferryman.internal.router.result.HookFragment fragment = com.jude.ferryman.internal.router.result.ActivityResultHooker.getValidFragment(((android.support.v4.app.FragmentActivity) (activity)));
    fragment.startActivityForResult(0, rawIntent, listener);
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    newTemp.behaviours.get(index).bName = bName.getText().toString();
    newTemp.behaviours.get(index).type = spinner.getSelectedItemPosition();
    updateBehaviours();
}

protected void onCreate(android.os.Bundle bundle) {
    super.onCreate(bundle);
    setContentView(R.layout.sorusayfasi);
    tanimlar();
    hangisorudasin = 0;
    soruyugetir(hangisorudasin);
}

@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
    sqLiteDatabase.execSQL(("DROP TABLE IF EXISTS " + (BusContract.BusEntry.TABLE_NAME)));
    sqLiteDatabase.execSQL(("DROP TABLE IF EXISTS " + (BusContract.BusEntry.TABLE_NAME_SINGLE_BUS)));
    onCreate(sqLiteDatabase);
}

@java.lang.Override
public void finalize() throws java.lang.Throwable {
    if (!(isReleased)) {
        android.util.Log.w(TAG, (("AnyMemoDBOpenHelper for db " + (dbPath)) + " is not released before being GCed. This class must be explicitly released! Force releasing now."));
        org.liberty.android.fantastischmemo.common.AnyMemoDBOpenHelperManager.forceRelease(dbPath);
    }
}

@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putInt(idv.seventhmoon.hkinfomap.MapsActivity.STATE_SELECTED_NAVIGATION_ITEM, getSupportActionBar().getSelectedNavigationIndex());
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int i, long l) {
    cc.xiaoyuanzi.pianorobot.player.PianoPlayer.getPlayer().play(this, mStaffList.get(i));
}

public void onSuccess(int statusCode, cz.msebera.android.httpclient.Header[] headers, org.json.JSONObject response) {
    android.widget.Toast.makeText(context, (("Success, " + response) + " has been removed from your list"), Toast.LENGTH_LONG).show();
    Refresh();
}

void initBitmap() {
    mBitmap = android.graphics.Bitmap.createBitmap(1280, 720, Bitmap.Config.ARGB_8888);
    mBitmap.eraseColor(Color.BLACK);
    mImageView.setImageBitmap(mBitmap);
    mImageView.invalidate();
}

public synchronized void setResponse(int questionNumber, java.lang.String response) {
    android.util.Log.e("RESPONSE", ((("to question #: " + questionNumber) + " setting response: ") + response));
    thisSectionsQuestions.get(questionNumber).setResponseText(response);
}

@java.lang.Override
public void onClick(android.view.View v) {
    saveComputer();
    onBackPressed();
    android.content.Intent goToItems1 = new android.content.Intent(this, ca.ualberta.cs.technologic.Activities.HomePage.class);
    startActivity(goToItems1);
}

public android.widget.TextView addSubItem(int id, @android.support.annotation.NonNull
java.lang.String text) {
    return addSubItem(id, text, 0);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    caldroidFragment.setBackgroundResourceForDate(R.color.caldroid_white, date);
    caldroidFragment.refreshView();
}

@java.lang.Override
public void onResult(@android.support.annotation.NonNull
com.google.android.gms.common.api.Status status) {
    if (status.isSuccess()) {
        drawGeofence();
    }else {
        android.widget.Toast.makeText(context, ("Error drawing geofence" + status), Toast.LENGTH_SHORT).show();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_base);
    mApp = ((com.cloud.BaseApplication) (getApplication()));
    gson = mApp.getGson();
}

@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent e) {
    return gestureHandler.onTouch(view, e);
}

private static android.net.Uri getOutputMediaFileUri() {
    return android.net.Uri.fromFile(com.example.arjun.nhacks.GroupHardActivity.getOutputMediaFile());
}

public void getUserFromDB(android.app.Activity activity) {
    com.easemob.chatuidemo.db.UserDao dao = new com.easemob.chatuidemo.db.UserDao(activity);
    java.util.Map<java.lang.String, com.easemob.chatuidemo.domain.User> userlist = dao.getContactList();
    com.easemob.chatuidemo.DemoApplication.getInstance().setContactList(userlist);
}

@java.lang.Override
public void onClick(android.view.View v) {
    itemClickListener.onItemClick(adapter.getItem(position), view, position);
}

public java.lang.String getCarrierPackageNameForBroadcastIntent(android.content.pm.PackageManager packageManager, android.content.Intent intent) {
    return (mCarrierPrivilegeRules) == null ? "" : mCarrierPrivilegeRules.getCarrierPackageNameForBroadcastIntent(packageManager, intent);
}

@java.lang.Override
public void onClick(android.content.DialogInterface dialogInterface, int i) {
    getDialog().cancel();
}

public void startDrag(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, android.view.View floatView) {
    startDrag(viewHolder.itemView, viewHolder.getAdapterPosition(), floatView);
}

public void onClick(android.view.View v) {
    android.support.v4.app.ActivityCompat.startActivity(new android.content.Intent());
}

@java.lang.Override
protected void onBindView(android.view.View view) {
    mView = view;
    super.onBindView(view);
    widgetFrameView = ((android.widget.LinearLayout) (view.findViewById(android.R.id.widget_frame)));
    setPreviewColor();
}

@java.lang.Override
public void onError(java.lang.String message) {
    tv.superawesome.sdk.events.SAEventManager.getIntance().LogAdFailed(loadedAd);
    android.util.Log.d(tv.superawesome.sdk.views.SAPlacementView.TAG, ("Error:" + message));
    if ((listener) != null)
        listener.onAdError(message);
    
}

@java.lang.Override
protected void onRestart() {
    super.onRestart();
    android.util.Log.d("SCXTT2", " onRestart() ShowMapActivity - so stop the background location service NOW");
    stopService(new android.content.Intent(this, com.harnk.whereru.BackgroundLocationService.class));
}

@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    long result = intent.getLongExtra("start timer", 1000);
    settingTimer(result);
}

public static void triggerUpdate(android.content.Context context, java.lang.Integer[] appWidgetId) {
    android.content.Intent intent = new android.content.Intent(context, me.anon.controller.provider.PlantWidgetProvider.class);
    intent.setAction(AppWidgetManager.ACTION_APPWIDGET_UPDATE);
    intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_IDS, appWidgetId);
    context.sendBroadcast(intent);
}

@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    android.net.Uri downloadUrl = taskSnapshot.getDownloadUrl();
    activity.onImageUploaded(crumbPicture);
}

public boolean validiraj(int sistolicki, int diastolicki, int puls) {
    android.widget.Toast.makeText(context, "Validacija u tijeku!", Toast.LENGTH_SHORT).show();
    return true;
}

@java.lang.Override
public void onTabSelected(android.support.design.widget.TabLayout.Tab tab) {
    viewPager.setCurrentItem(tab.getPosition());
    int id = tab.getPosition();
}

@java.lang.Override
public void onClick(android.view.View v) {
    if (((currentValue) < (maxValue)) && (((currentValue) + (stepValue)) < (maxValue))) {
        currentValue += stepValue;
        updateCurrentValue();
    }
}

@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.digitalwall.utils.ToolbarUtils.setFullScreenToolbar(this);
}

public static final void sendEvent(android.support.v4.app.Fragment fragment, java.lang.String category, java.lang.String action) {
    if (fragment != null) {
        wb.receipts.analytics.Events.sendEvent(fragment.getActivity(), action, category);
    }
}

public void onClick(android.content.DialogInterface dialog, int id) {
    dialog.cancel();
    editor.putBoolean(Constants.PREFERENCES_SHOW_ALARM, false).commit();
    editor.putBoolean(Constants.PREFERENCES_ALREADY_RATED, true).commit();
    editor.apply();
}

private void initView() {
    com.huichongzi.fastwidget4android.widget.AnimationListViewNew blindsListView = ((com.huichongzi.fastwidget4android.widget.AnimationListViewNew) (findViewById(R.id.blinds_listview_act_list)));
    blindsListView.setAdapter(new com.huichongzi.fastwidget4android.adapter.AnimationListAdapter(this));
    blindsListView.setAnimationType(AnimationListViewNew.TYPE_BLINDS);
    blindsListView.setIsVertical(false);
}

public void setDeniedDialog(android.app.Dialog deniedDialog, boolean enableExit) {
    this.mDeniedDialog = deniedDialog;
    this.mEnableExit = enableExit;
}

public void onClick(android.content.DialogInterface dialog, int whichButton) {
    java.lang.String docFilename = subjectView.getText().toString();
    java.lang.String docMessage = messageView.getText().toString();
}

@android.annotation.SuppressLint(value = "NewApi")
@java.lang.Override
public void run() {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.KITKAT)) {
        inAppWebView.load(("javascript:" + finalScriptToInject), null);
    }else {
        inAppWebView.evaluateJavascript(finalScriptToInject, null);
    }
}

private void setItems(java.util.List<edu.galileo.android.twitterclient.entities.Image> newItems) {
    items.addAll(newItems);
    notifyDataSetChanged();
}

@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception e) {
    android.widget.Toast.makeText(this, "Failed to add Geofences", Toast.LENGTH_SHORT).show();
}

@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.paulvarry.intra42.activities.user.UserActivity.openIt(app, adapter.getItem(position));
}

