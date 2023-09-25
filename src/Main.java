public class Main {
    public static void main(String[] args) {
        Country country = new Country("Morocco");
        country.setPopulation(32763726);
        country.setArea(329758);
        country.setCapital("Rabat");
        country.setHasSeaAccess(true);

        System.out.println("Country: " + country.getName());
        System.out.println("Capital of Country: " + country.getCapital());

        FootballTeam footballTeam = new FootballTeam("Spartak");
        footballTeam.setCountry("Russia");
        footballTeam.setPlace(3);

        System.out.println("Name of Team: " + footballTeam.getName());
        System.out.println("Coutry of Team: " + footballTeam.getCountry());
        System.out.println("Place of Championship: " + footballTeam.getPlace());

        Student student = new Student("Sergey", 47);
        System.out.println("Name of student " + student.name() + " his age is " + student.age());



    }
}
