package ume.com.sweet;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import ume.com.sweet.ume.com.sweet.models.Chat;

/**
 * 消息页面
 */
public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    private List<Chat> chatList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView headurl;
        TextView msg;

        public ViewHolder(View view) {
            super(view);

            headurl = (ImageView) view.findViewById(R.id.);
        }
    }
}
