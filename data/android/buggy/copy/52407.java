public static void main(java.lang.String[] args) {
    com.livtrip.web.controller.UserReq userReq = new com.livtrip.web.controller.UserReq();
    userReq.setName("mark");
    com.livtrip.web.controller.User user = com.xiaoleilu.hutool.convert.Convert.convert(com.livtrip.web.controller.User.class, userReq);
    java.lang.System.out.println(com.alibaba.fastjson.JSON.toJSONString(user));
}