package pl.devant.myapplication;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pl.devant.myapplication.model.Data;
import pl.devant.myapplication.model.Transport;

/**
 * Created by thomas on 03.03.18.
 */

public class DataArrayAdapter<T> extends ArrayAdapter<T>{
    private Context context;
    private List<T> dataList;


    public DataArrayAdapter(Context context, int resource, ArrayList<T> objects) {
        super(context, resource, objects);

        this.context = context;
        this.dataList = objects;
    }


    public View getView(int position, View convertView, ViewGroup parent) {


        T data = dataList.get(position);


        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_item, null);

        TextView name = (TextView) view.findViewById(R.id.name);
        TextView label = (TextView) view.findViewById(R.id.label);
        TextView rating = (TextView) view.findViewById(R.id.rating);
        TextView distance = (TextView) view.findViewById(R.id.distance);
        TextView description = (TextView) view.findViewById(R.id.description);
        ImageView image = (ImageView) view.findViewById(R.id.image);


        name.setText(((Data)data).getName());
        label.setText(((Data)data).getLabel());
        rating.setText(((Data)data).getRating());
        distance.setText(((Data)data).getDistance());
        description.setText("");

        int imageID = context.getResources().getIdentifier(((Data)data).getImage(), "drawable", context.getPackageName());
        image.setImageResource(imageID);

        return view;
    }
}
