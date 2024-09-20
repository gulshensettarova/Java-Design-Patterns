package Creational.Builder;

public class Application {
    public static void main(String[] args) {
        Person p1=new Person.Builder()
                .withAge(28)
                .withName("Gulshan")
                .withSurName("Sattarova")
                .build();
        System.err.println(p1);

        //Bele de ola bilerdi:
        Person.Builder p2=new Person.Builder();
        p2.withAge(28);
        //Basqa emeliyyatlar
        p2.withName("Mahammad");
        //Basqa emeliyyatlar
        p2.withSurName("Niyazli");
        Person p=p2.build();
        System.err.println(p);
    }
}
