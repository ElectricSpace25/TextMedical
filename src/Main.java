import java.util.*;

public class Main {
    static Patient p;
    static ArrayList<Condition> allConditions = new ArrayList<>();
    static ArrayList<String> conditionNames = new ArrayList<>();
    static int money = 0;
    static int moneyGain = 0;
    static int patients = 1;

    static int difficulty = 0;
    static int numOfConditions = 2;
    static boolean doSymptoms = true;

    static Condition nothing = new Condition("", "Nothing", 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false);


    public static void main(String[] args) {
        Condition badBack = new Condition("", "Bad Back", 0, 0, 0, 0, -30, -10, 0, 0, 0, 0, 0, false);
        Condition cataract = new Condition("", "Cataract", 0, 0, -25, 0, 0, 0, 0, 0, 0, 0, 0, false);
        Condition frail = new Condition("", "Frail", 0, 0, 0, 0, -30, -30, 0, 0, 0, 0, 0, false);
        Condition minorArteryBlockage = new Condition("Minor (initial)", "Heart Artery Blockage", 0, 0, 0, 0, 0, 0, 0, 0, 0, -5, 0, false);
        Condition minor2ArteryBlockage = new Condition("Minor (advanced)", "Heart Artery Blockage", 0, 0, 0, 0, 0, 0, 0, 0, 0, -10, 0, false);
        Condition majorArteryBlockage = new Condition("Major (initial)", "Heart Artery Blockage", 0, 0, 0, 0, 0, 0, 0, 0, 0, -15, 0, false);
        Condition major2ArteryBlockage = new Condition("Major (advanced)", "Heart Artery Blockage", 0, 0, 0, 0, 0, 0, 0, 0, 0, -35, 0, false);
        Condition extremeArteryBlockage = new Condition("Extreme", "Heart Artery Blockage", 0, 0, 0, 0, 0, 0, 0, 0, 0, -60, 0, false);
        Condition hearingLoss = new Condition("", "Hearing Loss", 0, 0, 0, -25, 0, 0, 0, 0, 0, 0, 0, false);
        Condition cirrhosis = new Condition("", "Cirrhosis", 15, 0, 0, 0, -10, 0, 0, 0, 0, 0, -60, false);
        Condition severeChemicalDamage = new Condition("", "Severe Chemical Damage", 0, 0, 0, 0, 0, 0, 0, 0, -80, 0, 0, false);
        Condition minorToxicBuildup = new Condition("Minor (initial)", "Toxic Buildup", 0, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, false);
        Condition minor2ToxicBuildup = new Condition("Minor (advanced)", "Toxic Buildup", 0, -10, 0, 0, 0, 0, 0, 0, 0, 0, 0, false);
        Condition minorFlu = new Condition("Minor", "Flu", 0, -5, 0, 0, 0, -5, 0, -10, 0, 0, 0, false);
        Condition majorFlu = new Condition("Major", "Flu", 0, -10, 0, 0, 0, -10, 0, -15, 0, 0, 0, true);
        Condition extremeFlu = new Condition("Extreme", "Flu", 5, -15, 0, 0, 0, -20, 0, -20, 0, 0, 0, true);
        Condition minorPlague = new Condition("Minor", "Plague", 20, -5, 0, 0, 0, -5, 0, 0, 0, 0, 0, false);
        Condition majorPlague = new Condition("Major", "Plague", 35, -20, 0, 0, 0, -20, 0, 0, 0, 0, 0, false);
        Condition extremePlague = new Condition("Extreme (initial)", "Plague", 60, -30, 0, 0, 0, -30, 0, 0, 0, 0, 0, false);
        Condition extreme2Plague = new Condition("Extreme (advanced)", "Plague", 85, -30, 0, 0, 0, -30, 0, -15, 0, 0, 0, false);
        Condition minorMalaria = new Condition("Minor", "Malaria", 0, -5, 0, 0, 0, 0, 0, 0, -10, 0, 0, false);
        Condition majorMalaria = new Condition("Major", "Malaria", 30, -12, 0, 0, 0, -8, 0, 0, -20, 0, 0, true);
        Condition minorInfection = new Condition("Minor", "Infection", 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false);
        Condition majorInfection = new Condition("Major", "Infection", 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false);
        Condition extremeInfection = new Condition("Extreme", "Infection", 12, -5, 0, 0, 0, 0, 0, 0, 0, 0, 0, false);
        Condition minorSleepingSickness = new Condition("Minor (initial)", "Sleeping Sickness", 2, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0, false);
        Condition minor2SleepingSickness = new Condition("Minor (advanced)", "Sleeping Sickness", 3, -4, 0, 0, 0, -4, 0, 0, 0, 0, 0, false);
        Condition majorSleepingSickness = new Condition("Major", "Sleeping Sickness", 5, -15, 0, 0, 0, -6, 0, 0, 0, 0, 0, true);
        Condition extremeSleepingSickness = new Condition("Extreme", "Sleeping Sickness", 10, -20, 0, 0, 0, -20, 0, 0, 0, 0, 0, true);
        Condition muscleParasites = new Condition("", "Muscle Parasites", 20, 0, 0, 0, -30, -30, 0, 0, 0, 0, 0, false);
        allConditions = new ArrayList<Condition>(Arrays.asList(nothing, badBack, cataract, frail, minorArteryBlockage, minor2ArteryBlockage, majorArteryBlockage, major2ArteryBlockage, extremeArteryBlockage, hearingLoss, cirrhosis, severeChemicalDamage, minorToxicBuildup, minor2ToxicBuildup, minorFlu, majorFlu, extremeFlu, minorPlague, majorPlague, extremePlague, extreme2Plague, minorMalaria, majorMalaria, minorInfection, majorInfection, extremeInfection, minorSleepingSickness, minor2SleepingSickness, majorSleepingSickness, extremeSleepingSickness, muscleParasites));

        for (int i = 0; i < allConditions.size(); i++) {
            conditionNames.add(allConditions.get(i).fullName);
        }

//        Map<String, Integer> duckyWords = Map.ofEntries(
//                entry("movement", -30),
//                entry("manipulation", -10)
//        );
//
//        for (Map.Entry<String, Integer> definition : duckyWords.entrySet()) {
//            int value = definition.getValue();
//            if (definition.getKey().equals("movement")) {
//
//            }
//            System.out.println(definition.getKey());
//            System.out.println(definition.getValue());
//        }

        //Ask difficulty and condition number
//        String answer;
//        Scanner scan = new Scanner(System.in);
//        do {
//            System.out.println("0 - Easy\n1 - Hard");
//            answer = scan.nextLine();
//        } while (!answer.equals("0") && !answer.equals("1"));
//        difficulty = Integer.valueOf(answer);
//
//        do {
//            System.out.println("1 - 1 conditions\n2 - 1 or 2 conditions");
//            answer = scan.nextLine();
//        } while (!answer.equals("1") && !answer.equals("2"));
//        numOfConditions = Integer.valueOf(answer);

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Money: $" + money);
            newPatient();
            actionMenu();
            System.out.println("You earned $" + moneyGain);
            money += moneyGain;
            moneyGain = 0;
            System.out.println("Press enter to continue");
            if (scan.nextLine().equalsIgnoreCase("debug")) debug();
            System.out.println();
        }
    }

    public static void newPatient() {
        p = new Patient();
        System.out.println("Patient #" + patients + ": " + p.name);
        patients++;
        if (doSymptoms) p.saySymptom();

    }

    public static void actionMenu() {
        int isTest; //0 - not test | 1 - test | 2 - diagnose
        boolean repeat;
        do {
            System.out.println();
            repeat = true;
            isTest = 1;
            System.out.println("What would you like to do with " + p.name + "? (? for help)");
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("?")) {
                System.out.println("P - Test pain\nC - Test consciousness\nS - Test sight\nH - Test hearing\nMOV - Test moving\nMAN - Test manipulation\nT - Test talking\nBR - Test breathing\nBF - Test blood filtration\nBP - Test blood pumping\nMET - Test metabolism\nV - Ask if vomiting (DOESN'T COUNT AS TEST)\nD - Diagnose\nDONE - Finish");
                isTest = 0;
            } else if (answer.equalsIgnoreCase("P")) printStat("Pain", p.pain);
            else if (answer.equalsIgnoreCase("C")) printStat("Consciousness", p.consciousness);
            else if (answer.equalsIgnoreCase("S")) printStat("Sight", p.sight);
            else if (answer.equalsIgnoreCase("H")) printStat("Hearing", p.hearing);
            else if (answer.equalsIgnoreCase("MOV")) printStat("Moving", p.moving);
            else if (answer.equalsIgnoreCase("MAN")) printStat("Manipulation", p.manipulation);
            else if (answer.equalsIgnoreCase("T")) printStat("Talking", p.talking);
            else if (answer.equalsIgnoreCase("BR")) printStat("Breathing", p.breathing);
            else if (answer.equalsIgnoreCase("BF")) printStat("Blood Filtration", p.bloodFiltration);
            else if (answer.equalsIgnoreCase("BP")) printStat("Blood Pumping", p.bloodPumping);
            else if (answer.equalsIgnoreCase("MET")) printStat("Metabolism", p.metabolism);
            else if (answer.equalsIgnoreCase("V")) {
                System.out.println("Vomiting?: " + p.vomit);
                isTest = 0;
            } else if (answer.equalsIgnoreCase("debug")) debug();
            else if (answer.equalsIgnoreCase("done")) {
                System.out.println();
                finish();
                isTest = 2;
                repeat = false;
            } else if (answer.equalsIgnoreCase("D")) {
                if (p.diagnosis2 == null) {
                    diagnose();
                    isTest = 2;
                } else {
                    System.out.println("You have already diagnosed " + p.name + " with the max amount of conditions");
                    isTest = 0;
                }
            } else {
                isTest = 0;
            }

            if (isTest == 1) {
                p.tests++;
                System.out.println("Tests Done: " + p.tests);
            }

        } while (repeat);
    }

    public static void printStat(String name, int stat) {
        if (difficulty == 0) System.out.println(name + ": " + stat + "%");
        else if (difficulty == 1) {
            if (name.equals("Pain")) {
                if (stat == 0) System.out.println(name + ": None");
                else System.out.println(name + ": " + (int) Math.ceil(stat / 10.0) + "/10");
            } else {
                if (stat == 100) System.out.println(name + ": Perfect");
                else System.out.println(name + ": " + (int) Math.floor(stat / 10.0) + "/10");
            }
        } else if (difficulty == 2) {
            String level = "NULL";
            if (name.equals("Pain")) {
                if (stat == 0) level = "None";
                if (stat <= 25 && stat > 0) level = "Little";
                if (stat <= 50 && stat > 25) level = "Moderate";
                if (stat <= 75 && stat > 50) level = "Bad";
                if (stat <= 100 && stat > 75) level = "Extreme";
            } else {
                if (stat == 100) level = "Perfect";
                if (stat < 100 && stat >= 75) level = "Good";
                if (stat < 75 && stat >= 50) level = "Okay";
                if (stat < 50 && stat >= 25) level = "Poor";
                if (stat < 25 && stat >= 0) level = "Bad";
            }
            System.out.println(name + ": " + level);
        }

    }

    public static void diagnose() {
        boolean repeat;
        do {
            repeat = true;
            System.out.println("What is your diagnosis for " + p.name + "? (? for help, x to cancel)");
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.equalsIgnoreCase("?")) {
                for (String x : conditionNames) {
                    System.out.println(x);
                }
            } else if (containsIgnoreCase(answer, conditionNames)) {
                if (p.diagnosis != null && answer.equalsIgnoreCase(p.diagnosis.fullName)) {
                    System.out.println("You already diagnosed that");
                } else {
                    for (Condition x : allConditions) {
                        if (x.fullName.equalsIgnoreCase(answer)) {
                            if (p.diagnosis == null) p.diagnosis = x;
                            else p.diagnosis2 = x;
                        }
                    }
                    repeat = false;
                }
            } else if (answer.equalsIgnoreCase("x")) {
                repeat = false;
            }
        } while (repeat);
    }

    public static boolean containsIgnoreCase(String strToCompare, ArrayList<String> list) {
        for (String str : list) {
            if (str.equalsIgnoreCase(strToCompare)) {
                return (true);
            }
        }
        return (false);
    }

    public static ArrayList<Condition> getAllConditions() {
        return allConditions;
    }

    public static void debug() {
        System.out.println("Pain: " + p.pain);
        System.out.println("Consciousness: " + p.consciousness);
        System.out.println("Sight: " + p.sight);
        System.out.println("Hearing: " + p.hearing);
        System.out.println("Moving: " + p.moving);
        System.out.println("Manipulation: " + p.manipulation);
        System.out.println("Breathing: " + p.breathing);
        System.out.println("Blood Filtration: " + p.bloodFiltration);
        System.out.println("Blood Pumping: " + p.bloodPumping);
        System.out.println("Metabolism: " + p.metabolism);
        System.out.println("Vomit: " + p.vomit);
        System.out.println("Condition: " + p.condition.fullName);
        if (p.condition2 != null) System.out.println("Condition2: " + p.condition2.fullName);
    }

    public static void finish() {
        int correct = 0;
        int wrong = 0;
        if (p.diagnosis == null) {
            p.diagnosis = nothing;
        }

        if (p.diagnosis2 == null) {
            System.out.println("You diagnosed " + p.name + " with " + p.diagnosis.fullName);
        } else {
            System.out.println("You diagnosed " + p.name + " with " + p.diagnosis.fullName + " and " + p.diagnosis2.fullName);
        }


        if (p.condition2 == null) {
            System.out.println(p.name + " has " + p.condition.fullName);
        } else {
            System.out.println(p.name + " has " + p.condition.fullName + " and " + p.condition2.fullName);
        }

        if (p.diagnosis == p.condition || p.diagnosis == p.condition2) {
            correct++;
        } else {
            wrong++;
        }

        if (p.diagnosis2 != null || p.condition2 != null) {
            if (p.diagnosis2 == p.condition || p.diagnosis2 == p.condition2) {
                correct++;
            } else {
                wrong++;
            }
        }

        if (p.condition2 != null) System.out.println("You got " + correct + "/2 correct");
        else System.out.println("You got " + correct + "/1 correct");

        if (p.condition2 == null && p.diagnosis2 != null) {
            System.out.println("However, you wrongly diagnosed an extra condition");
        }

        System.out.println("+$" + 1000 * correct + " Correct Diagnosis");
        moneyGain += 1000 * correct;
        System.out.println("-$" + 500 * wrong + " Incorrect Diagnosis");
        moneyGain -= 500 * wrong;
        System.out.println("-$" + 100 * p.tests + " Tests");
        moneyGain -= 100 * p.tests;


    }
}
