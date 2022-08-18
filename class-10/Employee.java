class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address a1 = new Address("KTM", "3", "NP");
        Employee e1 = new Employee(1, "BoB", a1);
        e1.display();
    }
}

class Address {
    String city, state, country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}