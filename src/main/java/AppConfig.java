import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }
    @Bean(name = "cat")
    @Scope("prototype")
    public Cat catGoBrrrrr() {
     Cat cat = new Cat(nameList());
     return cat;
    }
    @Bean
    public List<String> nameList(){
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Adam");
        list.add("Murzik");
        list.add("Tesla");
        return list;
    }
}