import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld secondBean = applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat1.getMessage());
        System.out.println(cat2.getMessage());
        boolean firstComparison = bean == secondBean;
        boolean secondComparison = cat1 == cat2;
        System.out.println("Result of \"HelloWorld\" comparison is: " + firstComparison);
        System.out.println("Result of comparison of two Cats is: " + secondComparison);
    }
}