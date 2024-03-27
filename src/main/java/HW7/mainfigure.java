package HW7;

public class mainfigure {
    public static void main(String[] args) {

        //        Виділити та реалізувати наслідування для фігур:
//        - коло
//                - трикутник:
//        - прямокутний
//                - рівнобедренний
//                - рівносторонній
//                - чотирикутник:
//        - квадрат
//                - прямокутник
//                - паралелограм
//                - трапеція
//                - ромб
        Circle circle = new Circle(10,10, 10);
        circle.getName();
        System.out.println(circle.getName()+ circle.getName());

        Triangle triangle = new Triangle(10, 15,
                20, 80, 45, 55);
        triangle.getName();
        System.out.println(triangle.getName());

        TriangleRigth triangleRigth = new TriangleRigth(25, 15,
                20, 90, 40, 50);
        triangleRigth.getName();
        System.out.println(triangleRigth.getName());

        TriangleEquil triangleEquil = new TriangleEquil(15, 15,
                15, 60, 60, 60);
        triangleEquil.getEquilateral();
        System.out.println(triangleEquil.getEquilateral());

        TriangleEquib triangleEquib = new TriangleEquib(15, 15,
                20, 40, 40, 100);
        triangleEquib.getEquiberdrate();
        System.out.println(triangleEquib.getEquiberdrate());

        Quadrangle quadrangle = new Quadrangle(10, 15, 20, 25,
                60, 130, 100, 70);
         System.out.println(quadrangle.getQuadrangle());

        Square square = new Square(10, 10, 10, 10,
                90, 90, 90, 90);
         System.out.println(square.getSquare());

        Parallelogram parallelogram = new Parallelogram(20, 10, 20, 10,
                45, 135, 45, 135);
        System.out.println( parallelogram.getParallelogram());

        Trapeze trapeze = new Trapeze(20, 10, 20, 30,
                100, 80, 80, 100);
        System.out.println(trapeze.getTrapeze());

        Rhomb rhomb = new Rhomb(30, 30, 30, 30,
                100, 80, 100, 80);
        System.out.println(rhomb.getRhomb());

        Rectangle rectangle = new Rectangle(30, 60, 30, 60,
                90, 90, 90, 90);
        System.out.println(rectangle.getRectangle());

    }
}

