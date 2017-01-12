package com.acoulson.grabilitytest.mvp.cateogry;

import com.acoulson.grabilitytest.adapters.CategoryRecyclerApdater;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by acoulson on 11/01/17.
 */

public interface ICategoryView {

    public void generarLinearLayout();

    public CategoryRecyclerApdater crearAdapter(List<String> categorias);

    public void inicializarAdapter(CategoryRecyclerApdater apdater);
}
