package com.chun;

public class StrongBox<E>{

    public static enum KeyType{
        PADLOCK, BUTTON, DIAL, FINGER;
    }

    private E       data;   // インスタンス
    private KeyType kType;  // 鍵のタイプ(列挙型)
    private long    count;  // 回数

    // コンストラクタ
    public StrongBox(KeyType kType){
        this.kType = kType;
    }

    public E get(){
        this.count++;

        switch(this.kType){
            case PADLOCK:
                if(this.count < 1024) return null;
                break;
            case BUTTON:
                if(this.count < 10000) return null;
                break;
            case DIAL:
                if(this.count < 30000) return null;
                break;
            case FINGER:
                if(this.count < 1000000) return null;
                break;
        }

        this.count = 0;
        return this.data;
    }

    public void set(E data){
        this.data = data;
    }
}
