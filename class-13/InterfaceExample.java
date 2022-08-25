interface PaymentInterface {
    String pay(int a);
}

abstract class PaymentEsewa implements PaymentInterface {
    public String pay(int a) {
        return "Paided " + a + " to Esewa";
    }
}

abstract class PaymentKhalti implements PaymentInterface {
    public String pay(int a) {
        return "Paided " + a + " to Khalti";
    }
}

class InterfaceExample extends PaymentKhalti{
    public static void main(String[] args) {
        InterfaceExample ie = new InterfaceExample();
        System.out.println(ie.pay(15));
    }
}