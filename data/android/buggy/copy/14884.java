@dagger.Provides
@com.tomeokin.lspush.injection.scope.PerActivity
public com.tomeokin.lspush.biz.usercase.SendCaptchaAction provideSendCaptchaAction(@com.tomeokin.lspush.injection.qualifier.ActivityContext
android.content.Context context, com.tomeokin.lspush.data.remote.LsPushService lsPushService, com.tomeokin.lspush.common.SMSCaptchaUtils smsCaptchaUtils) {
    return new com.tomeokin.lspush.biz.usercase.SendCaptchaAction(context.getResources(), lsPushService, smsCaptchaUtils);
}