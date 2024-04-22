import com.dgmf.duck.impl.DuckDecoy;
import com.dgmf.duck.impl.Mallard;
import com.dgmf.duck.impl.Mandarin;
import com.dgmf.duck.impl.RubberDuck;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Display a Mallard ==========");
        Mallard mallard = new Mallard();
        mallard.display();
        mallard.quack();
        mallard.swim();
        mallard.fly();

        System.out.println("===== Display a Mandarin ==========");
        Mandarin mandarin = new Mandarin();
        mandarin.display();
        mandarin.quack();
        mandarin.swim();
        mandarin.fly();

        System.out.println("===== Display a Rubber Duck ==========");
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
        rubberDuck.fly();

        System.out.println("===== Display a Duck Decoy ==========");
        DuckDecoy duckDecoy = new DuckDecoy();
        duckDecoy.display();
        duckDecoy.quack();
        duckDecoy.swim();
        duckDecoy.fly();
    }
}