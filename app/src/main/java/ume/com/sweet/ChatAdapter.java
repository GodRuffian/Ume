package ume.com.sweet;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import ume.com.sweet.ume.com.sweet.models.ChatList;

/**
 * 消息页面
 */
public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    private List<ChatList> chatList;

    public ChatAdapter(List<ChatList> mChatList) {
     this.chatList = mChatList;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView headurl;
        TextView msg;

        public ViewHolder(View view) {
            super(view);
            headurl = (ImageView) view.findViewById(R.id.chat_listitem_headurl);
            msg =  (TextView) view.findViewById(R.id.chat_listiem_msg);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_listitem, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ChatList chat = chatList.get(position);

//        Glide.with().load(chat.getHeadurl()).into(holder.headurl);
        holder.msg.setText(chat.getMsg());
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }


}
