/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangles;
class NewRectangle{

    double length;
    double width;
    
    public NewRectangle(double length,double width){
    this.length=length;
    this.width=width;
    }   
    public double FormulaOfArea(){
    return length*width;
    }
    public double FormulaOfPerimeter(){
    return (length+width)*2;
    }
}
public class Rectangles {

    public static void main(String[] args) {
NewRectangle rect=new NewRectangle(2.0,4.0);

System.out.println("Area is : "+rect.FormulaOfArea());
System.out.println("Perimeter is : "+rect.FormulaOfPerimeter());

    }
    
}
