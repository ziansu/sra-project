@java.lang.Override
public void onNext(manoilo.catsapiandroidclient.model.Cat cat) {
    if (cat != null) {
        getCatImgUrl(cat);
        cats.add(cat);
    }
}