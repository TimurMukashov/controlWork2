package org.example;


//№1
//Создать базовый класс – работник, и производные классы – служащий с почасовой оплатой,
//служащий в штате и служащий с процентной ставкой. Определить функцию начисления зарплаты.


public abstract class Worker
{
    protected String name;

    public Worker(String name)
    {
        this.name = name;
    }
    public abstract double getSalary();

    public String getName()
    {
        return name;
    }
}

class HourlyWorker extends Worker
{
    private double hoursWorked;
    private double hourlyRate;

    public HourlyWorker(String name, double hours, double hourlyRate)
    {
        super(name);
        this.hoursWorked = hours;
        this.hourlyRate = hourlyRate;
    }

    public double getHours()
    {
        return hoursWorked;
    }

    public double getHourlyRate()
    {
        return hourlyRate;
    }

    @Override
    public double getSalary()
    {
        return hoursWorked * hourlyRate;
    }
}

class SalariedWorker extends Worker
{
    private double YearlySalary;
    public SalariedWorker(String name, double YearlySalary)
    {
        super(name);
        this.YearlySalary = YearlySalary;
    }

    public double getYearlySalary() {
        return YearlySalary;
    }

    @Override
    public double getSalary()
    {
        return YearlySalary / 12;
    }
}

class ComissionWorker extends Worker
{
    private double baseSalary;
    private double commissionRate;
    private double totalSales;

    public ComissionWorker(String name, double baseSalary, double commissionRate, double totalScales)
    {
        super(name);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.totalSales = totalScales;
    }

    @Override
    public double getSalary()
    {
        return baseSalary + commissionRate * totalSales;
    }

    public double getBaseSalary()
    {
        return baseSalary;
    }

    public double getCommissionRate()
    {
        return commissionRate;
    }

    public double getTotalSales()
    {
        return totalSales;
    }
}
