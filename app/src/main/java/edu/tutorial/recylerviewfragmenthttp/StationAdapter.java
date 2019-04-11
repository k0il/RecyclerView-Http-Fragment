package edu.tutorial.recylerviewfragmenthttp;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class StationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final List<Object> recyclerViewItems;
    private final Context mContext;
    Fragment_one fragmentone;


    public StationAdapter(Context context, List<Object> recyclerViewItems,Fragment_one fragmentone) {
        this.mContext = context;
        this.recyclerViewItems = recyclerViewItems;
        this.fragmentone = fragmentone;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_station, null);
        return new MenuItemViewHolder(itemLayoutView);
    }



    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder,final int position) {

        MenuItemViewHolder menuItemHolder = (MenuItemViewHolder) holder;
        final StationItem fp = (StationItem) recyclerViewItems.get(position);

        menuItemHolder.titles.setText(fp.getTitle());
        menuItemHolder.profile.setText(fp.getProfiles());
        String url = fp.getUrlimages();
        Picasso.get().load(url).into(menuItemHolder.thumb);

        menuItemHolder.thumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentone.clikcData(fp.getTitle());

            }
        });

        menuItemHolder.titles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                fragmentone.clikcData(fp.getTitle());
            }
        });
    }


    @Override
    public int getItemCount() {
        return recyclerViewItems.size();
    }


    public class MenuItemViewHolder extends RecyclerView.ViewHolder {
        public TextView titles;
        public ImageView thumb;
        public TextView profile;
        public LinearLayout lineLayout;

        MenuItemViewHolder(View itemLayoutView) {
            super(itemLayoutView);

            titles      = (TextView) itemLayoutView.findViewById(R.id.title);
            thumb       = (ImageView) itemLayoutView.findViewById(R.id.imgthumb);
            profile     = (TextView) itemLayoutView.findViewById(R.id.profiles);
            lineLayout = (LinearLayout) itemLayoutView.findViewById(R.id.midlelayout);


        }
    }


}
