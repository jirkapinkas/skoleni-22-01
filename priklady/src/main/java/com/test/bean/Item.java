package com.test.bean;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
//@Builder
public class Item {

    private String name;

    private double price;

    private String description;

    public static ItemBuilder builder() {
        return ItemBuilder.anItem();
    }

    public static final class ItemBuilder {
        private String name;
        private double price;
        private String description;

        private ItemBuilder() {
        }

        public static ItemBuilder anItem() {
            return new ItemBuilder();
        }

        public ItemBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ItemBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ItemBuilder description(String description) {
            this.description = description;
            return this;
        }

        public Item build() {
            Item item = new Item();
            item.setName(name);
            item.setPrice(price);
            item.setDescription(description);
            return item;
        }
    }
}
