class Constructor {
    
    String name = "";

    Constructor() {
        this.name = "Empty";
    }

    Constructor(String nam) {
        // System.out.println("Bike created");
        this.name = nam;
    }

    public static void main(String[] args) {
        Constructor Constructor = new Constructor();
        System.out.println(Constructor.name);
    }
}
