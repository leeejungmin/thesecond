package com.example.dlwjd.thesecond;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by dlwjd on 2017-11-29.
 */

public class Adapter extends PagerAdapter {

    private int[] images = {R.drawable.imageun, R.drawable.imagedeux, R.drawable.imagetrois};
    private LayoutInflater inflater;
    private Context context;
    /// faire un formulaire de classe d'adaptateur

    public Adapter(Context context){
        this.context = context;
    }




    @Override
    public int getCount() {


        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        //en tournant linéaire, il peut vérifier qu'il est en vue ou non

        return view == ((android.support.constraint.ConstraintLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        //// this is resetting for premier


        inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.slider,container, false);
        ImageView imageView = v.findViewById(R.id.imageView);
        /// appelez simplement la vue d'image que j'ai faite avant qu'elle ait l'id ..
        TextView textView = v.findViewById(R.id.textView);
        /// peut choisir ce que j'ai appelé imageview
        imageView.setImageResource(images[position]);
        textView.setText((position+1)+"sequence IMAGE");
        /// ajouter une image au conteneur
        container.addView(v);
        return v;



    }

    @Override
    /// faire détruire le fabricant
    public void destroyItem(ViewGroup container, int position, Object object){
        container.invalidate();

    }
}
