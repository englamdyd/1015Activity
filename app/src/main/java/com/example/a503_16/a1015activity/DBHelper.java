package com.example.a503_16.a1015activity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context){
        //첫번째는 Context, 두번째는 저장 될 파일명, 세번째는 Cusor를 직접 만든 경우 지정, 네번째는 버전
        super(context, "datavase.sqlite3", null, 1);

    }

    //데이터베이스를 처음 사용할려고 할 때 한번 호출되는 메소드 (마우스 오른쪽 눌러서 제너레이트 -임플리먼츠 - 오케이)
    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "create table tb_data("+"id_ integer primary key autoincrement, " + "category text, " + "location text)";
        db.execSQL(sql);

        db.execSQL("insert into tb_data(category, location)" + "values('서울특별시', '강남구')");
        db.execSQL("insert into tb_data(category, location)" + "values('서울특별시', '서초구')");
        db.execSQL("insert into tb_data(category, location)" + "values('서울특별시', '어쩌구')");
        db.execSQL("insert into tb_data(category, location)" + "values('서울특별시', '저쩌구')");
        db.execSQL("insert into tb_data(category, location)" + "values('성남시', '분당구')");
        db.execSQL("insert into tb_data(category, location)" + "values('성남시', '수정구')");
        db.execSQL("insert into tb_data(category, location)" + "values('성남시', '어절씨구')");
        db.execSQL("insert into tb_data(category, location)" + "values('성남시', '저절씨구')");
        db.execSQL("insert into tb_data(category, location)" + "values('수원시', '영통구')");
        db.execSQL("insert into tb_data(category, location)" + "values('수원시', '장안구')");
        db.execSQL("insert into tb_data(category, location)" + "values('수원시', '방구')");
        db.execSQL("insert into tb_data(category, location)" + "values('수원시', '똥구')");
        db.execSQL("insert into tb_data(category, location)" + "values('용인시', '구성읍')");
        db.execSQL("insert into tb_data(category, location)" + "values('용인시', '처인구')");
        db.execSQL("insert into tb_data(category, location)" + "values('용인시', '축구')");
        db.execSQL("insert into tb_data(category, location)" + "values('용인시', '족구')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldversion, int newversion) {
        //테이블을 삭제하고 다시 생성
        db.execSQL("drop table tb_data");
        onCreate(db);
    }
}

