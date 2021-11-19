public static rx.Observable<java.util.List<com.example.alexander.yandexmoneyshops.data.entity.ShopEntity>> getShopsFromWeb() {
    android.util.Log.i("_d", "WEB REQUEST");
    return com.example.alexander.yandexmoneyshops.data.web.YandexMoneyShopsFetcher.sYandexMoneyShopsService.getShops();
}