@dagger.Provides
@com.tomeokin.lspush.injection.scope.PerActivity
public com.tomeokin.lspush.biz.usercase.CheckCaptchaAction provideCheckCaptchaAction(@com.tomeokin.lspush.injection.qualifier.ActivityContext
android.content.Context context, com.tomeokin.lspush.data.remote.LsPushService lsPushService, com.google.gson.Gson gson, com.tomeokin.lspush.common.SMSCaptchaUtils smsCaptchaUtils) {
    return new com.tomeokin.lspush.biz.usercase.CheckCaptchaAction(context.getResources(), lsPushService, gson, smsCaptchaUtils);
}