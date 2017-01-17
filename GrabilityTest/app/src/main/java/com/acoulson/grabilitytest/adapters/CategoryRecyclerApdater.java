package com.acoulson.grabilitytest.adapters;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.acoulson.grabilitytest.R;
import com.acoulson.grabilitytest.ui.CategoriesActivity;
import com.acoulson.grabilitytest.ui.StartActivity;
import com.liuguangqiang.ripplelayout.Ripple;
import com.liuguangqiang.ripplelayout.RippleLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by acoulson on 12/01/17.
 */

public class CategoryRecyclerApdater extends RecyclerView.Adapter<CategoryRecyclerApdater.ViewHolder> {

    Context context;
    List<String> stringList = new ArrayList<>();


    public CategoryRecyclerApdater(Context context, List<String> stringList) {
        this.context = context;
        this.stringList = stringList;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        return new CategoryRecyclerApdater.ViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_category, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final String item = stringList.get(position);
        holder.txtCategoria.setText(item);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                context.startActivity(new Intent(context, StartActivity.class).putExtra("categoria", item));
                ((CategoriesActivity) context).overridePendingTransition(R.anim.activity_in, R.anim.activity_out);
            }
        });
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;
        @Bind(R.id.txt_categoria)
        TextView txtCategoria;


        public ViewHolder(ViewDataBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;

            ButterKnife.bind(this, itemView.getRoot());
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }
}
