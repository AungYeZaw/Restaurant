package com.creative_webstudio.restaurant;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RestaurantListAdapter extends RecyclerView.Adapter<RestaurantListAdapter.ViewHolderRestaurant>{

    Context context;
    RestaurantDelegate mDelegate;

    public RestaurantListAdapter(Context context, RestaurantDelegate mDelegate) {
        this.context=context;
        this.mDelegate = mDelegate;
    }

    @NonNull
    @Override
    public ViewHolderRestaurant onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.view_holer_restaurant,viewGroup,false);
        ViewHolderRestaurant vH = new ViewHolderRestaurant(v,mDelegate);
        return vH;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderRestaurant viewHolderRestaurant, int i) {
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public class ViewHolderRestaurant extends RecyclerView.ViewHolder implements View.OnClickListener {

        RestaurantDelegate delegate;
        public ViewHolderRestaurant(@NonNull View itemView,RestaurantDelegate delegate) {
            super(itemView);
            this.delegate=delegate;
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            delegate.clickRestaurant();
        }
    }

}
