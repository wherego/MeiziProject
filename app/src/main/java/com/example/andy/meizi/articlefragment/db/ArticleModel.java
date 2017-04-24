package com.example.andy.meizi.articlefragment.db;

import com.example.andy.meizi.meizifragment.db.MeiziDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * article table
 * Created by andy on 17-4-24.
 */

@Table(database = MeiziDatabase.class)
public class ArticleModel extends BaseModel {
    @PrimaryKey(autoincrement = true)
    long id;
    @Column
    String title;
    @Column
    String author;
    @Column
    String content;
}

