@org.junit.Test
public void testHelloWorld() {
    org.springframework.context.ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("Beans.xml");
    com.test.spring4.ch02.helloworld.HelloApi helloApi = context.getBean("hello", com.test.spring4.ch02.helloworld.HelloApi.class);
    assertEquals(helloApi.sayHello(), "Hello World!");
    helloApi.getMessage();
}