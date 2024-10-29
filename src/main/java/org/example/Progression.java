package org.example;


//Создать базовый класс с функцией – сумма прогрессии. Создать производные классы:
//арифметическая прогрессия и геометрическая прогрессия.
//Каждый класс имеет два поля типа double. Первое – первый член прогрессии,
//второе – постоянная разность(для арифметической) и постоянное отношение (для геометрической).
//Определить функцию вычисления суммы, где параметром является количество элементов прогрессии.


public abstract class Progression
{
    protected double firstElement;

    public Progression(double firstElement)
    {
        this.firstElement = firstElement;
    }

    public double getFirstElement()
    {
        return this.firstElement;
    }

    public abstract double getElement(int j);
    public abstract double sum(int n);
}

class ArithmeticProgression extends Progression
{
    private double difference;

    public ArithmeticProgression(double firstElement, double d)
    {
        super(firstElement);
        this.difference = d;
    }

    @Override
    public double getElement(int j)
    {
        return this.firstElement + j * this.difference;
    }

    @Override
    public double sum(int n)
    {
        return (n + 1) * (this.firstElement + this.getElement(n)) / 2;
    }
}

class GeometricProgression extends Progression
{
    private double relation;

    public GeometricProgression(double firstElement, double r)
    {
        super(firstElement);
        this.relation = r;
    }

    @Override
    public double getElement(int j)
    {
        return this.firstElement * Math.pow(this.relation, j);
    }

    @Override
    public double sum(int n)
    {
        return (this.firstElement - this.getElement(n) * this.relation) / (1 - this.relation);
    }
}
