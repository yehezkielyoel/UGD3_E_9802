package com.smith.ugd3_y_xxxx;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.smith.ugd3_y_xxxx.databinding.AdapterRecyclerViewBinding;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private List<Mahasiswa> mahasiswa ;

    public RecyclerViewAdapter(Context context,List<Mahasiswa> mahasiswa) {
        this.context = context;
        this.mahasiswa = mahasiswa;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        AdapterRecyclerViewBinding adapterRecyclerViewBinding = DataBindingUtil.inflate(inflater,
                R.layout.adapter_recycler_view, parent, false);
        return new ViewHolder(adapterRecyclerViewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Mahasiswa MHS = mahasiswa.get(position);
        holder.adapterRecyclerViewBinding.setMhs(MHS);
        //holder.adapterRecyclerViewBinding.tvNpm.setText(mahasiswa.get(position).getNpm());
        //holder.adapterRecyclerViewBinding.tvNama.setText(mahasiswa.get(position).getNama());
        //holder.adapterRecyclerViewBinding.tvFakultas.setText(mahasiswa.get(position).getFakultas());
        //holder.adapterRecyclerViewBinding.tvJurusan.setText(mahasiswa.get(position).getJurusan());
        //holder.adapterRecyclerViewBinding.tvIpk.setText(String.valueOf(mahasiswa.get(position).getIpk()));
        //holder.adapterRecyclerViewBinding.tvHobi.setText(mahasiswa.get(position).getHobi());
    }

    @Override
    public int getItemCount() {
        return mahasiswa.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        AdapterRecyclerViewBinding adapterRecyclerViewBinding;


        public ViewHolder(@NonNull AdapterRecyclerViewBinding adapterRecyclerViewBinding) {
            super(adapterRecyclerViewBinding.getRoot());
            this.adapterRecyclerViewBinding = adapterRecyclerViewBinding;

        }
    }


}