package com.acoulson.grabilitytest.mvp.start;

import com.acoulson.grabilitytest.Entity.AppEntity;
import com.acoulson.grabilitytest.adapters.ItemAppRecyclerAdapter;

import java.util.List;

/**
 * Created by acoulson on 11/01/17.
 */

public interface IStartView {

    public void generarLinearLayout();

    public void showTitle(String title);

    public ItemAppRecyclerAdapter crearAdapter(List<AppEntity> appEntities);

    public void inicializarAdapter(ItemAppRecyclerAdapter appRecyclerAdapter);


}
