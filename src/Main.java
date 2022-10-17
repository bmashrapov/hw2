public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задание 1. Задача 1");
        var dog = 8;
        var cat = 6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper =  paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 5;
        cat = cat - 6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задание 2. Задача 4
        System.out.println("Задание 2. Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //Задание 3. Задача 6
        System.out.println("Задача 6");
        var boxerJohn = 78;
        var boxerTommy = 82;
        var totalWieght = boxerTommy + boxerJohn;
        System.out.println("Общий вес боксеров " + totalWieght+ " кг!");
        System.out.println("Задача 7");
        var weightDifference =  boxerTommy - boxerJohn;
        System.out.println("Разница в весе " + weightDifference + " кг!");
        weightDifference = boxerTommy % boxerJohn;
        System.out.println("Разница в  весе (остаток от деления) " + weightDifference + " кг!");
        //Задача 8
        System.out.println("Задача 8");
        var totalTime = 640;
        var employeeShiftTime = 8;
        var amountOfWorkers = totalTime / employeeShiftTime;
        System.out.println("Всего сотрудников " + amountOfWorkers + " человек");
        amountOfWorkers = amountOfWorkers + 94;
        totalTime = amountOfWorkers * 8;
        System.out.println("Если в компании работает " + amountOfWorkers + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");
    }
}
