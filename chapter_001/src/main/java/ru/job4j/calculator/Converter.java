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
    public void SetVal(String val, double curs) {
        if (val.equals("EUR")) this.eur = curs;
        if (val.equals("USD")) this.usd = curs;
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

        if (cur.equals("EUR")) val = this.eur;
        if (cur.equals("USD")) val = this.usd;
        if (rivers && val!=0) val = 1 / val;
        return val*value;
    }
}
