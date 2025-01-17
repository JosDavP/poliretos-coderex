package Figuras;

/**
     * @author Elizabeth Lopez Zelaya
     * @Github Lorent777
     * @version 2.0
     * 
     * @since 2023-12-01
     * 
     * @license
     * 
     *         
     *     F16:                                                                    1
            +				+
                -		-
                    +
                -		-
            +				+                                                    

     */



public class Figura16MasMenosX {

    public void MasMenosX(int tamanioFigura) {
        int espacios = 0;

        for (int i = 1; i <= tamanioFigura*2+1; i++) {
         for (int j = 1; j <= ((tamanioFigura + 1) * 2); j++) {
             if(i != tamanioFigura+1) {
                 if(j == 1 + espacios || j == ((tamanioFigura +1) * 2) - espacios) {
                     if(tamanioFigura % 2 == 0) {
                       if(i % 2 == 0) {
                          System.out.print("+" + " ");
                       } else {
                          System.out.print("-" + " ");
                       }
                     } else {
                       if(i % 2 != 0) {
                          System.out.print("+" + " ");
                       } else {
                          System.out.print("-" + " ");
                       }
                     }
                 } else {
                     System.out.print("  ");
                 }
             } else {
                 if(j == espacios) {
                     System.out.print("   " + "+");
                 } else {
                     System.out.print("  ");
                 }
             }
         }
         if(i <= tamanioFigura){
             espacios++;
         } else {
             espacios--;
         }
         System.out.println();
        }
    }
}
