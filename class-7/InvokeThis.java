class TestInvoke {

    TestInvoke() {
        System.out.println("Hello");
    }

    TestInvoke(int x) {
        this();
        System.out.println(x);
    }
}

class InvokeThis {
    public static void main(String[] args) {
        TestInvoke a = new TestInvoke(1);
    }
}
