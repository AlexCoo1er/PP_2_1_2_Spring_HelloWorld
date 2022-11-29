import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanNew =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.equals(beanNew));

        Cat catBeanOne = (Cat) applicationContext.getBean("cat");
        Cat catBeanTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(catBeanOne.equals(catBeanTwo));
    }
}