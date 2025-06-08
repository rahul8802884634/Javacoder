package ex_19_Oops_Part2.accessModifier.police;

public class Cop {

    private int gun;           // private: only accessible in this class
    String iCard;              // default (package-private): accessible within same package

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot() {
        System.out.println("Yes, you can shoot!");
    }

    private void defaultFunction() {
        System.out.println("Default private function");
    }
}
