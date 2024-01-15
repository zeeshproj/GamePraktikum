/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Game War for Planet!");
        
        // Memasukkan nama pemain pertama
        System.out.print("Masukkan nama pemain pertama: ");
        String player1Name = scanner.nextLine();

        // Memasukkan nama pemain kedua
        System.out.print("Masukkan nama pemain kedua: ");
        String player2Name = scanner.nextLine();

        // Menampilkan nama pemain
        System.out.println("Pemain pertama: " + player1Name);
        System.out.println("Pemain kedua: " + player2Name);

        // Meng set kecepatan pemain pertama
        System.out.print("Masukkan kecepatan yang kamu inginkan pada player 1 : ");
        String player1speed = scanner.nextLine();
        // Meng set healthpoint pemain pertama
        System.out.print("Masukkan healthpoint yang kamu inginkan kepada player 1 : ");
        String player1health = scanner.nextLine();
        // Meng set damage pada pemain pertama
        System.out.print("Masukkan damage yang kamu inginkan kepada player 1 : ");
        String player1damage = scanner.nextLine();
        //  Meng set armor pada pemain pertama
        System.out.print("Masukkan armor yang kamu ingin gunakan kepada player 1 : ");
        String player1armor = scanner.nextLine();
        
        
        // Meng set kecepatan pemain kedua
        System.out.print("Masukkan kecepatan yang kamu inginkan pada player 2 : ");
        String player2speed = scanner.nextLine();
        // Meng set healthpoint pemain kedua
        System.out.print("Masukkan healthpoint yang kamu inginkan kepada player 2 : ");
        String player2health = scanner.nextLine();
        // Meng set damage pada pemain kedua
        System.out.print("Masukkan damage yang kamu inginkan kepada player 2 : ");
        String player2damage = scanner.nextLine();
        //  Meng set armor pada pemain kedua
        System.out.print("Masukkan armor yang kamu ingin gunakan kepada player 2 : ");
        String player2armor = scanner.nextLine();
        
      


        
        
        //membuat objek
        Player superpowers = new Player();
        Player enemy       = new Player();
        Player reviver     = new Player();
        
        superpowers.name = player1Name;
        superpowers.speed = player1speed;
        superpowers.healthPoin = player1health;
        superpowers.damage = player1damage;
        superpowers.armor = player1armor;
        
        enemy.name = player2Name;
        enemy.speed = player2speed;
        enemy.healthPoin = player2health;
        enemy.damage = player2damage;
        enemy.armor =  player2armor;
       
        
       
              
        
        
        
        
        //menjalankan method
        superpowers.run();
        superpowers.attack();
        enemy.defend();
        enemy.run();
        enemy.attack();
        superpowers.defend();
        
        if (enemy.isDead()) {
            
                System.out.println("Player 1 win.");
            
        }
        
      
            
        }
   
}
                
            
            
                
            
            
            
          
       

