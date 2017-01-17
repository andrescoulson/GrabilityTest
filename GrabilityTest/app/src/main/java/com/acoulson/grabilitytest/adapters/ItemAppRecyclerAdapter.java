package com.acoulson.grabilitytest.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.acoulson.grabilitytest.Entity.AppEntity;
import com.acoulson.grabilitytest.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.github.siyamed.shapeimageview.OctogonImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Andres on 11/01/2017.
 */

public class ItemAppRecyclerAdapter extends RecyclerView.Adapter<ItemAppRecyclerAdapter.ViewHolder> {

    Context context;
    List<AppEntity> appEntities = new ArrayList<>();

    public ItemAppRecyclerAdapter(List<AppEntity> appEntities, Context context) {
        this.appEntities = appEntities;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        return new ItemAppRecyclerAdapter.ViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),R.layout.item_app, parent, false).getRoot());
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        AppEntity appEntity = appEntities.get(position);
        holder.title_app.setText(appEntity.getName().getName());
        holder.txtsummary.setText(appEntity.getSummary().getSummary());
        Glide.with(context).load(appEntity.getImages().get(2).getUrl()).diskCacheStrategy(DiskCacheStrategy.ALL).into(holder.flag_item);
        holder.txtfabricante.setText(appEntity.getRights().getRights());
        holder.txtcosto.setText(appEntity.getPrice().getPriceAtributos().getAmount().equals("0.00000") ? "Free" : appEntity.getPrice().getPriceAtributos().getAmount()
                +" "+appEntity.getPrice().getPriceAtributos().getCurrency());
    }

    @Override
    public int getItemCount() {
        return appEntities.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.txtsummary)
        TextView txtsummary;
        @Bind(R.id.title_app)
        TextView title_app;
        @Bind(R.id.txtcosto)
        TextView txtcosto;
        @Bind(R.id.txtfabricante)
        TextView txtfabricante;
        @Bind(R.id.flag_item)
        OctogonImageView flag_item;

        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }


    }
}
