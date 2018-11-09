package ume.com.sweet.ume.com.sweet.models;

public class ChatList {

    private long id;
    private String headurl;
    private long createTime;
    private String msg;

    public ChatList(long id, String headurl, long createTime, String msg) {
        this.id = id;
        this.headurl = headurl;
        this.createTime = createTime;
        this.msg = msg;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(int createTime) {
        this.createTime = createTime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
