public class Condition {
    String type;
    String name;
    String fullName;
    int pain;
    int consciousness; //Glasgow Coma Scale
    int sight; //Vision test
    int hearing; //Hearing test
    int moving; //Visual acuity test
    int manipulation; //Dexterity Test
    int talking; //Talking test
    int breathing; //Spirometry test
    int bloodFiltration; //Urine test
    int bloodPumping; //Blood Pressure Cuff
    int metabolism; //Metabolism Test
    boolean vomit; //Ask

    public Condition(String type, String name, int pain, int consciousness, int sight, int hearing, int moving, int manipulation, int talking, int breathing, int bloodFiltration, int bloodPumping, int metabolism, boolean vomit) {
        this.type = type;
        this.name = name;
        if (this.type.equals("")) fullName = name;
        else fullName = type + " " + name;
        this.pain = pain;
        this.consciousness = consciousness;
        this.sight = sight;
        this.hearing = hearing;
        this.moving = moving;
        this.manipulation = manipulation;
        this.talking = talking;
        this.breathing = breathing;
        this.bloodFiltration = bloodFiltration;
        this.bloodPumping = bloodPumping;
        this.metabolism = metabolism;
        this.vomit = vomit;
    }
}
