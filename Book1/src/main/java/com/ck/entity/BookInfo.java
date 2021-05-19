package com.ck.entity;


import java.util.Date;

/**
 * @Author 钟婷婷
 * @Date
 */
public class BookInfo {
    private int bid;
    private String bname;
    private Double bprice;
    private int btid;
    private Date dtime;
    private String imgurl;
    private int state;

    private BookType bookType;

    @Override
    public String toString() {
        return "BookInfo{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", bprice=" + bprice +
                ", btid=" + btid +
                ", dtime=" + dtime +
                ", imgurl='" + imgurl + '\'' +
                ", state=" + state +
                ", bookType=" + bookType +
                '}';
    }

    public BookInfo(int bid, String bname, Double bprice, int btid, Date dtime, String imgurl, int state, BookType bookType) {
        this.bid = bid;
        this.bname = bname;
        this.bprice = bprice;
        this.btid = btid;
        this.dtime = dtime;
        this.imgurl = imgurl;
        this.state = state;
        this.bookType = bookType;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Double getBprice() {
        return bprice;
    }

    public void setBprice(Double bprice) {
        this.bprice = bprice;
    }

    public int getBtid() {
        return btid;
    }

    public void setBtid(int btid) {
        this.btid = btid;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }
}
