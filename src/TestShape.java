class Shape {
    private String name;
    private int wt, ht;

    Shape(String a, int b, int c){
        name=a;
        wt=b;
        ht=c;
    }

    void setName(String a) {name=a;}
    void setWt (int a) {wt=a;}
    void setHt (int a) {ht=a;}

    String getName() {return name;}
    int getWt() {return wt;}
    int getHt() {return ht;}
}

public class TestShape {
    public static void main(String[] args) {
        Shape spp=new Shape("Прямоугольник",10,5);
        System.out.println(spp.getName()+"\n"+spp.getWt()+"/"+spp.getHt());

        spp.setName("Квадрат");
        spp.setWt(5);
        System.out.println(spp.getName()+"\n"+spp.getWt()+"/"+spp.getHt());
    }
}
