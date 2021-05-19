package com.ck.entity;

import java.util.List;

/**
 * @Author 钟婷婷
 * @Date
 */
public class BookType {
    private int btid;
    private String btime;

    private List<BookInfo> bookInfoList;

    @Override
    public String toString() {
        return "BookType{" +
                "btid=" + btid +
                ", btime='" + btime + '\'' +
                ", bookInfoList=" + bookInfoList +
                '}';
    }

    public BookType(int btid, String btime, List<BookInfo> bookInfoList) {
        this.btid = btid;
        this.btime = btime;
        this.bookInfoList = bookInfoList;
    }

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime;
    }

    public List<BookInfo> getBookInfoList() {
        return bookInfoList;
    }

    public void setBookInfoList(List<BookInfo> bookInfoList) {
        this.bookInfoList = bookInfoList;
    }
}
