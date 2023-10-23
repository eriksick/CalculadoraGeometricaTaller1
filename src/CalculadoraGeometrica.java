import java.util.Scanner;
public class CalculadoraGeometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Figuras Geométricas");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.print("Elija una figura (1/2/3): ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el radio del círculo: ");
                double radioCirculo = scanner.nextDouble();
                Circulo circulo = new Circulo(radioCirculo);
                System.out.println("Área del círculo: " + circulo.calcularArea());
                System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
                break;

            case 2:
                System.out.print("Ingrese el largo del rectángulo: ");
                double largoRectangulo = scanner.nextDouble();
                System.out.print("Ingrese el ancho del rectángulo: ");
                double anchoRectangulo = scanner.nextDouble();
                Rectangulo rectangulo = new Rectangulo(largoRectangulo, anchoRectangulo);
                System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
                System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
                break;

            case 3:
                System.out.print("Ingrese la base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Ingrese la altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                System.out.print("Ingrese el lado 1 del triángulo: ");
                double lado1Triangulo = scanner.nextDouble();
                System.out.print("Ingrese el lado 2 del triángulo: ");
                double lado2Triangulo = scanner.nextDouble();
                System.out.print("Ingrese el lado 3 del triángulo: ");
                double lado3Triangulo = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo, lado1Triangulo, lado2Triangulo, lado3Triangulo);
                System.out.println("Área del triángulo: " + triangulo.calcularArea());
                System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
                break;

            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}
