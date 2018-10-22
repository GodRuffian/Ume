package ume.com.sweet.ume.com.sweet.models;

public class ChatMessage {

    private long id;
    private long userId;
    private long toUserId;
    private String content;
    private int messageType;
    private int createdTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getToUserId() {
        return toUserId;
    }

    public void setToUserId(long toUserId) {
        this.toUserId = toUserId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMessageType() {
        return messageType;
    }

    public void setMessageType(int messageType) {
        this.messageType = messageType;
    }

    public int getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(int createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "id=" + id +
                ", userId=" + userId +
                ", toUserId=" + toUserId +
                ", content='" + content + '\'' +
                ", messageType=" + messageType +
                ", createdTime=" + createdTime +
                '}';
    }
}
