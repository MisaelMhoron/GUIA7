package modelo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.dev4u.hv.guia7.R;

import java.util.List;

/**
 * Created by admin on 17/11/17.
 */

public class AdaptadorCategoria extends ArrayAdapter<Categoria>{

    public AdaptadorCategoria(Context context, List<Categoria> objects) {
        super(context, 0, objects);
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obteniendo el dato
        Categoria contacto = getItem(position);
        //TODO inicializando el layout correspondiente al item (Categoria)
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_categoria, parent, false);
        }
        TextView lblNombre = (TextView) convertView.findViewById(R.id.lblNombre_cat);
        TextView lblId_cat = (TextView) convertView.findViewById(R.id.lblId_cat);
        // mostrar los datos
        lblNombre.setText(contacto.getNombre());
        lblId_cat.setText(contacto.getId_categoria());
        // Return la convertView ya con los datos
        return convertView;
    }
}
