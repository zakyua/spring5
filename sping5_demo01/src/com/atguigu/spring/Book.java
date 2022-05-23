package com.atguigu.spring;

/**
 * @author ccstart
 * @create 2022-04-19 20:13
 */
public class Book {
    private String bname;
    private String bauthor;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBauthor() {
        return bauthor;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public Book() {
    }

    public Book(String bname) {
        this.bname = bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBname() {
        return bname;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setBname("C语言");
        System.out.println(book.getBname());

        Book java = new Book("java");
        System.out.println(java.getBname());
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", bauthor='" + bauthor + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
