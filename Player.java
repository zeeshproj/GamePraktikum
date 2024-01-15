/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author asus
 */
public class Player {
    
    //atribut
    String name,nyawa,die,gagal,dada,speed,healthPoin,damage,armor;
    int healthPoint;
    
    
    
    //method
    void run(){
        System.out.println(name+" is Running......");
        System.out.println("Speed = " + speed);
    }
    
    void attack(){
        System.out.println(name+" is Attacking...");
        System.out.println("Attack = " + damage );
    }
    
    void defend(){
        System.out.println(name+" is Defending....");
        System.out.println("Defend = " + armor);
    }
    
    void revive(){
        System.out.println(name+ " is Reviving Bubaso");
    }
    void mati(){
        System.out.println(name+"Has die");
    
    
    }
    void die(){
        System.out.println(name+" Has been fail reviving");
    }
    
    boolean isDead(){
        if (healthPoint<=0) return true;
            return false;
        }
}


