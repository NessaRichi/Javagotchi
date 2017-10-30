/**
 * Created by k1763998 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;

    public Creature(String name) {
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;
    }

    public void eat() {
        if (fullness >= 12) {
            System.out.println("Whoops, " + this.getName() + " is already full");
        }
        else {
            fullness += 8;
            happiness -= 6;
            energy -=4;
        }


        if (fullness>15) { fullness = 15;}

        print("Yum, " + this.getName() + " really enjoyed that");


    }

    public void sleep() {
        if (energy >= 12) {
            System.out.println("Whoops, " + this.getName() + " is not that sleepy");
        }
        else {
            energy += 8;
            happiness -= 5;
            fullness -=5;
        }


        if (energy>15) { energy = 15;}
        print("That was a good nap");

    }

    public void play() {
        if (fullness >= 12) {
            System.out.println("Whoops, " + this.getName() + " is already full");
        }
        else {
            fullness += 8;
            happiness -= 6;
            energy -=4;
        }

        if (happiness>15) { happiness= 15;}

        print("We should do that again!");

    }

    public String checkStatus() {
        String status = "";

        if (happiness <= 0 || energy <= 0 || fullness <= 0) {
            print("Oh no! " + this.getName() + " has died. You are a terrible owner");
            System.exit(0);
        }

        if(happiness <= 6) {
            status += this.getName() + " is feeling sad!\n";
        }

        if(energy <= 6) {
            status += this.getName() + " is really tired!\n";
        }

        if(fullness <= 6) {
            status += this.getName() + " is super hungry!\n";
        }



        return status;
    }

    public String getName() {
        return name;
    }

    public void print(String s) {
        System.out.println(s);
    }

}
