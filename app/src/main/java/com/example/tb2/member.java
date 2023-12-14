package com.example.tb2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class member extends AppCompatActivity {

    RecyclerView recyclerView;
    List<String> abcd;
    List<Integer> abcdImage;
    List<String> abcdStatus;
    List<String> abcdShow;
    Adapter adapter;

    ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Member");

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.recyclerview);
        abcd = new ArrayList<>();
        abcdImage = new ArrayList<>();
        abcdShow = new ArrayList<>();
        abcdStatus = new ArrayList<>();

        abcd.add("Freya");
        abcd.add("Flora");
        abcd.add("Marsha");
        abcd.add("Kathrina");
        abcd.add("Adel");
        abcd.add("Fiony");
        abcd.add("Christy");
        abcd.add("Gita");
        abcd.add("Ashel");
        abcd.add("Shani");
        abcd.add("Gracia");
        abcd.add("Feni");
        abcd.add("Siska");
        abcd.add("Lulu");
        abcd.add("Azizi");
        abcd.add("Muthe");
        abcd.add("Indah");
        abcd.add("Chika");
        abcd.add("Jesslyn");
        abcd.add("Oniel");
        abcd.add("Jessi");
        abcd.add("Olla");
        abcd.add("Eli");
        abcd.add("Ella");

        abcdImage.add(R.drawable.freya);
        abcdImage.add(R.drawable.flora);
        abcdImage.add(R.drawable.marsha);
        abcdImage.add(R.drawable.kathrina_irene);
        abcdImage.add(R.drawable.reva_fidela);
        abcdImage.add(R.drawable.fiony);
        abcdImage.add(R.drawable.christy);
        abcdImage.add(R.drawable.gita_sekar_andarini);
        abcdImage.add(R.drawable.ashel);
        abcdImage.add(R.drawable.shani_indira_natio);
        abcdImage.add(R.drawable.shania_gracia);
        abcdImage.add(R.drawable.feni_fitriyanti);
        abcdImage.add(R.drawable.fransisca_saraswati_puspa_dewi);
        abcdImage.add(R.drawable.lulu_salsabila);
        abcdImage.add(R.drawable.azizi_asadel);
        abcdImage.add(R.drawable.mutiara_azzahra);
        abcdImage.add(R.drawable.indah_cahya);
        abcdImage.add(R.drawable.yessica_tamara);
        abcdImage.add(R.drawable.jesslyn_callista);
        abcdImage.add(R.drawable.cornelia_vanisa);
        abcdImage.add(R.drawable.jessica_chandra);
        abcdImage.add(R.drawable.febriola_sinambela);
        abcdImage.add(R.drawable.helisma_putri);
        abcdImage.add(R.drawable.gabriela_abigail);


        abcdShow.add("267 Show");
        abcdShow.add("167 Show");
        abcdShow.add("166 Show");
        abcdShow.add("241 Show");
        abcdShow.add("198 Show");
        abcdShow.add("267 Show");
        abcdShow.add("206 Show");
        abcdShow.add("158 Show");
        abcdShow.add("150 Show");
        abcdShow.add("691 Show");
        abcdShow.add("671 Show");
        abcdShow.add("707 Show");
        abcdShow.add("708 Show");
        abcdShow.add("225 Show");
        abcdShow.add("215 Show");
        abcdShow.add("270 Show");
        abcdShow.add("146 Show");
        abcdShow.add("229 Show");
        abcdShow.add("179 Show");
        abcdShow.add("212 Show");
        abcdShow.add("291 Show");
        abcdShow.add("242 Show");
        abcdShow.add("249 Show");
        abcdShow.add("63 Show");



        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");
        abcdStatus.add("Member");

        adapter = new Adapter(this, abcd, abcdImage, abcdShow, abcdStatus);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 4, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}