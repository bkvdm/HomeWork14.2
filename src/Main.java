public class Main {
    public static void changeValue(int value) {
        value = 22;
    }

    public static void main (String[] arg) {
        Integer value = 33;
        changeValue(value);
        System.out.println("value = " + value);
    }
}

//Напишите метод, который изменяет значение переменной типа Integer.
//Объявите метод changeValue, который принимает параметр типа Integer под названием value.
//Внутри метода с помощью оператора присваивания запишите в параметр значение 22.
//В методе main объявите переменную типа Integer под названием value и запишите туда значение 33.
//В следующей строке вызовите метод changeValue и передайте в него эту переменную.