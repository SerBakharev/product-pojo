public class Main {
    public static void main(String[] args) {
        Country country = new Country("Gana");
        country.setPopulation(32763726);
        country.setArea(329758);
        country.setCapital("Akkra");
        country.setHasSeaAccess(true);

        System.out.println("Country: " + country.getName());
        System.out.println("Capital of Country: " + country.getCapital());

        FootballTeam footballTeam = new FootballTeam("Dynamo");
        footballTeam.setCountry("Russia");
        footballTeam.setPlace(8);

        FootballTeam footballTeam1 = new FootballTeam("Achmat");
        footballTeam.setCountry("Russia");
        footballTeam.setPlace(12);


        System.out.println("Name of Team: " + footballTeam1.getName());
        System.out.println("Coutry of Team: " + footballTeam1.getCountry());
        System.out.println("Place of Championship: " + footballTeam1.getPlace());

        Student student = new Student("Sergey", 47);
        System.out.println("Name of student " + student.name() + " his age is " + student.age());



    }
}
