package ex_19_Oops_Part2.accessModifier.police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(10);
        jrCop.canIShoot();  // ✅ allowed: same package, protected method
        // System.out.println(jrCop.gun); // ❌ private: not allowed
    }
}
