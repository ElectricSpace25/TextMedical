import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Patient {
    String name;
    int pain = 0; //Pain scale
    int consciousness = 100; //Glasgow Coma Scale
    int sight = 100; //Vision test
    int hearing = 100; //Hearing test
    int moving = 100; //Visual acuity test
    int manipulation = 100; //Dexterity Test
    int talking = 100; //Talking test
    int breathing = 100; //Spirometry test
    int bloodFiltration = 100; //Urine test
    int bloodPumping = 100; //Blood Pressure Cuff
    int metabolism = 100; //Metabolism Test
    boolean vomit = false;
    Condition condition;
    Condition condition2;
    Condition diagnosis;
    Condition diagnosis2;
    int tests = 0;

    String[] names = {"Bob", "Joe", "John", "James", "Mark", "Sally", "Bianca", "Elizabeth", "Jane", "Trisha", "Dan", "Jim", "Donald", "Dale", "Michael", "Susan", "Kate", "Stephanie", "Julia", "Isabelle"};

    public Patient() {
        name = names[random(0, names.length)];
        condition = Main.getAllConditions().get(random(0, Main.getAllConditions().size()));
        affectStats(condition);
        if (Main.numOfConditions == 2) {
            int r = random(0, 2);
            if (r == 0 && condition != Main.nothing) {
                do {
                    condition2 = Main.getAllConditions().get(random(0, Main.getAllConditions().size()));
                } while (condition.name == condition2.name || condition2 == Main.nothing);
                affectStats(condition2);
            }
        }
    }

    public void saySymptom() {
        String say = null;
        ArrayList<String> randomNums = new ArrayList<>(Arrays.asList("p", "c", "s", "h", "m", "ma", "b"));
        while (randomNums.size() > 0 && say == null) {
            String rand = randomNums.get(random(0, randomNums.size()));
            randomNums.remove(rand);
            if (rand.equals("p")) if (pain > 0) say = "they are in pain.";
            if (rand.equals("c")) if (consciousness < 100) say = "they feel dizzy.";
            if (rand.equals("s")) if (sight < 100) say = "their vision is blurry.";
            if (rand.equals("h")) if (hearing < 100) say = "they can't hear well.";
            if (rand.equals("m")) if (moving < 100) say = "they are walking slower.";
            if (rand.equals("ma")) if (manipulation < 100) say = "their coordination is bad.";
            if (rand.equals("b")) if (breathing < 100) say = "they feel short of breath.";
        }
        if (say == null) {
            say = "they just feel off";
        }

        System.out.println(name + " says " + say);
    }

    public void affectStats(Condition condition) {
        pain += condition.pain;
        consciousness = consciousness + condition.consciousness;
        sight = sight + condition.sight;
        hearing = hearing + condition.hearing;
        moving = moving + condition.moving;
        manipulation = manipulation + condition.manipulation;
        talking = talking + condition.talking;
        breathing = breathing + condition.breathing;
        bloodFiltration = bloodFiltration + condition.bloodFiltration;
        bloodPumping = bloodPumping + condition.bloodPumping;
        metabolism = metabolism + condition.metabolism;
        if (!vomit) vomit = condition.vomit;
    }

    public int random(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
