/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Scanner;
import mydasses.Author;
import mydasses.Book;

/**
 *
 * @author pupil
 */
public class Tools {
    public Author[] createAuthor(int countAuthorsInBook){
    Author[] authors = new Author[countAuthorsInBook];
    for (int i = 0; i < countAuthorsInBook; i++){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Имя автора"+(i+1)+ ": ");
                String firstname = scanner.nextLine();
                System.out.println("Фамили автора"+(i+1)+ ": ");
                String lastname = scanner.nextLine();
                Author author = new Author();
                author.setFirstname(firstname);
                author.setLastname(lastname);
                authors[i] = author;
    }
    return authors;
    
    }
    public Book createBook(String title){
        Book book = new Book();
        book.setTitle(title);
        return book;
    }
    
    public Book addNewBook(){
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Название книги: ");
            Book book = new Book();
            book.setTitle(scanner.nextLine());
            System.out.println("Сколько авторов в этой книге: ");
            int countAuthorsInBook = scanner.nextInt();
            scanner.nextLine();
            book.setAuthors(createAuthor(countAuthorsInBook)); 
            return book;
    }
}