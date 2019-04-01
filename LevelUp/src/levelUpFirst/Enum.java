package levelUpFirst;

public enum Enum {
    QYAP("karmir"),
    SIRT("karmir"),
    XAR("sev"),
    XACH("sev");

    String color;

    Enum(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
    public static void main(String[] args) {
        System.out.println("name is: " + Enum.QYAP + " : color is: " + Enum.QYAP.getColor());
    }

}