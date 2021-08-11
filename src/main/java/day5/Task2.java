package day5;


public class Task2 {
    public static void main(String[] args) {
    Motobike moto = new Motobike("Suzuki", 2000, "Red");

        System.out.println(moto.color);
        System.out.println(moto.year);
        System.out.println(moto.model);
    }
}


//2. Создать класс Мотоцикл (англ. Motorbike) с полями “Год выпуска”, “Цвет”, “Модель”. Создать экземпляр класса Мотоцикл,
//используя конструктор (set методы не использовать). Необходимо придерживаться принципов инкапсуляции и использовать ключевое слово this.
//        Вывести в консоль значение каждого из полей, используя get методы.