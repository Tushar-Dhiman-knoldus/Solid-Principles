import java.util.Scanner;

class Rectangle{
    int m_width;
    int m_height;
   
    public void setWidth(int width){
      m_width = width;
    }
   
    public void setHeight(int h) {
      m_height = h;
    }
   
    public int getWidth() {
      return m_width;
    }
   
    public int getHeight() {
      return m_height;
    }
   
    public int getArea() {
      return m_width * m_height;
    }
   
  }
  
  class Square extends Rectangle {

    public void setWidth (int width) {
      setSide(width);
    }
   
    public void setHeight (int height) {
      setSide(height);
    }


    public void setSide(int side){

        m_width = side;
        m_height = side;
    }
  }

  class MainArea{

    public static void main(String...s){

        // Creating the Objects.
        Rectangle rec_obj = new Rectangle();
        Square square_obj = new Square();
        Scanner input_object = new Scanner(System.in);
        
        // Taking height and width as input for calculating area of rectangle. 
        System.out.println("Enter the height and width of the rectangle to find it's area");

        int height = input_object.nextInt();

        int width = input_object.nextInt();        

        rec_obj.setHeight(height);
        rec_obj.setWidth(width);    
        
        // Taking side as input for calculating area of square.
        System.out.println("Enter the side of the square");

        int side = input_object.nextInt();

        square_obj.setWidth(side);
        square_obj.setHeight(side);

        System.out.println("Area of the sqaure is = " +square_obj.getArea());
        System.out.println("Area of rectangle is = " +rec_obj.getArea());

        input_object.close();



    }
  }
