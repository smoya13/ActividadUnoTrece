package ejemplo.smoya.actividad13;

import android.app.Person;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

// Aqui van los elementos a mostrar en el RecyclerView
public class AdaptadorPersonajes extends RecyclerView.Adapter<AdaptadorPersonajes.ViewHolderPersonajes> {

    // Genero la lista de PersonajeVo
    ArrayList<PersonajeVo> listaPersonajes;

    // Constructor de lista personajes para llamarla más adelante
    public AdaptadorPersonajes(ArrayList<PersonajeVo> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }
    @NonNull
    @Override
    public ViewHolderPersonajes onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view, null, false); // Llamo al layout item_list_view
        return new ViewHolderPersonajes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersonajes holder, int position) {
        holder.txtTitulo.setText(listaPersonajes.get(position).getNombre());
        holder.txtDescripcion.setText(listaPersonajes.get(position).getInfo());
        holder.foto.setImageResource(listaPersonajes.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }

    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {
        // Variables
        TextView txtTitulo, txtDescripcion;
        ImageView foto;

        public ViewHolderPersonajes(@NonNull View itemView) {
            super(itemView);
            txtTitulo = itemView.findViewById(R.id.txtTitulo);
            txtDescripcion = itemView.findViewById(R.id.txtDescripcion);
            foto = itemView.findViewById(R.id.imgItem);
        }
    }
}
