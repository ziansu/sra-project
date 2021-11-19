@javax.annotation.PostConstruct
void init() {
    payCartService.addCart("1234567890", "2018/09", "wang");
    payCartService.addCart("234567890", "2020/09", "wang");
}