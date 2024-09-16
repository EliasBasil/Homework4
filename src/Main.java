public class Main {
    public static void main(String[] args) {
        // Задача 1
        int comingOfAge = 18;
        System.out.print("Если возраст человека равен " + comingOfAge + ", то он ");
        if (comingOfAge >= 18) {
            System.out.println("совершеннолетний");
        } else {
            System.out.println("не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2
        int temperature = 18;
        System.out.print("На улице " + temperature + " градусов, ");
        if (temperature > 5) {
            System.out.println("можно идти без шапки");
        } else {
            System.out.println("нужно надеть шапку");
        }

        // Задача 3
        int speed = 18;
        System.out.print("Если скорость " + speed + ", то ");
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }

        // Задача 4
        int age = 18;
        System.out.print("Если возраст человека равен " + age + ", то ему нужно ходить ");
        if (age >= 2 && age <= 6) {
            System.out.println("в детский сад");
        } else {
            if (age >= 7 && age <= 17) {
                System.out.println("в школу");
            } else {
                if (age >= 18 && age <= 24) {
                    System.out.println("в университет");
                } else {
                    if (age > 24) {
                        System.out.println("на работу");
                    }
                }
            }
        }

        // Задача 5
        int ageForAmusementPark = 18;
        System.out.print("Если возраст ребенка равен " + ageForAmusementPark + ", то ему ");
        if (ageForAmusementPark < 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else {
            if (ageForAmusementPark >= 5 && ageForAmusementPark < 14) {
                System.out.println("можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("можно кататься на аттракционе без сопровождения взрослого");
            }
        }

        // Задача 6
        int numberOfPeople = 18;
        if (numberOfPeople < 60) {
            System.out.println("В вагоне есть стоячие и сидячие места");
        } else {
            if (numberOfPeople >= 60 && numberOfPeople < 102) {
                System.out.println("В вагоне есть только стоячие места");
            } else {
                System.out.println("В вагоне не осталось мест");
            }
        }

        // Задача 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Наибольшее число из трех - " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("Наибольшее число из трех - " + two);
            } else {
                if (three > one && three > two) {
                    System.out.println("Наибольшее число из трех - " + three);
                } else {
                    System.out.println("Однозначно определить одно наибольшее число невозможно");
                }
            }
        }
    }
}