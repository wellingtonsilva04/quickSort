
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

import java.util.Random;

/**
 *
 * @author Aluno
 */
public class Quicksort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Determia as letras que poderão estar presente nas chaves
        int vetor[] = new int[20];
        Random gerador = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVYWXZ";
        String letra = new String();
        char caractere[] = new char [0];
        char vetorchar[] = new char[20];
        int index = -1;
        
        //gerando lista do vetor de caracteres não ordenado
        for( int i = 0; i < 20 ; i++ ) {
           index = gerador.nextInt( letras.length() );
           letra = letras.substring( index, index + 1 );
           caractere = letra.toCharArray();
           vetorchar[i] = caractere[0];
        }
        System.out.println("Vetor de caracteres não ordenado:");
        System.out.println( vetorchar );
        System.out.println("");
        
        //ordena e imprime lista ordenada
        quickSortChar(vetorchar, 0, vetorchar.length - 1);
        System.out.println("Vetor de caracteres ordenado:");
        System.out.println( vetorchar );
        System.out.println("");
        
        //gerando lista do vetor numerico não ordenado
        for (int i = 0; i < 20; i++) {
            vetor[i] = gerador.nextInt(20);
        }
        
        //imprime sequencia de 20 numeros inteiros aleatorios
        System.out.println("Vetor numérico não ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
        quickSortNum(vetor, 0, vetor.length - 1);
        //lista o vetor Ordenado
        System.out.println("\n\nVetor numérico ordenado:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }  
        System.out.println("");
    }
    
    public static void trocaChar(char X[], int i, int j){
        char aux;
        aux = X[i];
        X[i]= X[j];
        X[j]= aux;     
    }
    public static int particaoChar(char X[], int p, int r){
        int pivo, i, j;
        pivo = X[(p+r)/2];
        i = p - 1;
        j = r + 1;
        while(i<j){
            do{
                j--;
            }while(X[j]>pivo);
            do{
                i++;
            }while(X[i]<pivo);
            if (i<j){
                trocaChar(X,i,j);              
            }
        }
     
        return j;   
    }
    public static void quickSortChar(char X[], int p, int r){
        int q;
        if (p<r){
            q = particaoChar(X,p,r);
            quickSortChar(X,p,q);
            quickSortChar(X,q+1,r);
            
        }
       
    }    
    
    public static void trocaNum(int X[], int i, int j){
        int aux;
        aux = X[i];
        X[i]= X[j];
        X[j]= aux;     
    }
    public static int particaoNum(int X[], int p, int r){
        int pivo, i, j;
        pivo = X[(p+r)/2];
        i = p - 1;
        j = r + 1;
        while(i<j){
            do{
                j--;
            }while(X[j]>pivo);
            do{
                i++;
            }while(X[i]<pivo);
            if (i<j){
                trocaNum(X,i,j);              
            }
        }
     
        return j;   
    }
    public static void quickSortNum(int X[], int p, int r){
        int q;
        if (p<r){
            q = particaoNum(X,p,r);
            quickSortNum(X,p,q);
            quickSortNum(X,q+1,r);
            
        }
        
    }
    
    
}
