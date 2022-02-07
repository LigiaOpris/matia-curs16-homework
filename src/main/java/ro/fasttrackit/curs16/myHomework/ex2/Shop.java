package ro.fasttrackit.curs16.myHomework.ex2;

import java.util.ArrayList;

public class Shop<T extends ShopItem> {
    ArrayList<ShopItem> shopItems;
    private T item;

    public String name(T item) {
        return item.name();
    }

    public int price(T item) {
        return item.price();
    }

    public Category category(T item) {
        return item.category();
    }
}
