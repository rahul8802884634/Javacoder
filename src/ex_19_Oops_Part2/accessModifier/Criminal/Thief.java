package ex_19_Oops_Part2.accessModifier.Criminal;

import ex_19_Oops_Part2.accessModifier.police.Cop;

public class Thief extends Cop {
    public Thief(int gun) {
        super(gun);
    }

    public static void main(String[] args) {
        Thief thief = new Thief(10);
        thief.canIShoot();  // ✅ allowed: subclass can access protected
    }
}
