package com.example.ham.text2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ZodiacActivity extends AppCompatActivity {

    private EditText NgayNam, ThangNam, NgayNu, ThangNu;
    private Integer nNam,nNu,tNam,tNu;
    private Button Ketqua;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac);
    }

    private void init(){
        NgayNam = (EditText) findViewById(R.id.eNgayNam);
        NgayNu= (EditText) findViewById(R.id.eNgayNu);
        ThangNam=(EditText) findViewById(R.id.eThangNam);
        ThangNu=(EditText) findViewById(R.id.eThangNu);
        Ketqua=(Button) findViewById(R.id.eGet);
    }

    private void getData(){
        nNam=Integer.parseInt(NgayNam.getText().toString());
        nNu=Integer.parseInt(NgayNu.getText().toString());
        tNam=Integer.parseInt(ThangNam.getText().toString());
        tNu=Integer.parseInt(ThangNu.getText().toString());
    }

    int getZodiac(int Ngay, int Thang){
        if ((Thang == 1 && Ngay >= 20 && Ngay<=28) || (Thang==2 && (Ngay <= 18) ))
            return 11;
        if ((Thang == 2 && Ngay >= 19 && Ngay<=31 ) || (Thang==3 && (Ngay <= 20) ))
            return 12;
        if ((Thang == 3 && Ngay >= 21 && Ngay<=30 ) || (Thang==4 && (Ngay <= 19) ))
            return 1;
        if ((Thang == 4 && Ngay >= 20 && Ngay<=31) || (Thang==5 && (Ngay <= 20) ))
            return 2;
        if ((Thang == 5 && Ngay >= 21 && Ngay<=30) || (Thang==6 && (Ngay <= 21) ))
            return 3;
        if ((Thang == 6 && Ngay >= 22 && Ngay<=31) || (Thang==7 && (Ngay <= 22) ))
            return 4;
        if ((Thang == 7 && Ngay >= 23 && Ngay<=30) || (Thang==8 && (Ngay <= 22) ))
            return 5;
        if ((Thang == 8 && Ngay >= 23 && Ngay<=31) || (Thang==9 && (Ngay <= 22) ))
            return 6;
        if ((Thang == 9 && Ngay >= 23 && Ngay<=30) || (Thang==10 && (Ngay <= 23) ))
            return 7;
        if ((Thang == 10 && Ngay >= 24 && Ngay<=31) || (Thang==11 && (Ngay <= 21) ))
            return 8;
        if ((Thang == 11 && Ngay >= 22 && Ngay<=30) || (Thang== 12 && (Ngay <= 21) ))
            return 9;
        if ((Thang == 12 && Ngay >= 22 && Ngay<=31) || (Thang== 1 && (Ngay <= 19) ))
            return 10;
        return 0;
    }

    String checkZodiac(int nnam,int nnu,int tnam,int tnu){
        String [] Z= new String[11];
        Z[0]="Bảo Bình";
        Z[1]="Song Ngư";
        Z[2]="Bạch Dương";
        Z[3]="Kim Ngưu";
        Z[4]="Song Tử";
        Z[5]="Cự Giải";
        Z[6]="Sư Tử";
        Z[7]="Xử Nữ";
        Z[8]="Thiên Bình";
        Z[9]="Thiên Yết";
        Z[10]="Nhân Mã";
        Z[11]="Ma Kết";
        if (getZodiac(nnam,tnam)== 0)
            return "Something wrong.";
        return Z[getZodiac(nnam,tnam)];
    }

}
