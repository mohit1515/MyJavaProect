/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabhets;
import java.util.Scanner;
/**
 *
 * @author Sahildeep Singh
 */
public class Alphabhets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalC = 0,totalV = 0, space = 0, x = 0, y = 0, z = 0;
        int v[] = new int[25]; int c[] = new int[40]; int s[] = new int[20];
        Scanner sc = new Scanner(System.in);
        char a[] = new char[50];
        System.out.println("Enter line : (From exit the string using '0' character)");
        for(int i = 1; a[i-1] != '0' ; i++) {
            a[i] = sc.nextLine().charAt(0);
        }
        
        for(int i = 1; a[i] != '0'; i++) {
            System.out.print(a[i]);
        }
       
        for(int i = 1; a[i] != '0'; i++) {
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' || a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U' ) {
                totalV++;
                v[x] = i;
                x++;
            } else if(a[i] == ' ') {
                space++;
                s[y] = i;
                y++;
            } else {
                totalC++;
                c[z] = i;
                z++;
            }  
        }
        
        System.out.println("\nVowels = " + totalV + "\nConsonants = " + totalC + "\nSpaces = " + space);
        System.out.print("\nVowels occur at : ");
        for(int i = 0; i < x; i++) {
            System.out.print(v[i] + ", ");
        }
        System.out.print("locations.\nConsonants occur at : ");
        for(int i = 0; i < z; i++) {
            System.out.print(c[i] + ", ");
        }
        System.out.print("locations.\nSpaces occur at : ");
        for(int i = 0; i < y; i++) {
            System.out.print(s[i] + ", ");
        }
        System.out.print("locations.\n");
    }
}
