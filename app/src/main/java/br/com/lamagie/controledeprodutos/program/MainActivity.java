package br.com.lamagie.controledeprodutos.program;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import br.com.lamagie.controledeprodutos.R;
import br.com.lamagie.controledeprodutos.entities.Product;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mViewHolder.confirmButton = findViewById(R.id.confirmButton);
        this.mViewHolder.confirmButton.setOnClickListener(this);
        this.mViewHolder.productName = findViewById(R.id.productName);
        this.mViewHolder.productPrice = findViewById(R.id.productPrice);
        this.mViewHolder.productQuantity = findViewById(R.id.productQuantity);
        this.mViewHolder.textName = findViewById(R.id.textName);
        this.mViewHolder.textPrice = findViewById(R.id.textPrice);
        this.mViewHolder.textQuantity = findViewById(R.id.textQuantity);
    }

    @Override
    public void onClick(View v) {
            String prodName = mViewHolder.productName.getText().toString();
            Double prodPrice = Double.parseDouble(mViewHolder.productPrice.getText().toString());
            int prodQuantity = Integer.parseInt(mViewHolder.productQuantity.getText().toString());
            Product product = new Product(prodName,prodPrice,prodQuantity);
            mViewHolder.textName.setText(product.getName());
            mViewHolder.textPrice.setText(String.valueOf(product.getPrice()));
            mViewHolder.textQuantity.setText(String.valueOf(product.getQuantity()));

    }

    private static class ViewHolder{
        EditText productName;
        EditText productPrice;
        EditText productQuantity;
        Button confirmButton;
        TextView textName, textPrice, textQuantity;
    }
}
