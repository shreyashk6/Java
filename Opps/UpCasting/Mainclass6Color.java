package Opps.UpCasting;
class Color{

}
class Red extends Color{

}
class Blue extends Color{

}
class Green extends Color{

}
class ColorPalette{
    static void addColor(Color c){
        if(c!=null){
            System.out.println("Color Selected");
        }
    }
}
public class Mainclass6Color {
    public static void main(String[] args) {
        Red r = new Red();
        ColorPalette.addColor(r);

        Blue b = new Blue();
        ColorPalette.addColor(b);

        Green g =  new Green();
        ColorPalette.addColor(g);
    }
}
