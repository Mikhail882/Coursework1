package ru.skypro;

public class Employee {
    private String staff;
    private int zpStaff;
    private int departmentNumber;
    private int id;
    private static int counter;

    public Employee(String staff, int zpStaff, int departmentNumber) {
        this.staff = staff;
        this.zpStaff = zpStaff;
        this.departmentNumber = departmentNumber;
        this.id = getCouner();
        counter++;
    }

    public static int getCouner() { return counter; }
    public String getStaff() {return staff; }
    public int getId() { return id; }
    public int getZpStaff() { return zpStaff; }
    public int getDepartmentNumber() { return departmentNumber; }
    public void setStaff(String staff) { this.staff = staff; }
    public void setZpStaff(int zpStaff) { this.zpStaff = zpStaff; }
    public void setDepartmentNumber(int departmentNumber) { this.departmentNumber = departmentNumber; }

    @Override
    public String toString() {
        return "Ф.И.О сотрудника: " + staff +
                "Зарплата сотрудника: " + zpStaff +
                " Номер департамента: " + departmentNumber +
                " Идентификационный номер: " + id;

    }
}
