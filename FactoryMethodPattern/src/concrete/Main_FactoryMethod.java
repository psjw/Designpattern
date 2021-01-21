package concrete;

import framework.Item;
import framework.ItemCreator;

public class Main_FactoryMethod {
    public static void main(String[] args) {
        ItemCreator itemCreator;
        Item item;
        itemCreator=new HpCreator();
        item= itemCreator.create();
        item.use();
        itemCreator=new MpCreator();
        item=itemCreator.create();
        item.use();
    }
}
