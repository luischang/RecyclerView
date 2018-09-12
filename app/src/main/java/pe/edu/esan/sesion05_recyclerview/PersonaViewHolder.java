package pe.edu.esan.sesion05_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PersonaViewHolder extends RecyclerView.ViewHolder {

    TextView txtNombre;
    TextView txtAnno;
    ImageView imgFoto;

    PersonaViewHolder(View itemView) {
        super(itemView);
        txtNombre = (TextView) itemView.findViewById(R.id.txtNombre);
        txtAnno = (TextView) itemView.findViewById(R.id.txtAnno);
        imgFoto = (ImageView) itemView.findViewById(R.id.imgFoto);
    }
}