import java.util.Scanner;
//проект будет работать со списком товаров и выполнять определенные действия
public class Shopping {
    public static void main(String[] args) {
        System.out.println("Вас приветствует список покупок!");
        String[] shoppingList = new String[8]; // массив строк будет хранить наш список покупок max = 8
        Scanner scanner = new Scanner(System.in);
        int productCount = 0; // изначально кол-во продуктов 0
        while (true) // бесконечный цикл для выбора пункта меню
        {
            System.out.println("Выберите одну из команд:");
            System.out.println("1. Добавить товар в список");
            System.out.println("2. Показать список");
            System.out.println("3. Отчистить список");
            System.out.println("4. Завершить работу");
            int actionNumber = scanner.nextInt(); // будем отрабатывать выбор пункта
            String productName; // отработка ввода продуктов
            //отрабатываем нажатие определенных кнопок
            //пытался сделать доп сложность, за 2 часа ничего не смог сделать, одни ошибки
            switch (actionNumber){
                case 1:
                    System.out.println("Введите продукт,который хотите добавить:");
                    productName = scanner.next();
                    if (productCount < 8) { // проверяем что место еще есть
                            shoppingList[productCount] = productName;
                            productCount += 1;
                            System.out.println("Товар " + productName + " успешно добавлен в список под номером " + productCount);
                    }
                    else { // если список полон не добавляем покупку
                        System.out.println("Отложите покупку до следующего раза, список полон!");
                    }
                    break;
                case 2:
                    System.out.println("Ваш список товаров такой:");
                    for(int i = 0; i < productCount;i++){ // проматываем цикл до номера кол-ва товаров
                        System.out.println((i+1)+"."+shoppingList[i]); // выводим список
                    }
                    break;
                case 3:
                    System.out.println("Вы хотите отчистить список товаров");
                    if(productCount != 0){
                        for(int i = 0;i<productCount;i++){
                            shoppingList[i] = null;
                        }
                        productCount = 0;
                    }
                    break;
                case 4:
                    System.out.println("Вы хотите завершить работу");
                    return;// при завершении цикл обрывается
                default:
                    System.out.println("Такой команды нет!");
            }
        }
    }
}
