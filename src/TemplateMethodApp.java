public class TemplateMethodApp {
    public static void main(String[] args) {
        C a = new A();
        a.templateMethod();

        System.out.println();

        C b = new B();
        b.templateMethod();

    }
}
abstract class C {
    final void templateMethod() {
        System.out.println("1");
        differ();
        System.out.println("3");
        differ2();
    }
    abstract void differ();
    abstract void differ2();
}
class A extends C {
    void differ() {
        System.out.println("2");
    }
    void differ2(){
        System.out.println("5");
    }
}
class B extends C{
    void differ() {
        System.out.println("4");
    }
    void differ2() {}
}
