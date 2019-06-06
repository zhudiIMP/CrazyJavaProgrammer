package cn.crazy.thread.lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class WriterAndReader {
    public static void main(String args[]){
        Book book = new Book();
        Writer w1 = new Writer(book);
        Reader r1 = new Reader(book);

        new Thread(w1).start();
        new Thread(r1).start();
    }
}

class Writer implements Runnable{
    private Book book;

    public Writer(Book book){
        this.book = book;
    }
    @Override
    public void run() {
        while(true){
            book.write();
        }
    }
}

class Reader implements Runnable{
    private Book book;

    public Reader(Book book){
        this.book = book;
    }
    @Override
    public void run() {
        while(true){
            book.read();
        }
    }
}

class Book {
    private StringBuffer book = new StringBuffer();
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public void read(){
        rwl.readLock().lock();
        try{
            System.out.println(Thread.currentThread().getName() + " 开始读,内容为："+book.toString());
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            rwl.readLock().unlock();
        }
    }

    public void write(){
        rwl.writeLock().lock();
        try{
            System.out.println(Thread.currentThread().getName() + " 开始写!");
            book.append(Math.random() * 10);
            Thread.sleep(500);
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            rwl.writeLock().unlock();
        }
    }
    public StringBuffer getBook() {
        return book;
    }

    public void setBook(StringBuffer book) {
        this.book = book;
    }

    public ReentrantReadWriteLock getRwl() {
        return rwl;
    }

    public void setRwl(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }
}
