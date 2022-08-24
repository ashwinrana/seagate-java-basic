class InstanceInitializer {
    int a = 15;
    
    InstanceInitializer() {
        if(a < 14) {
            a = 20;
        }
        System.out.println(a);
    }

    {
        a = 10;
    }
    void aa() {
        a = 50;
        System.out.println(a);
    }

    public static void main(String[] args) {
        InstanceInitializer ii = new InstanceInitializer();
        ii.aa();
    }
}
