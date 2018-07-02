package ru.job4j.calculator;

public class Converter {

    /**
     *  Тут храним курсы валют
     */
    private double usd, eur;

    /** Тут задаем значение курсов валют
     *
     * @param val
     * @param curs
     */
    public void SetVal(String val, double curs){
        switch (val){
            case "EUR": this.eur = curs;
            case "USD": this.usd = curs;
            default:
                    System.out.println("Нет такой валюты в кассе!");
                    break;
        }
    }

    /** Тут конвертируем валюту
     *
     * @param value
     * @param cur
     * @param rivers
     * @return
     */
    public double RubToVal(double value,String cur, boolean rivers){
        double val = 0;
        switch (cur){
            case "EUR": val = this.eur;
            case "USD": val = this.usd;
            default:
                        System.out.println("Нет такой валюты в кассе!");
                        break;
        }
        if (rivers) val = 1 / val;
        return val*value;
    }
}
