public class Cards {

    private int type;
    private int moneyValue;
    private String text;
    private int location;

    public Cards(int t, int m, String tx){
        type = t;
        moneyValue = m;
        text = tx;
    }

    public Cards(int t, String tx, int l){
        type = t;
        text = tx;
        location = l;
    }

    public Cards(int t, String tx){
        type = t;
        text = tx;
    }

    public int getType(){
        return type;
    }

    public int getMoneyValue(){
        return moneyValue;
    }

    public String getText(){
        return text;
    }

    public int getLocation(){
        return location;
    }

}
