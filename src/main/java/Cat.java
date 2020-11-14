import java.util.List;
import java.util.Random;

public class Cat {

    private List<String> names;

    public Cat(List<String> list){
        this.names = list;
    }

    public String getMessage() {
        Random random = new Random();
        return "this Cat name is " + names.get(random.nextInt(3));
    }
}
