@org.springframework.web.bind.annotation.RequestMapping(value = "/insertBook")
@org.springframework.web.bind.annotation.ResponseBody
public int insertBook(entities.BookEntity book) {
    return appService.insertBook(book);
}