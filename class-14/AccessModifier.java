class PrivateAccessModifier {
    private int a = 10;

    // Default access modifier
    void showA() {
        hello();
        // System.out.println(hello());
    }

    private void hello() {
        System.out.println("HEllo");
    }
}

class ProtectedAccessModifier{
    protected int a = 10;
}


class AccessModifier {
    public static void main(String[] args) {
        PrivateAccessModifier pm = new PrivateAccessModifier();
        pm.showA();
        ProtectedAccessModifier pam = new ProtectedAccessModifier();
        System.out.println(pam.a);
        // pm.hello();  cannot access the private method directly
        // pm.a; Cannot access the private variable directly
    }
}
