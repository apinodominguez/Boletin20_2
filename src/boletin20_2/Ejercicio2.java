package boletin20_2;

/**
* @param args the command line arguments
*/
public class Ejercicio2 {
// TODO code application logic herepublic static void main(String[] args) {
int nfilas = 10;
int[] a = new int[1];

public void trianguloTartaglia(){
    for (int i = 1; i <= nfilas; i++) {
        for(int k=i-5;k<=10;k++){
            System.out.print( " ");
        }
        int[] x = new int[i];
        for (int j = 0; j < i; j++){
            if (j == 0 || j == (i - 1)) {
                x[j] = 1;} 
            else {
                x[j] = a[j] + a[j - 1];
            }
            if(x[j]<10){
                System.out.print(x[j] + " ");
            }
            else{
                if (x[j]<100){
                    System.out.print(x[j] + " ");
                }
                else{
                    System.out.print(x[j] + " ");
                }

            }
        }
    a = x;
    System.out.println();
    }

}

}