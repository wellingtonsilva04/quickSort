/*
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
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vetor[] = new int[20];
        Random gerador = new Random();
        //imprime sequência de 10 números inteiros aleatórios
        for (int i = 0; i < 20; i++) {
            vetor[i] = gerador.nextInt(20);
        }
        //lista o vetor não ordenado
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
        quickSort(vetor, 0, vetor.length - 1);
        //lista o vetor Ordenado
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }  
    }
    public static void troca(int X[], int i, int j){
        int aux;
        aux = X[i];
        X[i]= X[j];
        X[j]= aux;     
    }
    public static int particao(int X[], int p, int r){
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
                troca(X,i,j);              
            }
        }
     
        return j;   
    }
    public static void quickSort(int X[], int p, int r){
        int q;
        if (p<r){
            q = particao(X,p,r);
            quickSort(X,p,q);
            quickSort(X,q+1,r);
            
        }
        
    }
    
    
}
