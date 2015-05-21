package com.example.practica3;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private ListView lista;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ArrayList<Libro> datos = new ArrayList<Libro>();  
        
        datos.add(new Libro(R.drawable.im_9788415601432, "MOBY DICK", "Cl�sico entre los cl�sicos, intensa, desmesurada, erudita, fascinante, polif�nica� Pocas obras podr�an reunir m�s m�ritos que Moby Dick �por su car�cter tit�nico, aglutinante y fundacional� para aspirar al ansiado trono de ''la gran novela americana''. Un libro que, como el propio leviatan que atraviesa sus p�ginas, es monstruoso, intempestivo y sublime. ''Llamadme Ismael'', el c�lebre �ncipit de la obra maestra de Melville, act�a ya como un hechizo, y la lectura se ... "));
        datos.add(new Libro(R.drawable.im_1165157081, "ISRAEL POTTER", "Israel Potter es la historia de un pobre hombre, luchador por las libertades de los estados americanos que de manera rocambolesca llega a Inglaterra a finales del siglo XVIII. All� conoce a un arist�crata para el que trabaja, cuida de los jardines del rey Jorge, sirve de esp�a de Benjam�n Franklin, y se enrola a las �rdenes de Ethan Allen y del pirata John Paul Jones. "));
        datos.add(new Libro(R.drawable.im_1165157174, "VIAJAR", "Herman Melville, uno de los autores m�s venerados de la literatura americana y universal, no tuvo en vida el reconocimiento que mereci�. Esta es una peque�a e inestimable introducci�n al viaje, que nos habla de sus grandezas y servidumbres, de la filosof�a con que debe acometerse."));
        datos.add(new Libro(R.drawable.im_11651233336, "MIRREYNATO: LA OTRA DESIGUALDAD ","Las redes sociales y los medios de comunicaci�n dan cuenta de su ostentosa presencia en la realidad mexicana: viajan en aviones particulares con sus perros, celebran con exceso, ordenan cerrar un negocio porque no los atienden como creen merecer, maltratan e insultan con violencia a todo aquel que se atreve a increparlos o se�alar justamente alguna de sus faltas; se consideran superiores y su necesidad por demostrarlo no escatima en exhibicionismo ...  "));
        datos.add(new Libro(R.drawable.im_116519243, "EL OTRO M�XICO ","Un fascinante viaje al coraz�n de una regi�n poco explorada. Comienza en la garita de San Ysidro y por la carretera transpeninsular recorre Baja California, se adentra por buena parte de Sinaloa y Durango, contin�a hacia el norte por el Camino Real de Tierra Adentro, rumbo a Chihuahua, para concluir en Ciudad Ju�rez y El Paso. Ricardo Raphael nos gu�a por un universo extraordinario en un trayecto lleno de relatos igualmente ...  "));
        datos.add(new Libro(R.drawable.im_1165172879, "LOS SOCIOS DE ELBA ESTHER: EL LIBRO QUE ADELANTO LA CAIDA DE LA MAESTRA ","A partir de la maniobra de Carlos salinas de Gortari para imponer como l�der del sindicato nacional de trabajadores de la educaci�n (SNTE) a Elba Esther Gordillo morales, el poder de -la maestra- no dej� de crecer. Ella contaba con la red m�s eficaz de operadores territoriales; administraba, sin rendirle cuentas a nadie, cuantiosos recursos econ�micos; fue la dirigente de la federaci�n m�s grande de trabajadores al servicio del estado; gobern� ...  "));
        datos.add(new Libro(R.drawable.im_9786073128087, "CINCUENTA SOMBRAS DE GREY: EDICION DE PELICULA ","La rom�ntica, sensual, er�tica y totalmente adictiva historia de la apasionada relaci�n entre una estudiante universitaria y un joven multimillonario. Cuando la estudiante de Literatura Anastasia Steele recibe el encargo de entrevistar al exitoso y joven empresario Christian Grey, queda impresionada al encontrarse ante un hombre atractivo, seductor y tambi�n muy intimidante. La inexperta e inocente Ana intenta olvidarle, pero pronto comprende cu�nto le desea. Cuando la pareja por fin inicia una ...  "));
        datos.add(new Libro(R.drawable.im_1165156697, "CINCUENTA SOMBRAS MAS OSCURAS ","Intimidada por las peculiares pr�cticas er�ticas y los oscuros secretos del atractivo y atormentado empresario Christian Grey, Anastasia Steele decide romper con �l y embarcarse en una nueva carrera profesional en una editorial de Seattle. Pero el deseo por Christian todav�a domina cada uno de sus pensamientos, y cuando finalmente �l le propone retomar su aventura, Ana no puede resistirse. Reanudan entonces su t�rrida y sensual relaci�n, pero mientras Christian lucha ...  "));
        datos.add(new Libro(R.drawable.im_1165157328, "QUIEREME BIEN ","Antes de consumar la evoluci�n a mujer adulta Lena Balboa existe en dos planos del tiempo. En el primero tiene diecinueve a�os y est� en segundo semestre de la carrera de psicolog�a. En el segundo reci�n cumpli� los trece y est� comenzando primero de secundaria. Dos tiempos simult�neos narrados por Elena desde su presente; una realidad que, de un cap�tulo a otro, nos llevar� por todo tipo de experiencias que ...  "));
        datos.add(new Libro(R.drawable.im_1165182311, "MAL ACOMPA�ADAS ","Ana� L�pez, autora del fen�meno editorial Qui�reme cinco minutos y su secuela, Qui�reme si te atreves, nos presenta en este volumen dos cuentos con un eje en com�n: la soledad cuando se es mujer y ya no tan joven. \n�Qu� tan terrible es atravesar una segunda adolescencia cuando no se tiene una pareja, y s� muchas ganas de tener novio? �sta es la realidad de Clarisa, una eficiente enfermera a quien le ...  "));
        
        lista = (ListView) findViewById(R.id.ListView_listado);
        lista.setAdapter(new LibrosAdapter(this, R.layout.listview_item, datos){
			@Override
			public void onEntrada(Object listview_item, View view) {
		        if (listview_item != null) {
		            TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textView_superior); 
		            if (texto_superior_entrada != null) 
		            	texto_superior_entrada.setText(((Libro) listview_item).get_textoEncima()); 
		              
		            TextView texto_inferior_entrada = (TextView) view.findViewById(R.id.textView_inferior); 
		            if (texto_inferior_entrada != null)
		            	texto_inferior_entrada.setText(((Libro) listview_item).get_textoDebajo()); 
		              
		            ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imageView_imagen); 
		            if (imagen_entrada != null)
		            	imagen_entrada.setImageResource(((Libro) listview_item).get_idImagen());
		        }
			}
		});
        
        lista.setOnItemClickListener(new OnItemClickListener() { 
			@Override
			public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
				Libro elegido = (Libro) pariente.getItemAtPosition(posicion); 
                
                CharSequence texto = "Abriendo: " + elegido.get_textoEncima();
                Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                toast.show();

                nuevo(pariente,view,posicion,id);
			}
        });

    }
    public void nuevo(AdapterView<?> pariente, View view, int posicion, long id){
    	Intent intent = new Intent(this, ItemActivity.class );
    	Libro item = (Libro) lista.getAdapter().getItem(posicion);
    	intent.putExtra("imagen",item.get_idImagen());
    	intent.putExtra("debajo",item.get_textoDebajo().toString());
    	intent.putExtra("encima",item.get_textoEncima().toString()); 
        startActivity(intent);
 
    }
}

