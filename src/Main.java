import com.dgmf.duck.impl.Mallard;
import com.dgmf.duck.impl.Mandarin;

public class Main {
    public static void main(String[] args) {
        Mallard mallard = new Mallard();
        mallard.display();
        mallard.quack();
        mallard.swim();

        System.out.println("===============");

        Mandarin mandarin = new Mandarin();
        mandarin.display();
        mandarin.quack();
        mandarin.swim();
    }
}