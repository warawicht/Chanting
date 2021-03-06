package com.example.toon.chanting;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    String[] chantingDetails = new String[]{
            "อะระหัง สัมมาสัมพุทโธ ภะคะวา, พุทธัง ภะคะวันตัง อะภิวาเทมิ ฯ (กราบ)\n" +
                    "สวากขาโต ภะคะวะตา ธัมโม, ธัมมัง นะมัสสามิ ฯ (กราบ)\n" +
                    "สุปะฏิปันโน ภะคะวะโต สาวะกะสังโฆ, สังฆัง นะมามิ ฯ (กราบ)",
            "อะหัง ภันเต, ติสะระเณนะ สะหะ, ปัญจะ สีลานิ ยาจามิ\n" +
                    "ทุติยัมปิ อะหัง ภันเต, ติสะระเณนะ สะหะ, ปัญจะ สีลานิ ยาจามิ\n" +
                    "ตะติยัมปิ อะหัง ภันเต, ติสะระเณนะ สะหะ, ปัญจะ สีลานิ ยาจามิ",
            "นะโม ตัสสะ ภะคะวะโต, อะระหะโต, สัมมาสัมพุทธัสสะ (กล่าว 3 จบ)",
            "พุทธัง สะระณัง คัจฉามิ\n" +
                    "ธัมมัง สะระณัง คัจฉามิ\n" +
                    "สังฆัง สะระณัง คัจฉามิ\n" +
                    "ทุติยัมปิ พุทธัง สะระณัง คัจฉามิ\n" +
                    "ทุติยัมปิ ธัมมัง สะระณัง คัจฉามิ\n" +
                    "ทุติยัมปิ สังฆัง สะระณัง คัจฉามิ\n" +
                    "ตะติยัมปิ พุทธัง สะระณัง คัจฉามิ\n" +
                    "ตะติยัมปิ ธัมมัง สะระณัง คัจฉามิ\n" +
                    "ตะติยัมปิ สังฆัง สะระณังคัจฉามิ",
            "ปาณาติปาตา เวระมณี สิกขาปะทัง สะมาทิยามิ\n" +
                    "อทินนาทานา เวระมณี สิกขาปะทัง สะมาทิยามิ\n" +
                    "กาเมสุมิจฉาจารา เวระมณี สิกขาปะทัง สะมาทิยามิ\n" +
                    "มุสาวาทา เวระมณี สิกขาปะทัง สะมาทิยามิ\n" +
                    "สุราเมระยะมัชชะปะมาทัฏฐานา เวระมณี สิกขาปะทัง สะมาทิยามิ",
            "ข้าพเจ้าขอตั้งจิตอธิษฐานว่า ต่อแต่นี้ไปข้าพเจ้าจะขอรักษาศีล 5 ให้บริสุทธิ์ดังเดิม",
            "อิมานิ ปัญจะ สิกขาปะทานิ สะมาทิยามิ (กล่าว 3 จบ)",
            "กราบพระพุทธ พระธรรม พระสงฆ์\n" +
                    "\n" +
                    "อะหัง สุขิโต โหมิ ขอให้ข้าพเจ้ามีความสุข\n" +
                    "นิททุกโข โหมิ ปราศจากความทุกข์\n" +
                    "อะเวโร โหมิ ปราศจากเวร\n" +
                    "อัพยาปัชโฌ โหมิ ปราศจากอุปสรรคอันตรายทั้งปวง\n" +
                    "อะนีโฆ โหมิ ปราศจากความทุกข์การทุกข์ใจ\n" +
                    "สุขี อัตตานัง ปะริหะรามิ มีความสุขกายสุขใจรักษาตนให้พ้นจากทุกภัยทั้งสิ้นเถิด",
            "สัพเพ สัตตา สัตว์ทั้งหลายที่เป็นเพื่อนทุกข์ เกิดแก่เจ็บตาย ด้วยกันทั้งหมดทั้งสิ้น\n" +
                    "อะเวรา โหนตุ จงเป็นสุขเป็นสุขเถิด อย่าได้มีเวรแก่กันและกันเลย\n" +
                    "อัพะยาปัชฌา โหนตุ จงเป็นสุขเป็นสุขเถิด อย่าได้เบียดเบียนซึ่งกันและกันเลย\n" +
                    "อะนีฆา โหนตุ จงเป็นสุขเป็นสุขเถิด อย่าได้มีความทุกข์กาย ทุกข์ใจเลย\n" +
                    "สุขี อัตตานัง ปะริหะรันตุ จงมีความสุขกาย สุขใจ รักษาตนให้พ้นจากทุกข์ภัยทั้งสิ้นเถิด",
            "อิทัง เม มาตาปิตูนัง โหตุ สุขิตา โหนตุ มาตาปิตะโร\n" +
                    "คำแปล: ขอส่วนบุญนี้จงสำเร็จแก่บิดามารดาของข้าพเจ้า ขอให้บิดามารดาของข้าพเจ้ามีความสุข\n" +
                    "\n" +
                    "อิทัง เม ญาตีนัง โหตุ สุขิตา โหนตุ ญาตะโย\n" +
                    "คำแปล: ขอส่วนบุญนี้จงสำเร็จแก่ญาติทั้งหลายของข้าพเจ้า ขอให้ญาติทั้งหลายของรข้าพเจ้ามีความสุข\n" +
                    "\n" +
                    "อิทัง เม คุรูปัชฌายาจริยานัง โหตุ สุขิตา โหนตุ คุรูปัชฌายาจริยา\n" +
                    "คำแปล: ขอส่วนบุญนี้จงสำเร็จแก่ครูอุปัชฌาย์อาจารย์ของข้าพเจ้า ขอให้ครูอุปัชฌาย์อาจารย์ของข้าพเจ้ามีความสุข\n" +
                    "\n" +
                    "อิทัง สัพพะเทวะตานัง โหตุ สุขิตา โหนตุ สัพเพ เทวา\n" +
                    "คำแปล: ขอส่วนบุญนี้จงสำเร็จแก่เทวดาทั้งหลายทั้งปวง ขอให้เทวดาทั้งหลายทั้งปวงมีความสุข\n" +
                    "\n" +
                    "อิทัง สัพพะเปตานัง โหตุ สุขิตา โหนตุ สัพเพ เปตา\n" +
                    "คำแปล: ขอส่วนบุญนี้จงสำเร็จแก่เปรตทั้งหลายทั้งปวง ขอให้เปรตทั้งหลายทั้งปวงมีความสุข\n" +
                    "\n" +
                    "อิทัง สัพพะเวรีนัง โหตุ สุขิตา โหนตุ สัพเพ เวรี\n" +
                    "คำแปล: ขอส่วนบุญนี้จงสำเร็จแก่เจ้ากรรมนายเวรทั้งหลายทั้งปวง ขอให้เจ้ากรรมนายเวรทั้งหลายทั้งปวงมีความสุข\n" +
                    "\n" +
                    "อิทัง สัพพะสัตตานัง โหตุ สุขิตา โหนตุ สัพเพ สัตตา\n" +
                    "คำแปล: ขอส่วนบุญนี้จงสำเร็จแก่สัตว์ทั้งหลายทั้งปวง ขอให้สัตว์ทั้งหลายทั้งปวงมีความสุขทั่วหน้ากันเทอญ."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView tvChantingDetail = (TextView) findViewById(R.id.tvChantingDetail);

        Intent mainIntent = getIntent();
        String id = mainIntent.getStringExtra("ID");
        tvChantingDetail.setText(chantingDetails[Integer.valueOf(id)]);

        String title = mainIntent.getStringExtra("TITLE");
        setTitle(title);

    }

}
