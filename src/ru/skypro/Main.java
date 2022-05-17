package ru.skypro;

public class Main {

    public static void countMinZp(Employee[] employees) {
        if (employees.length > 0) {
            int minZp = employees[0].getZpStaff();
            String staffMan = "";
            for (Employee employee : employees) {
                if (minZp > employee.getZpStaff()) {
                    minZp = employee.getZpStaff();
                    staffMan = employee.getStaff();
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой:" + staffMan + minZp);
        } else
            System.out.println("Данные не заполнены");
    }

    public static void countMaxZp(Employee[] employees) {
        int maxZp = employees[0].getZpStaff();
        String staffMan = "";
        for (Employee employee : employees) {
            if (maxZp < employee.getZpStaff()) {
                maxZp = employee.getZpStaff();
                staffMan = employee.getStaff();
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой:" + staffMan + maxZp);
    }

    public static void typeAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void typeAllStaffAll(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getStaff());
        }
    }

    public static int countStaffZp(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getZpStaff();
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + sum);
        return sum;
    }

    public static void averageZp(Employee[] employees) {
        int sum = countStaffZp(employees);
        int average = sum / employees.length;
        System.out.println("Средняя зарплата: " + average);
}
    public static void countAllStaff(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Ф.И.О. сотрудников компании: " + employee.getStaff());
        }
    }

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];
        employee[0] = new Employee(" Zhaworonkov Andrey Fedorovich ", 100000, 5);
        employee[1] = new Employee(" Maksimov Ivan Vladimirovich ", 50000, 1);
        employee[2] = new Employee(" Glotov Vdadimir Dmitrievich ", 20000, 2);
        employee[3] = new Employee(" Dronov Alexey Timurovich ", 30000, 2);
        employee[4] = new Employee(" Plotnikov Ruslan Valerievich ", 15000, 2);
        employee[5] = new Employee(" Kartoshkin Alexey Nikolaevich ", 120000, 3);
        employee[6] = new Employee(" Kuzyakin Alexey Vladimirivich ", 120000, 3);
        employee[7] = new Employee(" Kolkov Dmitriy Anatolievich ", 130000, 3);
        employee[8] = new Employee(" Palchinskiy Nikolay petrovich ", 150000, 1);
        employee[9] = new Employee(" Tarasov Iliya Vladimirovich ", 40000, 4);
        typeAllStaff(employee);
        countMinZp(employee);
        countMaxZp(employee);
        countStaffZp(employee);
        averageZp(employee);
        countAllStaff(employee);




	// write your code here
//        - **Базовая сложность**
//        1. Создать класс Employee, который содержит информацию о Ф.И.О., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
//        2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
//        3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
//        4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.
//        5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
//        6. По умолчанию все поля должны передавать через конструктор (кроме id) исполняться в нем (включая id, который нужно получить из счетчика).
//        7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.
//        8. Создать статические методы, которые будут взаимодействовать с массивом и предоставлять результат:
//        1. Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
//        2. Посчитать сумму затрат на зарплаты в месяц.
//        3. Найти сотрудника с минимальной зарплатой.
//        4. Найти сотрудника с максимальной зарплатой.
//        5. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//        6. Получить Ф. И. О. всех сотрудников (вывести в консоль).
//
//        - **Критерии оценки**
//
//            – Корректно создан класс Employee.
//
//            – Реализованы геттеры для всех полей класса.
//
//            – Реализованы сеттеры для всех полей класса.
//
//            – Создано поле типа Employee[10] для хранения записей о сотрудниках.
//
//            – Созданы методы, которые корректно выводят информацию:
//
//        - список всех сотрудников со всеми данными,
//                - поиск сотрудника с минимальной зарплатой,
//        - поиск сотрудника с максимальной зарплатой,
//        - подсчет среднего значения зарплат,
//                - список Ф. И. О. всех сотрудников.
//
//            – Программа работает корректно при изменении любых данных о сотрудниках и выводит верный результат.




    }
}
