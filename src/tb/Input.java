/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TB;

/**
 *
 * @author flora fauna
 */
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
    String user1, password1, user, password;


user1 = "abc";
password1 = "123";

   
    Scanner flo = new Scanner(System.in);
    System.out.println("Masukkan Username: ");
    user = flo.nextLine();
    System.out.println("Masukkan Password: ");
    password = flo.nextLine();

    }
  public void verifikasi (String user1,String password1,String user,String password){
   if (user1.equals(user) && password1.equals(password)){
    System.out.println("Login Berhasil");
    }else{
 System.out.println("Login GAGAL !!!");
        }}
   
    }
        
        
       
    
    
    

   

    
    

