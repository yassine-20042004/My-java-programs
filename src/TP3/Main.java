package TP3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Vehicule> vlist= new ArrayList<Vehicule>();
        vlist.add(new Voiture("oppel",5));
        vlist.add(new Voiture("ford",5));
        vlist.add(new Moto("z750",4));
        vlist.add(new Moto("cbr",5));
        vlist.add(new Vehicule("volvo"));
        vlist.add(new Vehicule("bmw"));
        
        for(Vehicule v: vlist)
        {
        	v.affichedetails();
        }
        
        int nombremoto=0;
        int nombrevoiture=0;
        
        for(Vehicule v: vlist)
        {
        	if(v instanceof Voiture)
        	{
        		nombrevoiture++;
        	}
        	else if(v instanceof Moto)
        	{
        		nombremoto++;
        	}	
        		
        }
        System.out.println(nombrevoiture);
        System.out.println(nombremoto);
        
        for(Vehicule v: vlist)
        {
        	if(v instanceof Voiture)
        	{
        		((Voiture) v).getNombreportes();
        	}
        		
        		
        }
	}

	

}
