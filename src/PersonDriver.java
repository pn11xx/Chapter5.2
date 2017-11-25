public class PersonDriver {

    public static void main(String [] args) {


        Person driverOne = new Person("Chris", "30");
        Person driverTwo = new Person("Chris", "20");

        System.out.println("Name: " + driverOne.name);
        System.out.println("Age: " + driverOne.age);

        if(driverOne.getName().equals(driverTwo.getName())){
            if (driverOne.getAge().equals(driverTwo.getAge())) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        } else {
            System.out.println("False");
        }
    }
}
