package com.example.administrator.aa;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnTouchListener{


    private EditText edit;
    private Button button;

    private int [] temp={1,2,6,7,2,5,8,1};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = (EditText) findViewById(R.id.edit);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        button.setOnTouchListener(this);






        int[] sort = sort(temp, 8);
        for (int i=0;i<sort.length;i++){
            Log.i("tag",""+sort[i]);
        }


        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://gank.io/api/data/")
                .addConverterFactory(GsonConverterFactory.create())
               .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
               .build();


        RxGankService rxGankService = retrofit.create(RxGankService.class);
        Observable<GankResultBean> androidData = rxGankService.getAndroidData(1);

        Log.i("tag","----------"+androidData.toString());



        androidData.subscribeOn(Schedulers.io())
//                     .observeOn(AndroidSchedulers.mainThread())
               .subscribe(new Subscriber<GankResultBean>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(GankResultBean gankResultBean) {
                System.out.println("---------"+gankResultBean.toString());
                Log.i("tag","----------"+gankResultBean.toString());
                List<ResultsBean> results = gankResultBean.getResults();
                Log.i("tag","----------"+results.size());

            }
        });


        Observable<List<GankResultBean>> listObservable = androidData.toList();

        System.out.println("---------"+listObservable);

        System.out.println("---------"+androidData.toString().toString());

        button.setOnClickListener(new View.OnClickListener() {
                        @Override
                       public void onClick(View arg0) {
                                // TODO Auto-generated method stub
                               //打开第二个Activity
                              Intent intent = new Intent(MainActivity.this,TestAndroid6Activity.class);
                                intent.putExtra("test", edit.getText().toString());
                              startActivityForResult(intent, 0);
                           }
                   });




    }

//    @Override
//       protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//              // TODO Auto-generated method stub
//               super.onActivityResult(requestCode, resultCode, data);
//              if(requestCode == 0){
//                        edit.setText(data.getStringExtra("return"));
//                  }
//          }


    @Override
    public void onClick(View view) {
        Log.i("tag","onclick消费了"+view);

    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Log.i("tag","onTouch消费了"+motionEvent.getAction()+" --"+view);
        return false;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.i("tag","onTouchEvent消费了"+event.getAction());
        super.dispatchTouchEvent(event);

        return super.onTouchEvent(event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {

        Log.i("tag", "dispatchTouchEvent-- action=" + ev.getAction());

        return super.dispatchTouchEvent(ev);
    }



       public   int [] sort(int a[],int n){
        for (int i=0;i<n-1;i++)
            for (int j=0;j<n-i-1;j++) {
                if (a[j]>a[j+1]) // 这里是从大到小排序，如果是从小到大排序，只需将“<”换成“>”
                {
                    int temp;
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
           return a;
    }


}
