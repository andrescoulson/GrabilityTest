package com.acoulson.grabilitytest.ui;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.acoulson.grabilitytest.Entity.AppEntity;
import com.acoulson.grabilitytest.R;
import com.bumptech.glide.Glide;
import com.mikhaellopez.circularimageview.CircularImageView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class ResumeAppActivity extends AppCompatActivity {

    @Bind(R.id.action_image)
    CircularImageView circularImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_resume_app);

        ButterKnife.bind(this);
        AppEntity appEntity = (AppEntity) getIntent().getExtras().getSerializable("entity");

        Glide.with(this).load(appEntity.getImages().get(2).getUrl()).into(circularImageView);
    }
}
