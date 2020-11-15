package attributes.bill;

public class BillMain {
    public static void main(String[] args) {
        Item myitem1 = new Item("mms",2,250);
        Item myitem2 = new Item("dobozosfagyi",1,2000);
        Item myitem3 = new Item("coffee",1,500);

        Bill b = new Bill();
        b.addItem(myitem1);
        b.addItem(myitem2);
        b.addItem(myitem3);

        System.out.println(b.calculateTotalPrice());
    }
}
