package cn.ucai.fulicenter.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.ucai.fulicenter.R;
import cn.ucai.fulicenter.application.I;
import cn.ucai.fulicenter.ui.view.MFGT;

/**
 * Created by clawpo on 2017/3/27.
 */
public class OrderActivity extends AppCompatActivity {
    @BindView(R.id.tv_common_title)
    TextView mTvCommonTitle;
    @BindView(R.id.ed_order_name)
    EditText mEdOrderName;
    @BindView(R.id.ed_order_phone)
    EditText mEdOrderPhone;
    @BindView(R.id.spin_order_province)
    Spinner mSpinOrderProvince;
    @BindView(R.id.ed_order_street)
    EditText mEdOrderStreet;
    @BindView(R.id.tv_order_price)
    TextView mTvOrderPrice;

    int orderPrice = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        ButterKnife.bind(this);
        orderPrice = getIntent().getIntExtra(I.ORDER_BUY_PRICE,0);
        initView();
    }

    private void initView() {
        mTvCommonTitle.setText("填写收货人地址");
        mTvOrderPrice.setText(String.valueOf(orderPrice));
    }

    @OnClick(R.id.backClickArea)
    public void backArea() {
        MFGT.finish(OrderActivity.this);
    }

    @OnClick(R.id.tv_order_buy)
    public void commitOrder(){

    }
}