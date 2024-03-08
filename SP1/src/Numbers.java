import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {
    int iTal = 1;
    float fTal = 3;
    double dTal = 10;
    String copenhagen = "københavn";
    String amager = "Amager";

    int[] talList = {1, 2, 3, 4, 5};
    char[] charList = {'b', 'c', 'k', '-'};
    ArrayList<String> navne;


    Numbers() {
        navne = new ArrayList<>();
        navne.add("Zana");
        navne.add("Meskin");
    }

    public String compare() {
        if (amager == amager) {
            return "Hey";
        } else {
            return "hey";
        }
    }

    public void millionr(int x) {
        String result = "Du har indsat: " + x + " Kr " + "i din konto";
        System.out.println(result);
    }

    public int xxx(int x, int y) {
        int result = x * y;
        return result;
    }

    public void xplusy(int x, int y) {
        int result = x + y;
        System.out.println(result);
    }

    public boolean ScanIt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kan du lide KBH");
        String input = sc.nextLine();
        String y = "yes";
        String n = "no";

        if (y == input) {
            return true;
        } else if (n == input) {
            System.out.println("Nå øv..");
        }

        return false;
    }


    public void loopArrayS() {
        for (String loop : navne) {
            System.out.println(loop);
        }
    }


    public void loopArray() {
        for (int talList1 : talList) {
            System.out.println(talList1);
        }
    }

    public void forEachloopChar(){
        for (char charL: charList){
            System.out.println(charL);
        }
    }

    public void forLoopChar(){
        for (int i = 0; i < charList.length; i++){
            System.out.println(charList[i]);

        }
    }




    public void loopIT() {
        for (int i = 0; i < talList.length; i++) {
            System.out.println(talList[i]);
        }
    }

    public void loopForloop() {
        int count = 10;
        for (int i = 0; i < count; i++) {
            System.out.println(i);
        }
    }

    public void countIT() {
        if (talList.length <= dTal) {
            System.out.println(copenhagen.repeat(copenhagen.length()));
        }

    }

    public boolean sum() {
        if (iTal < dTal) {
            return true;
        } else {
            return false;
        }
    }
}

