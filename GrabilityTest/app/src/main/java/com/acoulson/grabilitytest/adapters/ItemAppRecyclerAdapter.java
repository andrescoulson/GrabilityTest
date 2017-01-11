package com.acoulson.grabilitytest.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.acoulson.grabilitytest.R;

/**
 * Created by Andres on 11/01/2017.
 */

public class ItemAppRecyclerAdapter extends RecyclerView.Adapter<ItemAppRecyclerAdapter.ViewHolder> {

    Context context;

    public ItemAppRecyclerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        return new ItemAppRecyclerAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_app, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {


    }

    @Override
    public int getItemCount() {
        return 7;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {


        public ViewHolder(View itemView) {
            super(itemView);


        }


    }
}
