package ru.obj.tracker;

import java.time.*;
import java.util.Arrays;

public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        long millis = System.currentTimeMillis() % 1000;
        return Double.toString(Math.random() * 100 + millis);
    }

    public void replace(String id, Item item) {
        for(int i=0;i<this.items.length;i++){
            if(this.items[i].getId().equals(id)){
                this.items[i]=item;
                item.setId(id);
                break;
            }
        }
    }

    public Item getItem(int num){
        return this.items[num];
    }
    public void delete(String id) {
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                System.arraycopy(this.items, i + 1, this.items, i, this.items.length - i - 1);
                position--;
                break;
            }
        }
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, this.position);
    }

    public Item[] findByName(String key) {
        Item[] ret = new Item[this.position];
        int a = 0;
        for (Item item : items) {
            if (item != null && item.getName().equals(key)) {
                ret[a] = item;
                a++;
            }
        }
        return Arrays.copyOf(ret, a);
    }

    public Item findById(String id) {
        Item ret = null;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i].getId().equals(id)) {
                ret = this.items[i];
                break;
            }
        }
        return ret;
    }
}

