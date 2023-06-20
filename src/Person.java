class Person {
    private String name;
//    ----field----

    public Person (String name){
        this.name = name;
    }
//    ----constructor----

    public void sayHello() {
        System.out.format("Hello from %s!%n", name);
    }
//    ----method----
    public String getName(){
        return name;
    }
//    ----method----

    public void setName(String newName){
        name = newName;
    }
//    ----method----


    public static void main(String[] args) {
        Person person = new Person("Brenden");
        person.sayHello();
        System.out.println(person.getName());
        person.setName("Shaine");
        System.out.println(person.getName());

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));----Returns true
//        System.out.println(person1 == person2);------Returns false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); -------Returns True

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");----------------------This Also sets person1 as "Jane"
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }

}

