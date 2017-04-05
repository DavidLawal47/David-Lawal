package lab9Arrays;

public class Restaurant {


private final double SOUP = 2.50;
private final double WINGS = 0.15;
private final double BURGER = 4.95;
private final double CHICKENSANDWICH = 5.95;
private final double FRIES = 1.99;
private final double PIE = 2.95;
private final double ICECREAM = 2.99;
private final double SOFTDRINK = 1.50;
private final double COFFEE = 1.00;
private final double DISCOUNT = 0.25;
private final double TAX = 0.05;

private int age;
private int soup;
private int wings;
private int burger;
private int chickensandwich;
private int fries;
private int pie;
private int icecream;
private int softdrink;
private int cofee;

private double totalbill;

public Restaurant()
{
    this.age = 0;
    this.soup = 0;
    this.wings = 0;
    this.burger = 0;
    this.chickensandwich = 0;
    this.fries = 0;
    this.pie = 0;
    this.icecream = 0;
    this.softdrink = 0;
    this.cofee = 0;
   
    this.totalbill = 0.0;
}

public Restaurant(int age, int soup, int wings, int burger, int chickensandwich, int fries, int pie, int icecream, int softdrink, int cofee)
{
    this.age = age;
    this.soup = soup;
    this.wings = wings;
    this.burger = burger;
    this.chickensandwich = chickensandwich;
    this.fries = fries;
    this.pie = pie;
    this.icecream = icecream;
    this.softdrink = softdrink;
    this.cofee = cofee;
    calculateTotalbill();
}

private void calculateTotalbill()
{
    if(age <= 12)
        totalbill = 0;
    else
        totalbill = soup * SOUP + wings * WINGS + burger * BURGER + chickensandwich * CHICKENSANDWICH
                + fries * FRIES + pie * PIE + icecream * ICECREAM + softdrink * SOFTDRINK + cofee * COFFEE;
   
    if((age >= 13 && age >= 18) || age >= 65)
        totalbill = totalbill - totalbill * DISCOUNT;
   
    if(age <= 12 || (age > 18 && age < 65))
        totalbill = totalbill + totalbill * TAX;      
}

public double getTotalbill()
{
    return totalbill;
}

public int getAge()
{
    return age;
}
}
