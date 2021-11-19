@com.cmy.xcheck.support.annotation.Check(value = { "a@d" , "b@w" , "c@e" , "a.a#p" , "[a,b,c]@ml(12)" , "e@ml(f)" , "id@id(type)" , "name@ml(nameType)" , "foo.list@d" , "startTime<endTime" , "orderType@in(1,2,3)" }, fieldAlias = "orderType=订单类型,id=身份证号码")
@com.cmy.sample.controller.GetMapping
public java.lang.String test1() {
    return "success" + (new java.util.Random().nextInt(100));
}