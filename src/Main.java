//task1 возраст человека
public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int ageMan = 26;
        if (ageMan >= 18) {
            System.out.println("Если возраст человека равен " + ageMan + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + ageMan
                    + ", то он не достиг совершеннолетия, нужно немного подождать»");
        }
        System.out.println();

        //task2 температура на улице
        System.out.println("task2");
        int temperatureEnvironment = -1;
        if (temperatureEnvironment < 5) {
            System.out.println("На улице " + temperatureEnvironment
                    + " градусов, холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperatureEnvironment
                    + " градусов, cегодня тепло, можно идти без шапки");
        }
        System.out.println();

        //task3 превышение скорости
        System.out.println("task3");
        int speedCar = 58;
        if (speedCar > 60) {
            System.out.println("Если скорость " + speedCar
                    + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedCar
                    + ", то можно ездить спокойно");
        }
        System.out.println();

        //task4 учреждение в зависимости от возраста
        System.out.println("task4");
        int years = 13;
        if (7 > years && years >= 2) {
            System.out.println("Если возраст человека равен " + years
                    + ", то ему нужно ходить в детский сад ");
        }

        if (18 > years && years >= 7) {
            System.out.println("Если возраст человека равен " + years
                    + ", то ему нужно ходить в школу");
        }
        if (24 >= years && years >= 18) {
            System.out.println("Если возраст человека равен " + years
                    + ", то ему нужно ходить в университет");
        }
        if (years > 24) {
            System.out.println("Если возраст человека равен " + years
                    + ", то ему нужно ходить на работу ");
        }
        System.out.println();

        //task5 возраст ребенка
        System.out.println("task5");
        int ageChild = 15;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild
                    + ", то ему нельзя кататься на аттракционе");
        } else {
            if (14 > ageChild && ageChild > 5) {
                System.out.println("Если возраст человека равен " + ageChild
                        + ", то он может кататься только в сопровождении взрослого. "
                        + "Если взрослого нет, то кататься нельзя.");
            }
        }

        if (ageChild > 14) {
            System.out.println("Если возраст ребенка равен " + ageChild
                    + ", то он может кататься без сопровождения взрослого");
        }
        System.out.println();

        //task6 места в вагоне
        System.out.println("task6");
        int manInWagon = 102;
        if (manInWagon < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else {
            if (102 > manInWagon && manInWagon >= 60) {
                System.out.println("В вагоне остались только стоячие места");
            }
        }

        if (102 <= manInWagon) {
            System.out.println("Вагон полностью забит");
        }
        System.out.println();


        //task7 места в вагоне
        System.out.println("task7");
        int one = 454;
        int two = 67;
        int three = 736;
        if (one >= two && one >= three){
            System.out.println("Число равное " + one + " самое большее");
        }

        else {
            if (two >= one && two >= three) {
                System.out.println("Число равное " + two + " самое большее");
            }
        }

        if (three > one && three > two){
            System.out.println("Число равное " + three + " самое большее");
        }
    }
}