package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.ThongTin;
import com.example.myapplication.ThongTinAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView    recyclerView;
    List<ThongTin> thongtin;
    ThongTinAdapter ttAdapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerview);
        ttAdapter = new ThongTinAdapter(this,data());
        recyclerView.setAdapter(ttAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
    public  List<ThongTin> data() {
        List<ThongTin> list = new ArrayList<>();
        for (int i = 0 ; i<=5; i++){
            list.add(new ThongTin(R.drawable.help,"Help ","1. Góp sức làm cho ai việc gì hoặc đem cho ai cái gì đang lúc khó khăn, đang cần đến: giúp bạn Mỗi người giúp một ít tiền giúp cho một tay.\n2. Tác động tích cực, làm cho việc gì tiến triển tốt hơn: Nghị lực giúp chúng ta vượt qua mọi khó khăn, gian khổ."));
            list.add(new ThongTin(R.drawable.play,"Play ","1 Hoạt động giải trí hoặc nghỉ ngơi. Trẻ con chơi ngoài sân. Dạo chơi. Ăn tuỳ nơi, chơi tuỳ lúc (tng.). Dễ như chơi. \n2 Dùng làm thú vui, thú tiêu khiển. Chơi tem. Chơi cá vàng. \n3 Có quan hệ quen biết, gần gũi nhau trên cơ sở cùng chung thú vui, thú tiêu khiển. Chơi thân với nhau từ nhỏ. Chọn bạn mà chơi.\n4. Hoạt động chỉ nhằm cho vui mà thôi, không có mục đích gì khác. Đùa chơi. Nói chơi mà tưởng thật. Mời đến nhà chơi.\n 5. (Trẻ con) tỏ ra khoẻ mạnh, không đau ốm. Cháu chơi, không ốm như dạo trước. \n6. Hành động gây hại cho người khác, nhưng xem như trò vui. Chơi cho một vố. Chơi khăm*."));
            list.add(new ThongTin(R.drawable.scores,"Scores ","Hệ thống thang điểm mang tính quy ước nhằm đánh giá học lực và hạnh kiểm của học sinh. Mỗi nước đều có cách quy định riêng, vd. thang 5 ĐS (của Nga, Hungari, Ba Lan...; 11 ĐS (Italia); 12 ĐS (các nước Bắc Âu); 100 ĐS (Anh); 2.000 ĐS (Mĩ). Ở Việt Nam, thời Pháp thuộc sử dụng thang 20 ĐS; sau Cách mạng tháng Tám, có thời dùng thang 5 ĐS, hiện nay sử dụng thang 10 ĐS."));
        }

        return list;
    }
}