package com.zhy.sample.adapter;

import android.content.Context;

import com.zhy.base.adapter.ViewHolder;
import com.zhy.base.adapter.recyclerview.MultiItemCommonAdapter;
import com.zhy.base.adapter.recyclerview.MultiItemTypeSupport;
import com.zhy.sample.R;
import com.zhy.sample.bean.ChatMessage;
import com.zhy.sample.bean.KeyValue;

import java.util.List;

/**
 * Created by zhy on 15/9/4.
 */
public class WithHeaderAdapterForRv extends MultiItemCommonAdapter<KeyValue>
{
    public WithHeaderAdapterForRv(Context context, List<KeyValue> datas)
    {
        super(context, datas, new MultiItemTypeSupport<KeyValue>()
        {
            @Override
            public int getLayoutId(int itemType)
            {
                if (itemType == KeyValue.HEADER)
                {
                    return R.layout.header;
                } else
                    return R.layout.item_list2;
            }

            @Override
            public int getItemViewType(int postion, KeyValue msg)
            {
                if (msg.isHeader())
                {
                    return KeyValue.HEADER;
                }
                return KeyValue.KEY_VALUE;
            }
        });
    }

    @Override
    public void convert(ViewHolder holder, KeyValue keyValue)
    {

        switch (holder.getLayoutId())
        {
            case R.layout.header:
                holder.setText(R.id.id_header_title, keyValue.getKey());
//                holder.setText(R.id.chat_from_content, chatMessage.getContent());
//                holder.setText(R.id.chat_from_name, chatMessage.getName());
//                holder.setImageResource(R.id.chat_from_icon, chatMessage.getIcon());
                break;
            case R.layout.item_list2:
                holder.setText(R.id.tv_key, keyValue.getKey());
                holder.setText(R.id.tv_value, keyValue.getValue());
//                holder.setText(R.id.chat_send_content, chatMessage.getContent());
//                holder.setText(R.id.chat_send_name, chatMessage.getName());
//                holder.setImageResource(R.id.chat_send_icon, chatMessage.getIcon());
                break;
        }
    }
}
