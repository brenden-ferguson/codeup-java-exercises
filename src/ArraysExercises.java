import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
//        -----needs to have .toString in order for it to be interpretable by a human-----

        Person[] people = new Person[3];

        people[0] = new Person("Brenden");
        people[1] = new Person("Shaine");
        people[2] = new Person("David");

        Person[] newPeople = Person.addPerson(people, "Jonny");

        for (Person person : newPeople) {
            System.out.println(person.getName());
        }
//        -----Both for-loops are valid-----
//        for(int i = 0; i < people.length; i++){
//            Person person = people[i];
//            System.out.println(person.getName());
//        }



    }
}
