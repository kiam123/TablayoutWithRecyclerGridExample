package ncku.edu.tw.tablayoutwithrecyclergridexample;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomePageAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context mContext;
    ArrayList arrayList;

    public HomePageAdapter(Context context){
        mContext = context;
        arrayList = new ArrayList<HomeItem>();
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new HomePageViewHolder(LayoutInflater.from(mContext).
                inflate(R.layout.recycler_view_home, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        HomeItem homeItem = (HomeItem) arrayList.get(position);
        bindToHomePage(homeItem);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public void bindToHomePage(HomeItem homeItem){

    }

    public void addItem(HomeItem homeItem){
        arrayList.add(homeItem);
        notifyDataSetChanged();
    }

    class HomePageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public HomePageViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.v("Test", "123");
            int page = getLayoutPosition();

            if(page == 0) {
                Intent intent = new Intent(mContext, Page1.class);
                mContext.startActivity(intent);
            } else if(page == 1) {
                Intent intent = new Intent(mContext, Page2.class);
                mContext.startActivity(intent);
            } else if(page == 2) {
                Intent intent = new Intent(mContext, Page3.class);
                mContext.startActivity(intent);
            } else if(page == 3) {
                Intent intent = new Intent(mContext, Page4.class);
                mContext.startActivity(intent);
            }

        }
    }
}
