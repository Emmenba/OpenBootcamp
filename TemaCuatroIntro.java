public class TemaCuatroIntro {
    public static void main(String[] args) {
       int numerolf=0;
       if (numerolf < 0) {
           System.out.println("El numero es negativo");
       }  else{
           if (numerolf==0) {
               System.out.println("El numero es 0");
           }else{
               System.out.println("El numero es positivo ");
           }
       }
       int numeroWhile=0;
       while (numeroWhile<3) {
           numeroWhile++;
           System.out.println(numeroWhile);
       }

       for( int numeroFor=0; numeroFor <= 3;numeroFor++){
           System.out.println(numeroFor);
       }

       String mes = "Marzo";
       String estacion = "" ;
       switch (mes){
       case "Enero":
       case "Febrero":
       case "Marzo":
        estacion= "Invierno";
        break;
       case "Abril":
       case "Mayo":
       case "Junio":
           estacion= "Primavera";
       break;
       case "Julio":
       case "Agosto":
       case "Septiembre":
           estacion= "Verano";
       break;
       case "Octubre":
       case "Noviembre":
       case "Diciembre":
           estacion= "Otoño";
       break;
       default:
           estacion="escribe bien";
       }
       System.out.println(estacion);

    }
}
