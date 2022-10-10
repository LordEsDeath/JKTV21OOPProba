/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv21oopproba;



import java.util.Arrays;
import java.util.Scanner;
import mydasses.Author;
import mydasses.Book;
import tools.Tools;



/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        Tools tools = new Tools();
        Book[] books = new Book[5];
        for (int i = 0; i<5; i++){
            books[i]=tools.addNewBook();
        }
        System.out.println(Arrays.toString(books));
    }
    
    }

