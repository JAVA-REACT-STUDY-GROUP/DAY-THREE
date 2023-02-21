public class Main {
    public static void main(String[] args) {

        //

        Student ebube = new Student("Ebube", "Nation", "ebube@gmail.com", Gender.MALE, 1);
        Student ifesinachi = new Student("Ifesinachi", "NachyJosh", "ifesinachi@gmail.com", Gender.MALE, 1);




        Student maxwell = new Student("Maxwell", "Networking", "mo@email.com",Gender.MALE, 2);



        System.out.println(ebube);
        System.out.println(ifesinachi);

        ebube.setLastName("Java Lord");




        System.out.println(ebube.getFirstName());
    }
}
