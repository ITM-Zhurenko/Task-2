import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hwBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld hwBean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBean = (Cat) applicationContext.getBean("cat");
        Cat catBean2 = (Cat) applicationContext.getBean("cat");

        System.out.println("Hello world equal? " + hwBean2.equals(hwBean));
        System.out.println("Cats equal? " + catBean2.equals(catBean));
    }
}