package net.teachingprogramming.lecture03;

public class Main {
    public static void main(String[] args) {
        net.teachingprogramming.lecture03.Person person1 = new net.teachingprogramming.lecture03.Person();
        person1.name = "ドラえもん";
        person1.weight = 129.3;
        person1.height = 1.293;
        person1.selfIntroduction();

        Person person2 = new Person();
        person2.name = "ドラミ";
        person2.weight = 91.0;
        person2.height = 1.0;
        person2.selfIntroduction();
    }
}
