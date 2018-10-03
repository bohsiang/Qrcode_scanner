package com.example.user.qrcode_mysql;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ViewActivity extends Activity implements View.OnClickListener {
    Button buttonview;
    Biodata biodata = new Biodata();
    TableLayout tabelBiodata;

    Button buttonTambahBiodata;
    ArrayList<Button> buttonEdit = new ArrayList<Button>();
    ArrayList<Button> buttonDelete = new ArrayList<Button>();

    JSONArray arrayBiodata;
    JSONArray arraydata;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        buttonview = (Button) findViewById(R.id.btnview_2);
        buttonview.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
// TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(ViewActivity.this, MainActivity.class);
                startActivity(intent);
                ViewActivity.this.finish();
            }
        });


        tabelBiodata = (TableLayout) findViewById(R.id.tableBiodata);

        buttonTambahBiodata = (Button) findViewById(R.id.buttoninsert);
        buttonTambahBiodata.setOnClickListener(this);

        TableRow barisTabel = new TableRow(this);


        barisTabel.setBackgroundColor(Color.CYAN);

        TextView viewHeaderId = new TextView(this);
        TextView viewHeadergoods = new TextView(this);
        TextView viewHeadercompany = new TextView(this);
        TextView viewHeadermaterial1 = new TextView(this);
        TextView viewHeaderlocation1 = new TextView(this);
        TextView viewHeadermaterial2 = new TextView(this);
        TextView viewHeaderlocation2 = new TextView(this);
        TextView viewHeadertime = new TextView(this);
        TextView viewHeaderAction = new TextView(this);

        viewHeaderId.setText("ID");
        viewHeaderId.setTextSize(28);
        viewHeadergoods.setText("goods");
        viewHeadergoods.setTextSize(28);
        viewHeadercompany.setText("company");
        viewHeadercompany.setTextSize(28);
        viewHeadermaterial1.setText("material1");
        viewHeadermaterial1.setTextSize(28);
        viewHeaderlocation1.setText("location1");
        viewHeaderlocation1.setTextSize(28);
        viewHeadermaterial2.setText("material2");
        viewHeadermaterial2.setTextSize(28);
        viewHeaderlocation2.setText("location2");
        viewHeaderlocation2.setTextSize(28);
        viewHeadertime.setText("time");
        viewHeadertime.setTextSize(28);
        viewHeaderAction.setText("Action");
        viewHeaderAction.setTextSize(28);

        viewHeaderId.setPadding(10, 1, 10, 1);
        viewHeadergoods.setPadding(10, 1, 10, 1);
        viewHeadercompany.setPadding(10, 1, 10, 1);
        viewHeadermaterial1.setPadding(10, 1, 10, 1);
        viewHeaderlocation1.setPadding(10, 1, 10, 1);
        viewHeadermaterial2.setPadding(10, 1, 10, 1);
        viewHeaderlocation2.setPadding(10, 1, 10, 1);
        viewHeadertime.setPadding(10, 1, 10, 1);
        viewHeaderAction.setPadding(10, 1, 10, 1);

        barisTabel.addView(viewHeaderId);
        barisTabel.addView(viewHeadergoods);
        barisTabel.addView(viewHeadercompany);
        barisTabel.addView(viewHeadermaterial1);
        barisTabel.addView(viewHeaderlocation1);
        barisTabel.addView(viewHeadermaterial2);
        barisTabel.addView(viewHeaderlocation2);
        barisTabel.addView(viewHeadertime);
        barisTabel.addView(viewHeaderAction);

        tabelBiodata.addView(barisTabel, new TableLayout.LayoutParams(ViewPager.LayoutParams.WRAP_CONTENT,
                ViewPager.LayoutParams.WRAP_CONTENT));
        try {

            arrayBiodata = new JSONArray(biodata.tampilBiodata());

            for (int i = 0; i < arrayBiodata.length(); i++) {
                JSONObject jsonChildNode = arrayBiodata.getJSONObject(i);
                String goods = jsonChildNode.optString("goods");
                String company = jsonChildNode.optString("company");
                String material1 = jsonChildNode.optString("material1");
                String location1 = jsonChildNode.optString("location1");
                String material2 = jsonChildNode.optString("material2");
                String location2 = jsonChildNode.optString("location2");
                String time = jsonChildNode.optString("time");
                String id = jsonChildNode.optString("id");


                System.out.println("goods :" + goods);
                System.out.println("company :" + company);
                System.out.println("material1 :" + material1);
                System.out.println("location1 :" + location1);
                System.out.println("material2 :" + material2);
                System.out.println("location2 :" + location2);
                System.out.println("time :" + time);
                System.out.println("id :" + id);

                barisTabel = new TableRow(this);


                if (i % 2 == 0) {
                    barisTabel.setBackgroundColor(Color.LTGRAY);
                }
                TextView viewId = new TextView(this);
                viewId.setText(id);
                viewId.setTextSize(18);
                viewId.setPadding(10, 1, 10, 1);
                barisTabel.addView(viewId);

                TextView viewgoods = new TextView(this);
                viewgoods.setText(goods);
                viewgoods.setTextSize(18);
                viewgoods.setPadding(10, 1, 10, 1);
                barisTabel.addView(viewgoods);

                TextView viewcompany = new TextView(this);
                viewcompany.setText(company);
                viewcompany.setTextSize(18);
                viewcompany.setPadding(10, 1, 10, 1);
                barisTabel.addView(viewcompany);

                TextView viewmaterial1 = new TextView(this);
                viewmaterial1.setText(material1);
                viewmaterial1.setTextSize(18);
                viewmaterial1.setPadding(10, 1, 10, 1);
                barisTabel.addView(viewmaterial1);

                TextView viewlocation1 = new TextView(this);
                viewlocation1.setText(location1);
                viewlocation1.setTextSize(18);
                viewlocation1.setPadding(10, 1, 10, 1);
                barisTabel.addView(viewlocation1);

                TextView viewmaterial2 = new TextView(this);
                viewmaterial2.setText(material2);
                viewmaterial2.setTextSize(18);
                viewmaterial2.setPadding(10, 1, 10, 1);
                barisTabel.addView(viewmaterial2);

                TextView viewlocation2 = new TextView(this);
                viewlocation2.setText(location2);
                viewlocation2.setTextSize(18);
                viewlocation2.setPadding(10, 1, 10, 1);
                barisTabel.addView(viewlocation2);
                tabelBiodata.addView(barisTabel, new TableLayout.LayoutParams(ViewPager.LayoutParams.MATCH_PARENT,
                        ViewPager.LayoutParams.MATCH_PARENT));

            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
        public void onClick(View view) {

            if (view.getId() == R.id.buttoninsert) {
                // Toast.makeText(MainActivity.this, "Button Tambah Data",
                // Toast.LENGTH_SHORT).show();

                tambahBiodata();

            } else {
   /*
    * Melakukan pengecekan pada data array, agar sesuai dengan index
    * masing-masing button
    */
                for (int i = 0; i < buttonEdit.size(); i++) {

    /* jika yang diklik adalah button edit */
                    if (view.getId() == buttonEdit.get(i).getId() && view.getTag().toString().trim().equals("Edit")) {
                        // Toast.makeText(MainActivity.this, "Edit : " +
                        // buttonEdit.get(i).getId(), Toast.LENGTH_SHORT).show();
                        int id = buttonEdit.get(i).getId();
                        getDataByID(id);

                    } /* jika yang diklik adalah button delete */
                    else if (view.getId() == buttonDelete.get(i).getId() && view.getTag().toString().trim().equals("Delete")) {
                        // Toast.makeText(MainActivity.this, "Delete : " +
                        // buttonDelete.get(i).getId(), Toast.LENGTH_SHORT).show();
                        int id = buttonDelete.get(i).getId();
                        deleteBiodata(id);

                    }
                }
            }
        }
        public void deleteBiodata(int id) {
            biodata.deleteBiodata(id);

  /* restart acrtivity */
            finish();
            startActivity(getIntent());

        }
    public void getDataByID(int id) {

        String goodsEdit = null, companyEdit = null, material1Edit = null, material2Edit = null, location1Edit = null, location2Edit = null, time = null;
        JSONArray arrayPersonal;

        try {

            arrayPersonal = new JSONArray(biodata.getBiodataById(id));

            for (int i = 0; i < arrayPersonal.length(); i++) {
                JSONObject jsonChildNode = arrayPersonal.getJSONObject(i);
                goodsEdit = jsonChildNode.optString("goods");
                companyEdit = jsonChildNode.optString("company");
                material1Edit = jsonChildNode.optString("material1");
                location1Edit = jsonChildNode.optString("location1");
                material2Edit = jsonChildNode.optString("material2");
                location2Edit = jsonChildNode.optString("location2");
                time = jsonChildNode.optString("time");
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        LinearLayout layoutInput = new LinearLayout(this);
        layoutInput.setOrientation(LinearLayout.VERTICAL);

        // buat id tersembunyi di alertbuilder
        final TextView viewId = new TextView(this);
        viewId.setText(String.valueOf(id));
        viewId.setTextColor(Color.TRANSPARENT);
        layoutInput.addView(viewId);

        final EditText editgoods = new EditText(this);
        editgoods.setHint("goods");
        editgoods.setText(goodsEdit);
        layoutInput.addView(editgoods);

        final EditText editcompany = new EditText(this);
        editcompany.setHint("company");
        editcompany.setText(companyEdit);
        layoutInput.addView(editcompany);

        final EditText editmaterial1 = new EditText(this);
        editmaterial1.setHint("material1");
        editmaterial1.setText(material1Edit);
        layoutInput.addView(editmaterial1);

        final EditText editlocation1 = new EditText(this);
        editlocation1.setHint("location1");
        editlocation1.setText(location1Edit);
        layoutInput.addView(editlocation1);

        final EditText editmaterial2 = new EditText(this);
        editmaterial2.setHint("material2");
        editmaterial2.setText(material2Edit);
        layoutInput.addView(editmaterial2);

        final EditText editlocation2 = new EditText(this);
        editlocation2.setHint("location2");
        editlocation2.setText(location2Edit);
        layoutInput.addView(editlocation2);


        AlertDialog.Builder builderEditBiodata = new AlertDialog.Builder(this);
        //builderEditBiodata.setIcon(R.drawable.batagrams);
        builderEditBiodata.setTitle("Update");
        builderEditBiodata.setView(layoutInput);
        builderEditBiodata.setPositiveButton("Update", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss");
                Date curDate = new Date(System.currentTimeMillis()) ; // 獲取當前時間
                String str = formatter.format(curDate);

                String goods = editgoods.getText().toString();
                String company = editcompany.getText().toString();
                String material1 = editmaterial1.getText().toString();
                String location1 = editlocation1.getText().toString();
                String material2 = editmaterial2.getText().toString();
                String location2 = editlocation2.getText().toString();
                String time =str;

                System.out.println("goods : " + goods + " company : " + company+ " material1 : " + material1+ " location1 : " + location1+ " material2 : " + material2 + " location2 : " + location2 + " time : " + time);

                String laporan = biodata.updateBiodata(viewId.getText().toString(), editgoods.getText().toString(),
                        editcompany.getText().toString(),editmaterial1.getText().toString(),editlocation1.getText().toString(),
                        editmaterial2.getText().toString(),editlocation2.getText().toString(),time);

                Toast.makeText(ViewActivity.this, laporan, Toast.LENGTH_SHORT).show();

    /* restart acrtivity */
                finish();
                startActivity(getIntent());
            }

        });

        builderEditBiodata.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builderEditBiodata.show();

    }
    public void tambahBiodata() {
  /* layout akan ditampilkan pada AlertDialog */
        LinearLayout layoutInput = new LinearLayout(this);
        layoutInput.setOrientation(LinearLayout.VERTICAL);

        final EditText editid = new EditText(this);
        editid.setHint("id");
        layoutInput.addView(editid);

        final EditText editgoods = new EditText(this);
        editgoods.setHint("goods");
        layoutInput.addView(editgoods);

        final EditText editcompany = new EditText(this);
        editcompany.setHint("company");
        layoutInput.addView(editcompany);

        final EditText editmaterial1 = new EditText(this);
        editmaterial1.setHint("material1");
        layoutInput.addView(editmaterial1);

        final EditText editlocation1 = new EditText(this);
        editlocation1.setHint("location1");
        layoutInput.addView(editlocation1);

        final EditText editmaterial2 = new EditText(this);
        editmaterial2.setHint("material2");
        layoutInput.addView(editmaterial2);

        final EditText editlocation2 = new EditText(this);
        editlocation2.setHint("location2");
        layoutInput.addView(editlocation2);



        AlertDialog.Builder builderInsertBiodata = new AlertDialog.Builder(this);
        //builderInsertBiodata.setIcon(R.drawable.batagrams);
        builderInsertBiodata.setTitle("Insert data");
        builderInsertBiodata.setView(layoutInput);
        builderInsertBiodata.setPositiveButton("Insert", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                /*tabelBiodata.addView(barisTabel2, new TableLayout.LayoutParams(LayoutParams.MATCH_PARENT,
                        LayoutParams.MATCH_PARENT));*/
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HH.mm..ss");
                Date curDate = new Date(System.currentTimeMillis()) ; // 獲取當前時間
                String str = formatter.format(curDate);

                String goods = editgoods.getText().toString();
                String company = editcompany.getText().toString();
                String material1 = editmaterial1.getText().toString();
                String location1 = editlocation1.getText().toString();
                String material2 = editmaterial2.getText().toString();
                String location2 = editlocation2.getText().toString();
                String time =str;
                String id = editid.getText().toString();
                System.out.println("goods : " + goods + " company : " + company+ " material1 : " + material1+ " location1 : " + location1+ " material2 : " + material2+ " location2 : " + location2+ " time : " + time);

                String laporan = biodata.inserBiodata(id, goods, company, material1,location1,material2,location2,time);

                Toast.makeText(ViewActivity.this, laporan, Toast.LENGTH_SHORT).show();

    /* restart acrtivity */
                finish();
                startActivity(getIntent());
            }

        });

        builderInsertBiodata.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        builderInsertBiodata.show();
    }


}
