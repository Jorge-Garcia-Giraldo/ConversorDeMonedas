import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcionmarcada=0;
        ConexionAPI prueba=new ConexionAPI();
        Moneda pruebaMoney= prueba.consultaMoneda("USD");
        Scanner opcion=new Scanner(System.in);
        Scanner monto=new Scanner(System.in);
        while(opcionmarcada!=7){
            System.out.println("Ingrese una opción:");
            System.out.println("1)Convertir dolar a peso argentino");
            System.out.println("2)Convertir peso argentino a dolar");
            System.out.println("3)Convertir dolar a real brasileño");
            System.out.println("4)Convertir real brasileño a dolar");
            System.out.println("5)Convertir dolar a peso colombiano");
            System.out.println("6)Convertir peso colombiano a dolar");
            System.out.println("7) salir");
            opcionmarcada=opcion.nextInt();
            float conversion;
            switch(opcionmarcada){
                case 1://Convertir dolar a peso argentino
                    System.out.println("Ingrese monto a convertir");
                    conversion =monto.nextFloat()*pruebaMoney.conversion_rates().ARS();
                    System.out.println("el monto es:"+conversion);
                    break;
                case 2://Convertir peso argentino a dolar
                    System.out.println("Ingrese monto a convertir");
                    conversion =monto.nextFloat()*(1/pruebaMoney.conversion_rates().ARS());
                    System.out.println("el monto es:"+conversion);
                    break;
                case 3://Convertir dolar a real brasileño
                    System.out.println("Ingrese monto a convertir");
                    conversion =monto.nextFloat()*pruebaMoney.conversion_rates().BRL();
                    System.out.println("el monto es:"+conversion);
                    break;
                case 4://Convertir real brasileño a dolar
                    System.out.println("Ingrese monto a convertir");
                    conversion =monto.nextFloat()*(1/pruebaMoney.conversion_rates().BRL());
                    System.out.println("el monto es:"+conversion);
                    break;
                case 5://Convertir dolar a peso colombiano
                    System.out.println("Ingrese monto a convertir");
                    conversion =monto.nextFloat()*pruebaMoney.conversion_rates().COP();
                    System.out.println("el monto es:"+conversion);
                    break;
                case 6://Convertir peso colombiano a dolar
                    System.out.println("Ingrese monto a convertir");
                    conversion =monto.nextFloat()*(1/pruebaMoney.conversion_rates().COP());
                    System.out.println("el monto es:"+conversion);
                    break;
                case 7://salir
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}