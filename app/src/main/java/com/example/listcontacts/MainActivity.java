package com.example.listcontacts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    private ImageView img;
    private FloatingActionButton BtnNuevo;
//    private String[] nombres = {"Luis", "Juan", "Pedro"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);
        BtnNuevo = findViewById(R.id.nuevo);
        devolverArray();
//        ArrayAdapter<String> adapter;
//        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombres);
//        list.setAdapter(adapter);
        ArrayList<Contact> listContact = new ArrayList<Contact>();
        llenarDatos(listContact);

        ContactAdapter adapter = new ContactAdapter(this, listContact);
        list.setAdapter(adapter);

        BtnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SaveContact.class);
                startActivity(intent);
            }
        });

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Contact selectItem = (Contact) adapter.getItem(position);

                Toast toast = Toast.makeText(MainActivity.this, "Posición: " + position +", id: "+  id, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();

                Intent intent = new Intent(MainActivity.this, DetailContact.class);
                intent.putExtra("nombre", selectItem.getNombre());
                intent.putExtra("ciudad", selectItem.getCiudad());
                intent.putExtra("descripcion", selectItem.getDescripcion());
                intent.putExtra("foto", selectItem.getFoto()+"");
                intent.putExtra("numero", selectItem.getNumero());
                startActivity(intent);

            }
        });
    }

    private void llenarDatos(ArrayList<Contact> list){

        Contact contact1 = new Contact();
        contact1.setNombre("Luis Castro");
        contact1.setNumero("0997746084");
        contact1.setFoto("https://bit.ly/3DOEgiG");
        contact1.setCiudad("Loja");
        contact1.setDescripcion("Amigo");

        Contact contact2 = new Contact();
        contact2.setNombre("Juan Pérez");
        contact2.setNumero("0997746084");
        contact2.setFoto("https://bit.ly/3jNTqge");
        contact2.setCiudad("Quito");
        contact2.setDescripcion("Familiar");

        Contact contact3 = new Contact();
        contact3.setNombre("Pedro Fernandéz");
        contact3.setNumero("0997746084");
        contact3.setFoto("https://bit.ly/3BRdRza");
        contact3.setCiudad("Guayaquil");
        contact3.setDescripcion("Laboral");

        Contact contact4 = new Contact();
        contact4.setNombre("Luisa Benita");
        contact4.setNumero("0990827375");
        contact4.setFoto("https://bit.ly/38OOy4a");
        contact4.setCiudad("Cuenca");
        contact4.setDescripcion("Amigo");

        Contact contact5 = new Contact();
        contact5.setNombre("Billie Eilish");
        contact5.setNumero("0995634872");
        contact5.setFoto("https://bit.ly/3hbUOrr");
        contact5.setCiudad("California");
        contact5.setDescripcion("Cantante");

        list.add(contact1);
        list.add(contact2);
        list.add(contact3);
        list.add(contact4);
        list.add(contact5);

    }
    public void devolverArray(){
//        Scanner scn = new Scanner(System.in);
//        //crear un método que me devuelva el arreglo de objetos de tipo contact
//        Contact contacto[] = new Contact[2];
//        String nombre;
//        String numero;
//        for (int i=0; i<contacto.length; i++){
//            System.out.println("Nuevo contacto");
//            System.out.println("Ingrese el nombre: ");
//            nombre = scn.next();
//            System.out.println("Ingrese el número: ");
//            numero = scn.next();
//        }
//        Contact contacto[] = {new Contact("Juana", "0997746084"),
//                new Contact("Pepe", "0997746084"),
//                new Contact("Luisa", "0997746084"),};
//
//        for(int i = 0;i<contacto.length;i++) {
//            System.out.println(contacto[i]);
//
//        }
    }
//    adapter = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.listView, contacto);
//            list.setAdapter(adapter);
}