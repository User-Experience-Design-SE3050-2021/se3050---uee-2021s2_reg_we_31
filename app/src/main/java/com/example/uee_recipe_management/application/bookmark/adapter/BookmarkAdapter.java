package com.example.uee_recipe_management.application.bookmark.adapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.uee_recipe_management.application.R;
import com.example.uee_recipe_management.application.bookmark.model.RecipieItem;
import java.util.List;

public class BookmarkAdapter extends RecyclerView.Adapter<BookmarkAdapter.ViewHolder>{

    List<String> titles;
    List<Integer> images;
    LayoutInflater inflater;
    private List<RecipieItem> recipeSearchItems;
    boolean checkItem = false;

    public BookmarkAdapter(Context ctx, List<String> titles, List<Integer> images){
        this.titles = titles;
        this.images = images;
        this.inflater = LayoutInflater.from(ctx);
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.recipie_carditem_new_2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final String postKey = getRef(position);
        holder.title.setText(titles.get(position));
        holder.gridIcon.setImageResource(images.get(position));


//        holder.fvrt_btn.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                fvrtChecker = true;
////                fvrtref.addValueEventListener(new ValueEventListener() {
////                    @Override
////                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
////                        if(fvrtChecker.equals(true)){
//////                            if(dataSnapshot.child(postKey).hasChild(cu))
////                        }
////                    }
////
////                    @Override
////                    public void onCancelled(@NonNull DatabaseError databaseError) {
////
////                    }
////                })
//            }
//        });

    }

    private String getRef(int position) {
        return null;
    }

    @Override
    public int getItemCount() {
        return titles.size();
    }

    public void filterList(List<String>  filteredList){
        titles = filteredList;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView description;
        ImageView gridIcon;
        ImageButton fvrt_btn;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleTv);
            description = itemView.findViewById(R.id.descriptionTv);
            gridIcon = itemView.findViewById(R.id.bannerIv);
            fvrt_btn = itemView.findViewById(R.id.fvrt_f2_item);

            fvrt_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    System.out.println("CALLING" + title.getText().toString());

                    if(title.getText().toString().contains("First Item")){
                        checkItem = true;
                    }
                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Clicked -> " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                }
            });
        }


//        public void setLikesButtonStatus(final String postKey){
//            fvrt_btn = itemView.findViewById(R.id.fvrt_f2_item);
//            likesref = FirebaseDatabase.getInstance().getReference("likes");
////            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
//            String likes = "likes";
//
//            likesref.addValueEventListener(new ValueEventListener() {
//                @Override
//                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
////                    if(dataSnapshot.child(postKey))
//                }
//
//                @Override
//                public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                }
//            });
//
//        }


    }
}
