import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat firstCat = applicationContext.getBean("cat", Cat.class);
        Cat secondCat = applicationContext.getBean("cat", Cat.class);

        System.out.println(bean.getMessage());
        System.out.println(bean == beanTwo);
        System.out.println(firstCat.getMessage());
        System.out.println(secondCat.getMessage());
        System.out.println(firstCat == secondCat);
    }
}