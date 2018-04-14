package com.chun;

import java.util.Date;

public class Book implements Comparable<Book>{
    private String title;
    private Date publishDate;
    private String comment;

    /**
     * 等価判定
     * @param o 判定対象オブジェクト
     * @return 等価ならtrue、そうでないならfalse
     */
    public boolean equals(Object o){
        if(o == this) return true;
        if(o == null) return false;
        if(!(o instanceof Book)) return false;

        Book book = ((Book) o);

        if(this.title.equals(book.title) && this.publishDate.equals(book.publishDate)){
            return  true;
        }else{
            return false;
        }
    }

    /**
     * ハッシュ作成
     * @return 生成したハッシュ値
     */
    public int hashcode(){
        int result = 37;
        result = result * 31 + title.hashCode();
        result = result * 31 + comment.hashCode();

        return result;
    }

    /**
     * 比較
     * @param book　比較対象のbookクラス
     * @return 比較結果
     */
    public int compareTo(Book book) {
        return this.publishDate.compareTo(book.publishDate);
    }

    /**
     * クローン作成
     * @return 生成したクローン
     */
    public Book clone(){
        Book newBook = new Book();
        newBook.title = this.title;
        newBook.comment = this.comment;

        newBook.publishDate = (Date)this.publishDate.clone();

        return newBook;
    }
}
