@java.lang.Override
public void onNext(manoilo.catsapiandroidclient.model.Cat cat) {
    getCatImgUrl(cat);
    cats.add(cat);
}