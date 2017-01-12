package com.acoulson.grabilitytest.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.acoulson.grabilitytest.R;

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
        String item = stringList.get(position);
        holder.txtCategoria.setText(item);
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
