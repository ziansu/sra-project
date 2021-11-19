@org.springframework.web.bind.annotation.RequestMapping(value = "/cat", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String booksOfCategory(org.springframework.ui.Model m) {
    java.lang.System.out.println("cat is dran");
    java.util.List<java.lang.String> result = bookListProvider.getBookDataById(1);
    m.addAttribute("books", result);
    return "books";
}